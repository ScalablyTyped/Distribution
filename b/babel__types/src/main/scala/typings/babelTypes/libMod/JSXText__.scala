package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXText__
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_JSXText__ : "JSXText"
  
  var value: String
}
object JSXText__ {
  
  inline def apply(value: String): JSXText__ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[JSXText__]
  }
  
  extension [Self <: JSXText__](x: Self) {
    
    inline def setType(value: "JSXText"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
