package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait BigIntLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_BigIntLiteral_ : BigIntLiteral
  
  var value: String
}
object BigIntLiteral_ {
  
  inline def apply(value: String): BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[BigIntLiteral_]
  }
  
  extension [Self <: BigIntLiteral_](x: Self) {
    
    inline def setType(value: BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
