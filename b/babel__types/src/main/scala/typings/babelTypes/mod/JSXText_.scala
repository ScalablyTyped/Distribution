package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXText_
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_JSXText_ : "JSXText"
  
  var value: String
}
object JSXText_ {
  
  inline def apply(value: String): JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[JSXText_]
  }
  
  extension [Self <: JSXText_](x: Self) {
    
    inline def setType(value: "JSXText"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
