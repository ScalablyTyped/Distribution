package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXAttribute_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  var name: JSXIdentifier_ | JSXNamespacedName_
  
  @JSName("type")
  var type_JSXAttribute_ : JSXAttribute
  
  var value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_ | Null
}
object JSXAttribute_ {
  
  inline def apply(name: JSXIdentifier_ | JSXNamespacedName_): JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[JSXAttribute_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXAttribute_] (val x: Self) extends AnyVal {
    
    inline def setName(value: JSXIdentifier_ | JSXNamespacedName_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
