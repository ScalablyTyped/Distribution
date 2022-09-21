package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXNamespacedName_
  extends StObject
     with Node
     with JSX {
  
  var name: JSXIdentifier_
  
  var namespace: JSXIdentifier_
  
  @JSName("type")
  var type_JSXNamespacedName_ : JSXNamespacedName
}
object JSXNamespacedName_ {
  
  inline def apply(end: Double, loc: SourceLocation, name: JSXIdentifier_, namespace: JSXIdentifier_, start: Double): JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[JSXNamespacedName_]
  }
  
  extension [Self <: JSXNamespacedName_](x: Self) {
    
    inline def setName(value: JSXIdentifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: JSXIdentifier_): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
