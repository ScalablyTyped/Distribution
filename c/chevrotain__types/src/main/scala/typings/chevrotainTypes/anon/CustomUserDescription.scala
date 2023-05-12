package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IToken
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomUserDescription extends StObject {
  
  var actual: js.Array[IToken]
  
  var customUserDescription: js.UndefOr[String] = js.undefined
  
  var expectedPathsPerAlt: js.Array[js.Array[js.Array[TokenType]]]
  
  var previous: IToken
  
  var ruleName: String
}
object CustomUserDescription {
  
  inline def apply(
    actual: js.Array[IToken],
    expectedPathsPerAlt: js.Array[js.Array[js.Array[TokenType]]],
    previous: IToken,
    ruleName: String
  ): CustomUserDescription = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expectedPathsPerAlt = expectedPathsPerAlt.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomUserDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomUserDescription] (val x: Self) extends AnyVal {
    
    inline def setActual(value: js.Array[IToken]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualVarargs(value: IToken*): Self = StObject.set(x, "actual", js.Array(value*))
    
    inline def setCustomUserDescription(value: String): Self = StObject.set(x, "customUserDescription", value.asInstanceOf[js.Any])
    
    inline def setCustomUserDescriptionUndefined: Self = StObject.set(x, "customUserDescription", js.undefined)
    
    inline def setExpectedPathsPerAlt(value: js.Array[js.Array[js.Array[TokenType]]]): Self = StObject.set(x, "expectedPathsPerAlt", value.asInstanceOf[js.Any])
    
    inline def setExpectedPathsPerAltVarargs(value: js.Array[js.Array[TokenType]]*): Self = StObject.set(x, "expectedPathsPerAlt", js.Array(value*))
    
    inline def setPrevious(value: IToken): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
