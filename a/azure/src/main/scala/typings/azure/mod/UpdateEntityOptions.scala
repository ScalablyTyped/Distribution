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
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkEtag)) __obj.updateDynamic("checkEtag")(checkEtag.get.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityOptions]
  }
}

