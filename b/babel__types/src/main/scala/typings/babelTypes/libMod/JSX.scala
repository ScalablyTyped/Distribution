package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.JSXAttribute__
  - typings.babelTypes.libMod.JSXClosingElement__
  - typings.babelTypes.libMod.JSXElement__
  - typings.babelTypes.libMod.JSXEmptyExpression__
  - typings.babelTypes.libMod.JSXExpressionContainer__
  - typings.babelTypes.libMod.JSXSpreadChild__
  - typings.babelTypes.libMod.JSXIdentifier__
  - typings.babelTypes.libMod.JSXMemberExpression__
  - typings.babelTypes.libMod.JSXNamespacedName__
  - typings.babelTypes.libMod.JSXOpeningElement__
  - typings.babelTypes.libMod.JSXSpreadAttribute__
  - typings.babelTypes.libMod.JSXText__
  - typings.babelTypes.libMod.JSXFragment__
  - typings.babelTypes.libMod.JSXOpeningFragment__
  - typings.babelTypes.libMod.JSXClosingFragment__
*/
trait JSX extends StObject
object JSX {
  
  inline def JSXAttribute__(name: JSXIdentifier__ | JSXNamespacedName__): typings.babelTypes.libMod.JSXAttribute__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXAttribute__]
  }
  
  inline def JSXClosingElement__(name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__): typings.babelTypes.libMod.JSXClosingElement__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingElement__]
  }
  
  inline def JSXClosingFragment__(): typings.babelTypes.libMod.JSXClosingFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingFragment__]
  }
  
  inline def JSXElement__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | typings.babelTypes.libMod.JSXElement__ | JSXFragment__
    ],
    openingElement: JSXOpeningElement__
  ): typings.babelTypes.libMod.JSXElement__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXElement__]
  }
  
  inline def JSXEmptyExpression__(): typings.babelTypes.libMod.JSXEmptyExpression__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXEmptyExpression__]
  }
  
  inline def JSXExpressionContainer__(expression: Expression | JSXEmptyExpression__): typings.babelTypes.libMod.JSXExpressionContainer__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXExpressionContainer__]
  }
  
  inline def JSXFragment__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | typings.babelTypes.libMod.JSXFragment__
    ],
    closingFragment: JSXClosingFragment__,
    openingFragment: JSXOpeningFragment__
  ): typings.babelTypes.libMod.JSXFragment__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXFragment__]
  }
  
  inline def JSXIdentifier__(name: String): typings.babelTypes.libMod.JSXIdentifier__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXIdentifier__]
  }
  
  inline def JSXMemberExpression__(
    `object`: typings.babelTypes.libMod.JSXMemberExpression__ | JSXIdentifier__,
    property: JSXIdentifier__
  ): typings.babelTypes.libMod.JSXMemberExpression__ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXMemberExpression__]
  }
  
  inline def JSXNamespacedName__(name: JSXIdentifier__, namespace: JSXIdentifier__): typings.babelTypes.libMod.JSXNamespacedName__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXNamespacedName__]
  }
  
  inline def JSXOpeningElement__(
    attributes: js.Array[JSXAttribute__ | JSXSpreadAttribute__],
    name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__,
    selfClosing: Boolean
  ): typings.babelTypes.libMod.JSXOpeningElement__ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningElement__]
  }
  
  inline def JSXOpeningFragment__(): typings.babelTypes.libMod.JSXOpeningFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningFragment__]
  }
  
  inline def JSXSpreadAttribute__(argument: Expression): typings.babelTypes.libMod.JSXSpreadAttribute__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadAttribute__]
  }
  
  inline def JSXSpreadChild__(expression: Expression): typings.babelTypes.libMod.JSXSpreadChild__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadChild__]
  }
  
  inline def JSXText__(value: String): typings.babelTypes.libMod.JSXText__ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXText__]
  }
}
