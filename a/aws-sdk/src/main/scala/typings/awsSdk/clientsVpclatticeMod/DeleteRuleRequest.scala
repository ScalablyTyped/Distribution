package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the rule.
    */
  var ruleIdentifier: RuleIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object DeleteRuleRequest {
  
  inline def apply(
    listenerIdentifier: ListenerIdentifier,
    ruleIdentifier: RuleIdentifier,
    serviceIdentifier: ServiceIdentifier
  ): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], ruleIdentifier = ruleIdentifier.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRuleIdentifier(value: RuleIdentifier): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
