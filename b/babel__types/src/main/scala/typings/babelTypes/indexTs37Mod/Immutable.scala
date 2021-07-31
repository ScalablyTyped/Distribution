package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.StringLiteral_
  - typings.babelTypes.indexTs37Mod.NumericLiteral_
  - typings.babelTypes.indexTs37Mod.NullLiteral_
  - typings.babelTypes.indexTs37Mod.BooleanLiteral_
  - typings.babelTypes.indexTs37Mod.BigIntLiteral_
  - typings.babelTypes.indexTs37Mod.JSXAttribute_
  - typings.babelTypes.indexTs37Mod.JSXClosingElement_
  - typings.babelTypes.indexTs37Mod.JSXElement_
  - typings.babelTypes.indexTs37Mod.JSXExpressionContainer_
  - typings.babelTypes.indexTs37Mod.JSXSpreadChild_
  - typings.babelTypes.indexTs37Mod.JSXOpeningElement_
  - typings.babelTypes.indexTs37Mod.JSXText_
  - typings.babelTypes.indexTs37Mod.JSXFragment_
  - typings.babelTypes.indexTs37Mod.JSXOpeningFragment_
  - typings.babelTypes.indexTs37Mod.JSXClosingFragment_
  - typings.babelTypes.indexTs37Mod.DecimalLiteral_
*/
trait Immutable
  extends StObject
     with _Node
object Immutable {
  
  @scala.inline
  def BigIntLiteral_(value: String): typings.babelTypes.indexTs37Mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BigIntLiteral_]
  }
  
  @scala.inline
  def BooleanLiteral_(value: Boolean): typings.babelTypes.indexTs37Mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BooleanLiteral_]
  }
  
  @scala.inline
  def DecimalLiteral_(value: String): typings.babelTypes.indexTs37Mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.DecimalLiteral_]
  }
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_): typings.babelTypes.indexTs37Mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXAttribute_]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): typings.babelTypes.indexTs37Mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXClosingElement_]
  }
  
  @scala.inline
  def JSXClosingFragment_(): typings.babelTypes.indexTs37Mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXClosingFragment_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.indexTs37Mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typings.babelTypes.indexTs37Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXElement_]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_): typings.babelTypes.indexTs37Mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXExpressionContainer_]
  }
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.indexTs37Mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): typings.babelTypes.indexTs37Mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXFragment_]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean
  ): typings.babelTypes.indexTs37Mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXOpeningElement_]
  }
  
  @scala.inline
  def JSXOpeningFragment_(): typings.babelTypes.indexTs37Mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXOpeningFragment_]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression): typings.babelTypes.indexTs37Mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXSpreadChild_]
  }
  
  @scala.inline
  def JSXText_(value: String): typings.babelTypes.indexTs37Mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXText_]
  }
  
  @scala.inline
  def NullLiteral_(): typings.babelTypes.indexTs37Mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.NullLiteral_]
  }
  
  @scala.inline
  def NumericLiteral_(value: Double): typings.babelTypes.indexTs37Mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.NumericLiteral_]
  }
  
  @scala.inline
  def StringLiteral_(value: String): typings.babelTypes.indexTs37Mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.StringLiteral_]
  }
}
