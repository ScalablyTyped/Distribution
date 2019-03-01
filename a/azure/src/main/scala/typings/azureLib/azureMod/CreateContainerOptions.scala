package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerOptions extends TimeoutIntervalOptions {
  var metadata: js.UndefOr[StorageMetadata] = js.undefined
  var publicAccessLevel: js.UndefOr[java.lang.String] = js.undefined
}

object CreateContainerOptions {
  @scala.inline
  def apply(
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    metadata: StorageMetadata = null,
    publicAccessLevel: java.lang.String = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
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

