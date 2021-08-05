package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait NumericLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_NumericLiteral_ : NumericLiteral
  
  var value: Double
}
object NumericLiteral_ {
  
  inline def apply(value: Double): NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[NumericLiteral_]
  }
  
  extension [Self <: NumericLiteral_](x: Self) {
    
    inline def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
