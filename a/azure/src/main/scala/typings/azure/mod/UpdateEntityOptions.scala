package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEntityOptions extends TimeoutIntervalOptions {
  var checkEtag: js.UndefOr[Boolean] = js.undefined
}

object UpdateEntityOptions {
  @scala.inline
  def apply(
    checkEtag: js.UndefOr[Boolean] = js.undefined,
    locationMode: String = null,
    maximumExecutionTimeInMs: Int | Double = null,
    timeoutIntervalInMs: Int | Double = null
  ): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkEtag)) __obj.updateDynamic("checkEtag")(checkEtag.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityOptions]
  }
}

