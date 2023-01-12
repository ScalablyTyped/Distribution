package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXNamespacedName__
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var name: JSXIdentifier__
  
  var namespace: JSXIdentifier__
  
  @JSName("type")
  var type_JSXNamespacedName__ : JSXNamespacedName
}
object JSXNamespacedName__ {
  
  inline def apply(name: JSXIdentifier__, namespace: JSXIdentifier__): JSXNamespacedName__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[JSXNamespacedName__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXNamespacedName__] (val x: Self) extends AnyVal {
    
    inline def setName(value: JSXIdentifier__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: JSXIdentifier__): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
