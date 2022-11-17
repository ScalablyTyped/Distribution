package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalLiteral_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_DecimalLiteral_ : "DecimalLiteral"
  
  var value: String
}
object DecimalLiteral_ {
  
  inline def apply(value: String): DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[DecimalLiteral_]
  }
  
  extension [Self <: DecimalLiteral_](x: Self) {
    
    inline def setType(value: "DecimalLiteral"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
