package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.NumberLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use `NumericLiteral`
  */
trait NumberLiteral1
  extends StObject
     with BaseNode
     with DeprecatedAliases
     with Node {
  
  @JSName("type")
  var type_NumberLiteral1: NumberLiteral
  
  var value: Double
}
object NumberLiteral1 {
  
  inline def apply(value: Double): NumberLiteral1 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[NumberLiteral1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberLiteral1] (val x: Self) extends AnyVal {
    
    inline def setType(value: NumberLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
