package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IToken
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectedIterationPaths extends StObject {
  
  var actual: js.Array[IToken]
  
  var customUserDescription: js.UndefOr[String] = js.undefined
  
  var expectedIterationPaths: js.Array[js.Array[TokenType]]
  
  var previous: IToken
  
  var ruleName: String
}
object ExpectedIterationPaths {
  
  inline def apply(
    actual: js.Array[IToken],
    expectedIterationPaths: js.Array[js.Array[TokenType]],
    previous: IToken,
    ruleName: String
  ): ExpectedIterationPaths = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expectedIterationPaths = expectedIterationPaths.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedIterationPaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpectedIterationPaths] (val x: Self) extends AnyVal {
    
    inline def setActual(value: js.Array[IToken]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualVarargs(value: IToken*): Self = StObject.set(x, "actual", js.Array(value*))
    
    inline def setCustomUserDescription(value: String): Self = StObject.set(x, "customUserDescription", value.asInstanceOf[js.Any])
    
    inline def setCustomUserDescriptionUndefined: Self = StObject.set(x, "customUserDescription", js.undefined)
    
    inline def setExpectedIterationPaths(value: js.Array[js.Array[TokenType]]): Self = StObject.set(x, "expectedIterationPaths", value.asInstanceOf[js.Any])
    
    inline def setExpectedIterationPathsVarargs(value: js.Array[TokenType]*): Self = StObject.set(x, "expectedIterationPaths", js.Array(value*))
    
    inline def setPrevious(value: IToken): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
