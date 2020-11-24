package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVPCEConfigurationResult extends js.Object {
  
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}
object GetVPCEConfigurationResult {
  
  @scala.inline
  def apply(): GetVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVPCEConfigurationResult]
  }
  
  @scala.inline
  implicit class GetVPCEConfigurationResultOps[Self <: GetVPCEConfigurationResult] (val x: Self) extends AnyVal {
    
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
