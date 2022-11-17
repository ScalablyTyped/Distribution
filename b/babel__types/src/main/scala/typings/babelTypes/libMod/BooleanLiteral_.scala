package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteral_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_BooleanLiteral_ : "BooleanLiteral"
  
  var value: Boolean
}
object BooleanLiteral_ {
  
  inline def apply(value: Boolean): BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[BooleanLiteral_]
  }
  
  extension [Self <: BooleanLiteral_](x: Self) {
    
    inline def setType(value: "BooleanLiteral"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
