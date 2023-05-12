package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListenerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var arn: js.UndefOr[ListenerArn] = js.undefined
  
  /**
    * The action for the default rule.
    */
  var defaultAction: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The ID of the listener.
    */
  var id: js.UndefOr[ListenerId] = js.undefined
  
  /**
    * The name of the listener.
    */
  var name: js.UndefOr[ListenerName] = js.undefined
  
  /**
    * The port number of the listener.
    */
  var port: js.UndefOr[Port] = js.undefined
  
  /**
    * The protocol of the listener.
    */
  var protocol: js.UndefOr[ListenerProtocol] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var serviceArn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    * The ID of the service.
    */
  var serviceId: js.UndefOr[ServiceId] = js.undefined
}
object CreateListenerResponse {
  
  inline def apply(): CreateListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateListenerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateListenerResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ListenerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDefaultAction(value: RuleAction): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionUndefined: Self = StObject.set(x, "defaultAction", js.undefined)
    
    inline def setId(value: ListenerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ListenerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: ListenerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setServiceArn(value: ServiceArn): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "serviceArn", js.undefined)
    
    inline def setServiceId(value: ServiceId): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
