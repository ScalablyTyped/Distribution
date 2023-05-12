package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstRedundant extends StObject {
  
  var firstRedundant: IToken
  
  var ruleName: String
}
object FirstRedundant {
  
  inline def apply(firstRedundant: IToken, ruleName: String): FirstRedundant = {
    val __obj = js.Dynamic.literal(firstRedundant = firstRedundant.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstRedundant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstRedundant] (val x: Self) extends AnyVal {
    
    inline def setFirstRedundant(value: IToken): Self = StObject.set(x, "firstRedundant", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
