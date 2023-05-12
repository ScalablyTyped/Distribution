package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookaheadValidationError extends StObject {
  
  var message: String
  
  var ruleName: js.UndefOr[String] = js.undefined
}
object ILookaheadValidationError {
  
  inline def apply(message: String): ILookaheadValidationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookaheadValidationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILookaheadValidationError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
  }
}
