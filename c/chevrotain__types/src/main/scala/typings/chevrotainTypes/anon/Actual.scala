package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.IToken
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actual extends StObject {
  
  var actual: IToken
  
  var expected: TokenType
  
  var previous: IToken
  
  var ruleName: String
}
object Actual {
  
  inline def apply(actual: IToken, expected: TokenType, previous: IToken, ruleName: String): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
    
    inline def setActual(value: IToken): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setExpected(value: TokenType): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: IToken): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
