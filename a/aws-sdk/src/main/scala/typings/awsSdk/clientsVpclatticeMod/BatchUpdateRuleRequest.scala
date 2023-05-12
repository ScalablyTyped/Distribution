package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateRuleRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
  /**
    * The rules for the specified listener.
    */
  var rules: RuleUpdateList
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object BatchUpdateRuleRequest {
  
  inline def apply(
    listenerIdentifier: ListenerIdentifier,
    rules: RuleUpdateList,
    serviceIdentifier: ServiceIdentifier
  ): BatchUpdateRuleRequest = {
    val __obj = js.Dynamic.literal(listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRules(value: RuleUpdateList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: RuleUpdate*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
