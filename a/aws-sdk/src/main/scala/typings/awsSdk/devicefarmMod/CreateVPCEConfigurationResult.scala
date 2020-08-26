package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCEConfigurationResult extends js.Object {
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}

object CreateVPCEConfigurationResult {
  @scala.inline
  def apply(): CreateVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVPCEConfigurationResult]
  }
  @scala.inline
  implicit class CreateVPCEConfigurationResultOps[Self <: CreateVPCEConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVpceConfiguration(value: VPCEConfiguration): Self = this.set("vpceConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpceConfiguration: Self = this.set("vpceConfiguration", js.undefined)
  }
  
}

