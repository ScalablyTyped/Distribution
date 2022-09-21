package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointRequest extends StObject {
  
  /**
    * A description of the global endpoint.
    */
  var Description: js.UndefOr[EndpointDescription] = js.undefined
  
  /**
    * Define the event buses used.   The names of the event buses must be identical in each Region. 
    */
  var EventBuses: EndpointEventBusList
  
  /**
    * The name of the global endpoint. For example, "Name":"us-east-2-custom_bus_A-endpoint".
    */
  var Name: EndpointName
  
  /**
    * Enable or disable event replication.
    */
  var ReplicationConfig: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplicationConfig] = js.undefined
  
  /**
    * The ARN of the role used for replication.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Configure the routing policy, including the health check and secondary Region..
    */
  var RoutingConfig: typings.awsSdk.eventbridgeMod.RoutingConfig
}
object CreateEndpointRequest {
  
  inline def apply(EventBuses: EndpointEventBusList, Name: EndpointName, RoutingConfig: RoutingConfig): CreateEndpointRequest = {
    val __obj = js.Dynamic.literal(EventBuses = EventBuses.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoutingConfig = RoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointRequest]
  }
  
  extension [Self <: CreateEndpointRequest](x: Self) {
    
    inline def setDescription(value: EndpointDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBuses(value: EndpointEventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    inline def setEventBusesVarargs(value: EndpointEventBus*): Self = StObject.set(x, "EventBuses", js.Array(value*))
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfig(value: ReplicationConfig): Self = StObject.set(x, "ReplicationConfig", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigUndefined: Self = StObject.set(x, "ReplicationConfig", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRoutingConfig(value: RoutingConfig): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
  }
}
