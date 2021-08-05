package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterInstanceRequest extends StObject {
  
  /**
    * The value that you specified for Id in the RegisterInstance request.
    */
  var InstanceId: ResourceId
  
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId
}
object DeregisterInstanceRequest {
  
  inline def apply(InstanceId: ResourceId, ServiceId: ResourceId): DeregisterInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterInstanceRequest]
  }
  
  extension [Self <: DeregisterInstanceRequest](x: Self) {
    
    inline def setInstanceId(value: ResourceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: ResourceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
