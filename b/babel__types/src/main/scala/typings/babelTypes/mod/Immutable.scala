package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import typings.babelTypes.babelTypesStrings.BooleanLiteral
import typings.babelTypes.babelTypesStrings.DecimalLiteral
import typings.babelTypes.babelTypesStrings.JSXAttribute
import typings.babelTypes.babelTypesStrings.JSXClosingElement
import typings.babelTypes.babelTypesStrings.JSXClosingFragment
import typings.babelTypes.babelTypesStrings.JSXElement
import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import typings.babelTypes.babelTypesStrings.JSXFragment
import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import typings.babelTypes.babelTypesStrings.JSXOpeningFragment
import typings.babelTypes.babelTypesStrings.JSXSpreadChild
import typings.babelTypes.babelTypesStrings.JSXText
import typings.babelTypes.babelTypesStrings.NullLiteral
import typings.babelTypes.babelTypesStrings.NumericLiteral
import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.StringLiteral_
  - typings.babelTypes.mod.NumericLiteral_
  - typings.babelTypes.mod.NullLiteral_
  - typings.babelTypes.mod.BooleanLiteral_
  - typings.babelTypes.mod.BigIntLiteral_
  - typings.babelTypes.mod.JSXAttribute_
  - typings.babelTypes.mod.JSXClosingElement_
  - typings.babelTypes.mod.JSXElement_
  - typings.babelTypes.mod.JSXExpressionContainer_
  - typings.babelTypes.mod.JSXSpreadChild_
  - typings.babelTypes.mod.JSXOpeningElement_
  - typings.babelTypes.mod.JSXText_
  - typings.babelTypes.mod.JSXFragment_
  - typings.babelTypes.mod.JSXOpeningFragment_
  - typings.babelTypes.mod.JSXClosingFragment_
  - typings.babelTypes.mod.DecimalLiteral_
*/
trait Immutable extends _Node
object Immutable {
  
  @scala.inline
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): typings.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.BigIntLiteral_]
  }
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): typings.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteral_]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): typings.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.DecimalLiteral_]
  }
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): typings.babelTypes.mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXAttribute_]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): typings.babelTypes.mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXClosingElement_]
  }
  
  @scala.inline
  def JSXClosingFragment_(`type`: JSXClosingFragment): typings.babelTypes.mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXClosingFragment_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): typings.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXElement_]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): typings.babelTypes.mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXExpressionContainer_]
  }
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): typings.babelTypes.mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXFragment_]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): typings.babelTypes.mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXOpeningElement_]
  }
  
  @scala.inline
  def JSXOpeningFragment_(`type`: JSXOpeningFragment): typings.babelTypes.mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXOpeningFragment_]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression, `type`: JSXSpreadChild): typings.babelTypes.mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXSpreadChild_]
  }
  
  @scala.inline
  def JSXText_(`type`: JSXText, value: String): typings.babelTypes.mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.JSXText_]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): typings.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.NullLiteral_]
  }
  
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): typings.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.NumericLiteral_]
  }
  
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): typings.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteral_]
  }
}
