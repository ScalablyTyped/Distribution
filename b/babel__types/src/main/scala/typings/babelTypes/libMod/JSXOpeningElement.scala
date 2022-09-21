package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningElement
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  var attributes: js.Array[JSXAttribute | JSXSpreadAttribute]
  
  var name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName
  
  var selfClosing: Boolean
  
  var typeParameters: js.UndefOr[TypeParameterInstantiation_ | TSTypeParameterInstantiation | Null] = js.undefined
  
  @JSName("type")
  var type_JSXOpeningElement: typings.babelTypes.babelTypesStrings.JSXOpeningElement
}
object JSXOpeningElement {
  
  inline def apply(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[JSXOpeningElement]
  }
  
  extension [Self <: JSXOpeningElement](x: Self) {
    
    inline def setAttributes(value: js.Array[JSXAttribute | JSXSpreadAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: (JSXAttribute | JSXSpreadAttribute)*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setName(value: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
