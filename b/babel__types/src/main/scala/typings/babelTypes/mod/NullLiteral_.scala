package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteral_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_NullLiteral_ : "NullLiteral"
}
object NullLiteral_ {
  
  inline def apply(): NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[NullLiteral_]
  }
  
  extension [Self <: NullLiteral_](x: Self) {
    
    inline def setType(value: "NullLiteral"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
