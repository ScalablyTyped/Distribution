package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointRequest extends StObject {
  
  /**
    * A description for the endpoint.
    */
  var Description: js.UndefOr[EndpointDescription] = js.undefined
  
  /**
    * Define event buses used for replication.
    */
  var EventBuses: js.UndefOr[EndpointEventBusList] = js.undefined
  
  /**
    * The name of the endpoint you want to update.
    */
  var Name: EndpointName
  
  /**
    * Whether event replication was enabled or disabled by this request.
    */
  var ReplicationConfig: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplicationConfig] = js.undefined
  
  /**
    * The ARN of the role used by event replication for this request.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Configure the routing policy, including the health check and secondary Region..
    */
  var RoutingConfig: js.UndefOr[typings.awsSdk.eventbridgeMod.RoutingConfig] = js.undefined
}
object UpdateEndpointRequest {
  
  inline def apply(Name: EndpointName): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  extension [Self <: UpdateEndpointRequest](x: Self) {
    
    inline def setDescription(value: EndpointDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBuses(value: EndpointEventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    inline def setEventBusesUndefined: Self = StObject.set(x, "EventBuses", js.undefined)
    
    inline def setEventBusesVarargs(value: EndpointEventBus*): Self = StObject.set(x, "EventBuses", js.Array(value*))
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfig(value: ReplicationConfig): Self = StObject.set(x, "ReplicationConfig", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigUndefined: Self = StObject.set(x, "ReplicationConfig", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRoutingConfig(value: RoutingConfig): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
  }
}
