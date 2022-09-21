package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXAttribute
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var name: JSXIdentifier | JSXNamespacedName
  
  @JSName("type")
  var type_JSXAttribute: typings.babelTypes.babelTypesStrings.JSXAttribute
  
  var value: js.UndefOr[JSXElement | JSXFragment | StringLiteral_ | JSXExpressionContainer | Null] = js.undefined
}
object JSXAttribute {
  
  inline def apply(name: JSXIdentifier | JSXNamespacedName): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[JSXAttribute]
  }
  
  extension [Self <: JSXAttribute](x: Self) {
    
    inline def setName(value: JSXIdentifier | JSXNamespacedName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JSXElement | JSXFragment | StringLiteral_ | JSXExpressionContainer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
