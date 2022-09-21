package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingElement
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName
  
  @JSName("type")
  var type_JSXClosingElement: typings.babelTypes.babelTypesStrings.JSXClosingElement
}
object JSXClosingElement {
  
  inline def apply(name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement]
  }
  
  extension [Self <: JSXClosingElement](x: Self) {
    
    inline def setName(value: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
