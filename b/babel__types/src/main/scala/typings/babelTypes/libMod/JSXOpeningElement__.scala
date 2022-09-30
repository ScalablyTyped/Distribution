package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningElement__
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var attributes: js.Array[JSXAttribute__ | JSXSpreadAttribute__]
  
  var name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__
  
  var selfClosing: Boolean
  
  var typeParameters: js.UndefOr[TypeParameterInstantiation_ | TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_JSXOpeningElement__ : JSXOpeningElement
}
object JSXOpeningElement__ {
  
  inline def apply(
    attributes: js.Array[JSXAttribute__ | JSXSpreadAttribute__],
    name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__,
    selfClosing: Boolean
  ): JSXOpeningElement__ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[JSXOpeningElement__]
  }
  
  extension [Self <: JSXOpeningElement__](x: Self) {
    
    inline def setAttributes(value: js.Array[JSXAttribute__ | JSXSpreadAttribute__]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: (JSXAttribute__ | JSXSpreadAttribute__)*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setName(value: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
