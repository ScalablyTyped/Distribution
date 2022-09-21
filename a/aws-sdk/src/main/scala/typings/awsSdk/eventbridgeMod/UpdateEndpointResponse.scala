package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointResponse extends StObject {
  
  /**
    * The ARN of the endpoint you updated in this request.
    */
  var Arn: js.UndefOr[EndpointArn] = js.undefined
  
  /**
    * The ID of the endpoint you updated in this request.
    */
  var EndpointId: js.UndefOr[typings.awsSdk.eventbridgeMod.EndpointId] = js.undefined
  
  /**
    * The URL of the endpoint you updated in this request.
    */
  var EndpointUrl: js.UndefOr[typings.awsSdk.eventbridgeMod.EndpointUrl] = js.undefined
  
  /**
    * The event buses used for replication for the endpoint you updated in this request.
    */
  var EventBuses: js.UndefOr[EndpointEventBusList] = js.undefined
  
  /**
    * The name of the endpoint you updated in this request.
    */
  var Name: js.UndefOr[EndpointName] = js.undefined
  
  /**
    * Whether event replication was enabled or disabled for the endpoint you updated in this request.
    */
  var ReplicationConfig: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplicationConfig] = js.undefined
  
  /**
    * The ARN of the role used by event replication for the endpoint you updated in this request.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The routing configuration you updated in this request.
    */
  var RoutingConfig: js.UndefOr[typings.awsSdk.eventbridgeMod.RoutingConfig] = js.undefined
  
  /**
    * The state of the endpoint you updated in this request.
    */
  var State: js.UndefOr[EndpointState] = js.undefined
}
object UpdateEndpointResponse {
  
  inline def apply(): UpdateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndpointResponse]
  }
  
  extension [Self <: UpdateEndpointResponse](x: Self) {
    
    inline def setArn(value: EndpointArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setEndpointId(value: EndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setEndpointUrl(value: EndpointUrl): Self = StObject.set(x, "EndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrlUndefined: Self = StObject.set(x, "EndpointUrl", js.undefined)
    
    inline def setEventBuses(value: EndpointEventBusList): Self = StObject.set(x, "EventBuses", value.asInstanceOf[js.Any])
    
    inline def setEventBusesUndefined: Self = StObject.set(x, "EventBuses", js.undefined)
    
    inline def setEventBusesVarargs(value: EndpointEventBus*): Self = StObject.set(x, "EventBuses", js.Array(value*))
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReplicationConfig(value: ReplicationConfig): Self = StObject.set(x, "ReplicationConfig", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigUndefined: Self = StObject.set(x, "ReplicationConfig", js.undefined)
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRoutingConfig(value: RoutingConfig): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
    
    inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    
    inline def setState(value: EndpointState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
