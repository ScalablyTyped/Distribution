package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerOptions extends TimeoutIntervalOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
  var publicAccessLevel: js.UndefOr[String] = js.undefined
}

object CreateContainerOptions {
  @scala.inline
  def apply(
    locationMode: String = null,
    maximumExecutionTimeInMs: js.UndefOr[Double] = js.undefined,
    metadata: StorageMetadata = null,
    publicAccessLevel: String = null,
    timeoutIntervalInMs: js.UndefOr[Double] = js.undefined
  ): CreateContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumExecutionTimeInMs)) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (publicAccessLevel != null) __obj.updateDynamic("publicAccessLevel")(publicAccessLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIntervalInMs)) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerOptions]
  }
}

