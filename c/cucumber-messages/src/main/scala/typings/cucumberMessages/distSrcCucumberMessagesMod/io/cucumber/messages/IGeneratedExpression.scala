package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GeneratedExpression. */
trait IGeneratedExpression extends StObject {
  
  /** GeneratedExpression parameterTypeNames */
  var parameterTypeNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** GeneratedExpression text */
  var text: js.UndefOr[String | Null] = js.undefined
}
object IGeneratedExpression {
  
  inline def apply(): IGeneratedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratedExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeneratedExpression] (val x: Self) extends AnyVal {
    
    inline def setParameterTypeNames(value: js.Array[String]): Self = StObject.set(x, "parameterTypeNames", value.asInstanceOf[js.Any])
    
    inline def setParameterTypeNamesNull: Self = StObject.set(x, "parameterTypeNames", null)
    
    inline def setParameterTypeNamesUndefined: Self = StObject.set(x, "parameterTypeNames", js.undefined)
    
    inline def setParameterTypeNamesVarargs(value: String*): Self = StObject.set(x, "parameterTypeNames", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
