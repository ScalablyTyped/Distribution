package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInstancePublicPortsRequest extends StObject {
  
  /**
    * The name of the instance for which to open ports.
    */
  var instanceName: ResourceName
  
  /**
    * An array of objects to describe the ports to open for the specified instance.
    */
  var portInfos: PortInfoList
}
object PutInstancePublicPortsRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName, portInfos: PortInfoList): PutInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfos = portInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInstancePublicPortsRequest]
  }
  
  @scala.inline
  implicit class PutInstancePublicPortsRequestMutableBuilder[Self <: PutInstancePublicPortsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInfos(value: PortInfoList): Self = StObject.set(x, "portInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInfosVarargs(value: PortInfo*): Self = StObject.set(x, "portInfos", js.Array(value :_*))
  }
}
