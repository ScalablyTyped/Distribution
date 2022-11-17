package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveLiteral_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_DirectiveLiteral_ : "DirectiveLiteral"
  
  var value: String
}
object DirectiveLiteral_ {
  
  inline def apply(value: String): DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[DirectiveLiteral_]
  }
  
  extension [Self <: DirectiveLiteral_](x: Self) {
    
    inline def setType(value: "DirectiveLiteral"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
