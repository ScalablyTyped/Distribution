package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import typings.babelTypes.babelTypesStrings.JSXClosingElement
import typings.babelTypes.babelTypesStrings.JSXElement
import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import typings.babelTypes.babelTypesStrings.JSXIdentifier
import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import typings.babelTypes.babelTypesStrings.JSXNamespacedName
import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import typings.babelTypes.babelTypesStrings.JSXSpreadAttribute
import typings.babelTypes.babelTypesStrings.JSXText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.JSXAttribute_
  - typings.babelTypes.mod.JSXClosingElement_
  - typings.babelTypes.mod.JSXElement_
  - typings.babelTypes.mod.JSXEmptyExpression_
  - typings.babelTypes.mod.JSXExpressionContainer_
  - typings.babelTypes.mod.JSXIdentifier_
  - typings.babelTypes.mod.JSXMemberExpression_
  - typings.babelTypes.mod.JSXNamespacedName_
  - typings.babelTypes.mod.JSXOpeningElement_
  - typings.babelTypes.mod.JSXSpreadAttribute_
  - typings.babelTypes.mod.JSXText_
*/
trait JSX extends js.Object

object JSX {
  @scala.inline
  def JSXEmptyExpression_(end: Double, loc: SourceLocation, start: Double, `type`: JSXEmptyExpression): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXNamespacedName_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_,
    namespace: JSXIdentifier_,
    start: Double,
    `type`: JSXNamespacedName
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double,
    `type`: JSXOpeningElement
  ): JSX = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXIdentifier_(end: Double, loc: SourceLocation, name: String, start: Double, `type`: JSXIdentifier): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXText_(end: Double, loc: SourceLocation, start: Double, `type`: JSXText, value: String): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXSpreadAttribute_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: JSXSpreadAttribute): JSX = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXAttribute_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXNamespacedName_,
    start: Double,
    `type`: JSXAttribute
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXMemberExpression_(
    end: Double,
    loc: SourceLocation,
    `object`: typings.babelTypes.mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double,
    `type`: JSXMemberExpression
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXExpressionContainer_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: JSXExpressionContainer
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXClosingElement_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    start: Double,
    `type`: JSXClosingElement
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  @scala.inline
  def JSXElement_(
    children: js.Array[typings.babelTypes.mod.JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement
  ): JSX = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
}

