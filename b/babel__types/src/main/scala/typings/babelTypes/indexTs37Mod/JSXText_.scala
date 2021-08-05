package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait JSXText_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  @JSName("type")
  var type_JSXText_ : JSXText
  
  var value: String
}
object JSXText_ {
  
  inline def apply(value: String): JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[JSXText_]
  }
  
  extension [Self <: JSXText_](x: Self) {
    
    inline def setType(value: JSXText): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
