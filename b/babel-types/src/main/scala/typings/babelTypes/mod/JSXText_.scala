package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXText_
  extends StObject
     with Node
     with JSX {
  
  @JSName("type")
  var type_JSXText_ : JSXText
  
  var value: String
}
object JSXText_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: String): JSXText_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[JSXText_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXText_] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
