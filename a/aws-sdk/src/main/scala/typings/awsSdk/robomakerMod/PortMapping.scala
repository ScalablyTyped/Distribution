package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortMapping extends StObject {
  
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
  implicit class PortMappingMutableBuilder[Self <: PortMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationPort(value: NonSystemPort): Self = StObject.set(x, "applicationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnPublicIp(value: Boolean): Self = StObject.set(x, "enableOnPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableOnPublicIpUndefined: Self = StObject.set(x, "enableOnPublicIp", js.undefined)
    
    @scala.inline
    def setJobPort(value: Port): Self = StObject.set(x, "jobPort", value.asInstanceOf[js.Any])
  }
}
