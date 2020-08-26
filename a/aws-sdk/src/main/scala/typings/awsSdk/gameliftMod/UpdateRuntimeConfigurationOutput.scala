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
  def apply(): UpdateRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuntimeConfigurationOutput]
  }
  @scala.inline
  implicit class UpdateRuntimeConfigurationOutputOps[Self <: UpdateRuntimeConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRuntimeConfiguration(value: RuntimeConfiguration): Self = this.set("RuntimeConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("RuntimeConfiguration", js.undefined)
  }
  
}

