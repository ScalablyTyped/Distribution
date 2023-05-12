package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleUpdateFailure extends StObject {
  
  /**
    * The failure code.
    */
  var failureCode: js.UndefOr[FailureCode] = js.undefined
  
  /**
    * The failure message.
    */
  var failureMessage: js.UndefOr[FailureMessage] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the rule.
    */
  var ruleIdentifier: js.UndefOr[RuleIdentifier] = js.undefined
}
object RuleUpdateFailure {
  
  inline def apply(): RuleUpdateFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleUpdateFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleUpdateFailure] (val x: Self) extends AnyVal {
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "failureMessage", js.undefined)
    
    inline def setRuleIdentifier(value: RuleIdentifier): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRuleIdentifierUndefined: Self = StObject.set(x, "ruleIdentifier", js.undefined)
  }
}
