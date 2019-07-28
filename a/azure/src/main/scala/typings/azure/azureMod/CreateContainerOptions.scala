package typings.azure.azureMod

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
    maximumExecutionTimeInMs: Int | Double = null,
    metadata: StorageMetadata = null,
    publicAccessLevel: String = null,
    timeoutIntervalInMs: Int | Double = null
  ): CreateContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (publicAccessLevel != null) __obj.updateDynamic("publicAccessLevel")(publicAccessLevel)
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerOptions]
  }
}

