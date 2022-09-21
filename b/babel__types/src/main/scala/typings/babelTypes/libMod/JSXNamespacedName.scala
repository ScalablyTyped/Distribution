package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXNamespacedName
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var name: JSXIdentifier
  
  var namespace: JSXIdentifier
  
  @JSName("type")
  var type_JSXNamespacedName: typings.babelTypes.babelTypesStrings.JSXNamespacedName
}
object JSXNamespacedName {
  
  inline def apply(name: JSXIdentifier, namespace: JSXIdentifier): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[JSXNamespacedName]
  }
  
  extension [Self <: JSXNamespacedName](x: Self) {
    
    inline def setName(value: JSXIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: JSXIdentifier): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
