package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait JSXClosingElement_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  var name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_
  
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement
}
object JSXClosingElement_ {
  
  inline def apply(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement_]
  }
  
  extension [Self <: JSXClosingElement_](x: Self) {
    
    inline def setName(value: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
