package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXText
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  @JSName("type")
  var type_JSXText: typings.babelTypes.babelTypesStrings.JSXText
  
  var value: String
}
object JSXText {
  
  inline def apply(value: String): JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[JSXText]
  }
  
  extension [Self <: JSXText](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
