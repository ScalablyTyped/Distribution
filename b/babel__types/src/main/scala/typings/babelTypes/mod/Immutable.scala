package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import typings.babelTypes.babelTypesStrings.BooleanLiteral
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.StringLiteral_
  - typings.babelTypes.mod.NumericLiteral_
  - typings.babelTypes.mod.NullLiteral_
  - typings.babelTypes.mod.BooleanLiteral_
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
  - typings.babelTypes.mod.BigIntLiteral_
*/
trait Immutable extends _Node

object Immutable {
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def NullLiteral_(
    `type`: NullLiteral,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXText_(
    `type`: JSXText,
    value: String,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def BooleanLiteral_(
    `type`: BooleanLiteral,
    value: Boolean,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXSpreadChild_(
    expression: Expression,
    `type`: JSXSpreadChild,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXAttribute_(
    name: JSXIdentifier_ | JSXNamespacedName_,
    `type`: JSXAttribute,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_ = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def BigIntLiteral_(
    `type`: BigIntLiteral,
    value: String,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def NumericLiteral_(
    `type`: NumericLiteral,
    value: Double,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def StringLiteral_(
    `type`: StringLiteral,
    value: String,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXOpeningFragment_(
    `type`: JSXOpeningFragment,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXExpressionContainer_(
    expression: Expression | JSXEmptyExpression_,
    `type`: JSXExpressionContainer,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXClosingElement_(
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    `type`: JSXClosingElement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    selfClosing: js.Any,
    `type`: JSXElement,
    closingElement: JSXClosingElement_ = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  @scala.inline
  def JSXClosingFragment_(
    `type`: JSXClosingFragment,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
}

