package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_StringLiteral_ : "StringLiteral"
  
  var value: String
}
object StringLiteral_ {
  
  inline def apply(value: String): StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral_]
  }
  
  extension [Self <: StringLiteral_](x: Self) {
    
    inline def setType(value: "StringLiteral"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
