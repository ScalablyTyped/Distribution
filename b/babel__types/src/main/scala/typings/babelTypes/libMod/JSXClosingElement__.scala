package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingElement__
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__
  
  @JSName("type")
  var type_JSXClosingElement__ : JSXClosingElement
}
object JSXClosingElement__ {
  
  inline def apply(name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__): JSXClosingElement__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement__]
  }
  
  extension [Self <: JSXClosingElement__](x: Self) {
    
    inline def setName(value: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
