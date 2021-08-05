package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DecimalLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait DecimalLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_DecimalLiteral_ : DecimalLiteral
  
  var value: String
}
object DecimalLiteral_ {
  
  inline def apply(value: String): DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[DecimalLiteral_]
  }
  
  extension [Self <: DecimalLiteral_](x: Self) {
    
    inline def setType(value: DecimalLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
