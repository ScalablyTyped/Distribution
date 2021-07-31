package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachStaticIpRequest extends StObject {
  
  /**
    * The instance name to which you want to attach the static IP address.
    */
  var instanceName: ResourceName
  
  /**
    * The name of the static IP.
    */
  var staticIpName: ResourceName
}
object AttachStaticIpRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName, staticIpName: ResourceName): AttachStaticIpRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachStaticIpRequest]
  }
  
  @scala.inline
  implicit class AttachStaticIpRequestMutableBuilder[Self <: AttachStaticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
