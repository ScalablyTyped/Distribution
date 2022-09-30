package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXAttribute__
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var name: JSXIdentifier__ | JSXNamespacedName__
  
  @JSName("type")
  var type_JSXAttribute__ : JSXAttribute
  
  var value: js.UndefOr[JSXElement__ | JSXFragment__ | StringLiteral_ | JSXExpressionContainer__ | Null] = js.undefined
}
object JSXAttribute__ {
  
  inline def apply(name: JSXIdentifier__ | JSXNamespacedName__): JSXAttribute__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[JSXAttribute__]
  }
  
  extension [Self <: JSXAttribute__](x: Self) {
    
    inline def setName(value: JSXIdentifier__ | JSXNamespacedName__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JSXElement__ | JSXFragment__ | StringLiteral_ | JSXExpressionContainer__): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
