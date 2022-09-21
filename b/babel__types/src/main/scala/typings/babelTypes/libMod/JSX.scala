package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.JSXAttribute
  - typings.babelTypes.libMod.JSXClosingElement
  - typings.babelTypes.libMod.JSXElement
  - typings.babelTypes.libMod.JSXEmptyExpression
  - typings.babelTypes.libMod.JSXExpressionContainer
  - typings.babelTypes.libMod.JSXSpreadChild
  - typings.babelTypes.libMod.JSXIdentifier
  - typings.babelTypes.libMod.JSXMemberExpression
  - typings.babelTypes.libMod.JSXNamespacedName
  - typings.babelTypes.libMod.JSXOpeningElement
  - typings.babelTypes.libMod.JSXSpreadAttribute
  - typings.babelTypes.libMod.JSXText
  - typings.babelTypes.libMod.JSXFragment
  - typings.babelTypes.libMod.JSXOpeningFragment
  - typings.babelTypes.libMod.JSXClosingFragment
*/
trait JSX extends StObject
object JSX {
  
  inline def JSXAttribute(name: JSXIdentifier | JSXNamespacedName): typings.babelTypes.libMod.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXAttribute]
  }
  
  inline def JSXClosingElement(name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName): typings.babelTypes.libMod.JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingElement]
  }
  
  inline def JSXClosingFragment(): typings.babelTypes.libMod.JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingFragment]
  }
  
  inline def JSXElement(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | typings.babelTypes.libMod.JSXElement | JSXFragment
    ],
    openingElement: JSXOpeningElement
  ): typings.babelTypes.libMod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXElement]
  }
  
  inline def JSXEmptyExpression(): typings.babelTypes.libMod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXEmptyExpression]
  }
  
  inline def JSXExpressionContainer(expression: Expression | JSXEmptyExpression): typings.babelTypes.libMod.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXExpressionContainer]
  }
  
  inline def JSXFragment(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | typings.babelTypes.libMod.JSXFragment
    ],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment
  ): typings.babelTypes.libMod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXFragment]
  }
  
  inline def JSXIdentifier(name: String): typings.babelTypes.libMod.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXIdentifier]
  }
  
  inline def JSXMemberExpression(`object`: typings.babelTypes.libMod.JSXMemberExpression | JSXIdentifier, property: JSXIdentifier): typings.babelTypes.libMod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: JSXIdentifier, namespace: JSXIdentifier): typings.babelTypes.libMod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXNamespacedName]
  }
  
  inline def JSXOpeningElement(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean
  ): typings.babelTypes.libMod.JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningElement]
  }
  
  inline def JSXOpeningFragment(): typings.babelTypes.libMod.JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningFragment]
  }
  
  inline def JSXSpreadAttribute(argument: Expression): typings.babelTypes.libMod.JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadAttribute]
  }
  
  inline def JSXSpreadChild(expression: Expression): typings.babelTypes.libMod.JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadChild]
  }
  
  inline def JSXText(value: String): typings.babelTypes.libMod.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXText]
  }
}
