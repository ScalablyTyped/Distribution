package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListenerRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The action for the default rule. Each listener has a default rule. Each rule consists of a priority, one or more actions, and one or more conditions. The default rule is the rule that's used if no other rules match. Each rule must include exactly one of the following types of actions: forward or fixed-response, and it must be the last action to be performed. 
    */
  var defaultAction: RuleAction
  
  /**
    * The name of the listener. A listener name must be unique within a service. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
    */
  var name: ListenerName
  
  /**
    * The listener port. You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default is 443.
    */
  var port: js.UndefOr[Port] = js.undefined
  
  /**
    * The listener protocol HTTP or HTTPS.
    */
  var protocol: ListenerProtocol
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
  
  /**
    * The tags for the listener.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateListenerRequest {
  
  inline def apply(
    defaultAction: RuleAction,
    name: ListenerName,
    protocol: ListenerProtocol,
    serviceIdentifier: ServiceIdentifier
  ): CreateListenerRequest = {
    val __obj = js.Dynamic.literal(defaultAction = defaultAction.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateListenerRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDefaultAction(value: RuleAction): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
    
    inline def setName(value: ListenerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: ListenerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
