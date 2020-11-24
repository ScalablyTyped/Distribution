package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportClientVpnClientConfigurationResult extends js.Object {
  
  /**
    * The contents of the Client VPN endpoint configuration file.
    */
  var ClientConfiguration: js.UndefOr[String] = js.native
}
object ExportClientVpnClientConfigurationResult {
  
  @scala.inline
  def apply(): ExportClientVpnClientConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientConfigurationResult]
  }
  
  @scala.inline
  implicit class ExportClientVpnClientConfigurationResultOps[Self <: ExportClientVpnClientConfigurationResult] (val x: Self) extends AnyVal {
    
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
    def setClientConfiguration(value: String): Self = this.set("ClientConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientConfiguration: Self = this.set("ClientConfiguration", js.undefined)
  }
}
