package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ExpressionStatement
  extends ExpressionWrapper
     with BaseNode
     with Statement {
  var expression: Expression
  @JSName("type")
  var type_ExpressionStatement: typings.atBabelTypes.atBabelTypesStrings.ExpressionStatement
}

object ExpressionStatement {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ExpressionStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExpressionStatement]
  }
}

@JSImport("@babel/types", "expressionStatement")
@js.native
object expressionStatement extends js.Object {
  def apply(expression: Expression): ExpressionStatement = js.native
}

