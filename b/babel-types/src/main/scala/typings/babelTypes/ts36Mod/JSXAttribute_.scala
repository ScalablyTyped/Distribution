package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXAttribute_
  extends StObject
     with Node
     with Immutable
     with JSX {
  
  var name: JSXIdentifier_ | JSXNamespacedName_
  
  @JSName("type")
  var type_JSXAttribute_ : JSXAttribute
  
  var value: JSXElement_ | StringLiteral_ | JSXExpressionContainer_ | Null
}
object JSXAttribute_ {
  
  inline def apply(end: Double, loc: SourceLocation, name: JSXIdentifier_ | JSXNamespacedName_, start: Double): JSXAttribute_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[JSXAttribute_]
  }
  
  extension [Self <: JSXAttribute_](x: Self) {
    
    inline def setName(value: JSXIdentifier_ | JSXNamespacedName_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JSXElement_ | StringLiteral_ | JSXExpressionContainer_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
