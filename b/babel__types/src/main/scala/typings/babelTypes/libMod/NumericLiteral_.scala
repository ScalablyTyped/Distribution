package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with Literal
     with Node
     with Pureish
     with Standardized {
  
  @JSName("type")
  var type_NumericLiteral_ : NumericLiteral
  
  var value: Double
}
object NumericLiteral_ {
  
  inline def apply(value: Double): NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[NumericLiteral_]
  }
  
  extension [Self <: NumericLiteral_](x: Self) {
    
    inline def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
