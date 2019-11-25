package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXExpressionContainer
  extends Immutable
     with BaseNode
     with JSX {
  var expression: Expression | JSXEmptyExpression
  @JSName("type")
  var type_JSXExpressionContainer: typings.atBabelTypes.atBabelTypesStrings.JSXExpressionContainer
}

object JSXExpressionContainer {
  @scala.inline
  def apply(
    expression: Expression | JSXEmptyExpression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXExpressionContainer,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer]
  }
}

@JSImport("@babel/types", "jsxExpressionContainer")
@js.native
object jsxExpressionContainer extends js.Object {
  def apply(expression: Expression): JSXExpressionContainer = js.native
  def apply(expression: JSXEmptyExpression): JSXExpressionContainer = js.native
}

