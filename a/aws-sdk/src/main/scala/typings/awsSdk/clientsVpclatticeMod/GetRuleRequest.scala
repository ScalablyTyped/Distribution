package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener rule.
    */
  var ruleIdentifier: RuleIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object GetRuleRequest {
  
  inline def apply(
    listenerIdentifier: ListenerIdentifier,
    ruleIdentifier: RuleIdentifier,
    serviceIdentifier: ServiceIdentifier
  ): GetRuleRequest = {
    val __obj = js.Dynamic.literal(listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], ruleIdentifier = ruleIdentifier.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRuleIdentifier(value: RuleIdentifier): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
