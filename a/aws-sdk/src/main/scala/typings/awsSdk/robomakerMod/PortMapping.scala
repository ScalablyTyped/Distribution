package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortMapping extends js.Object {
  
  /**
    * The port number on the application.
    */
  var applicationPort: NonSystemPort = js.native
  
  /**
    * A Boolean indicating whether to enable this port mapping on public IP.
    */
  var enableOnPublicIp: js.UndefOr[Boolean] = js.native
  
  /**
    * The port number on the simulation job instance to use as a remote connection point. 
    */
  var jobPort: Port = js.native
}
object PortMapping {
  
  @scala.inline
  def apply(applicationPort: NonSystemPort, jobPort: Port): PortMapping = {
    val __obj = js.Dynamic.literal(applicationPort = applicationPort.asInstanceOf[js.Any], jobPort = jobPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
  
  @scala.inline
  implicit class PortMappingOps[Self <: PortMapping] (val x: Self) extends AnyVal {
    
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
    def setApplicationPort(value: NonSystemPort): Self = this.set("applicationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobPort(value: Port): Self = this.set("jobPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnPublicIp(value: Boolean): Self = this.set("enableOnPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableOnPublicIp: Self = this.set("enableOnPublicIp", js.undefined)
  }
}
