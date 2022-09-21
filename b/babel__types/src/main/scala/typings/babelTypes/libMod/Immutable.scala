package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.StringLiteral_
  - typings.babelTypes.libMod.NumericLiteral_
  - typings.babelTypes.libMod.NullLiteral_
  - typings.babelTypes.libMod.BooleanLiteral_
  - typings.babelTypes.libMod.BigIntLiteral_
  - typings.babelTypes.libMod.JSXAttribute
  - typings.babelTypes.libMod.JSXClosingElement
  - typings.babelTypes.libMod.JSXElement
  - typings.babelTypes.libMod.JSXExpressionContainer
  - typings.babelTypes.libMod.JSXSpreadChild
  - typings.babelTypes.libMod.JSXOpeningElement
  - typings.babelTypes.libMod.JSXText
  - typings.babelTypes.libMod.JSXFragment
  - typings.babelTypes.libMod.JSXOpeningFragment
  - typings.babelTypes.libMod.JSXClosingFragment
  - typings.babelTypes.libMod.DecimalLiteral_
*/
trait Immutable extends StObject
object Immutable {
  
  inline def BigIntLiteral_(value: String): typings.babelTypes.libMod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BigIntLiteral_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.DecimalLiteral_]
  }
  
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
  
  inline def NullLiteral_(): typings.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typings.babelTypes.libMod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumericLiteral_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteral_]
  }
}
