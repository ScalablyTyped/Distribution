package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait JSXNamespacedName_
  extends StObject
     with BaseNode
     with JSX {
  
  var name: JSXIdentifier_
  
  var namespace: JSXIdentifier_
  
  @JSName("type")
  var type_JSXNamespacedName_ : JSXNamespacedName
}
object JSXNamespacedName_ {
  
  inline def apply(name: JSXIdentifier_, namespace: JSXIdentifier_): JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[JSXNamespacedName_]
  }
  
  extension [Self <: JSXNamespacedName_](x: Self) {
    
    inline def setName(value: JSXIdentifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: JSXIdentifier_): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
