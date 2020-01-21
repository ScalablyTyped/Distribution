package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuntimeConfigurationOutput extends js.Object {
  /**
    * The runtime configuration currently in force. If the update was successful, this object matches the one in the request.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.RuntimeConfiguration] = js.native
}

object UpdateRuntimeConfigurationOutput {
  @scala.inline
  def apply(RuntimeConfiguration: RuntimeConfiguration = null): UpdateRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (RuntimeConfiguration != null) __obj.updateDynamic("RuntimeConfiguration")(RuntimeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuntimeConfigurationOutput]
  }
}

