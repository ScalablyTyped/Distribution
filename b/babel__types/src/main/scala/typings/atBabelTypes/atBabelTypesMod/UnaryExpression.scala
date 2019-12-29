package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.Exclamationmark
import typings.atBabelTypes.atBabelTypesStrings.Plussign
import typings.atBabelTypes.atBabelTypesStrings.Tilde
import typings.atBabelTypes.atBabelTypesStrings.`-_`
import typings.atBabelTypes.atBabelTypesStrings.`throw`
import typings.atBabelTypes.atBabelTypesStrings.delete
import typings.atBabelTypes.atBabelTypesStrings.typeof
import typings.atBabelTypes.atBabelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait UnaryExpression
  extends Expression
     with BaseNode
     with UnaryLike {
  var argument: Expression
  var operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof
  var prefix: Boolean
  @JSName("type")
  var type_UnaryExpression: typings.atBabelTypes.atBabelTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.UnaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}

@JSImport("@babel/types", "unaryExpression")
@js.native
object unaryExpression extends js.Object {
  def apply(operator: Exclamationmark, argument: Expression): UnaryExpression = js.native
  def apply(operator: Exclamationmark, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Plussign, argument: Expression): UnaryExpression = js.native
  def apply(operator: Plussign, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: Tilde, argument: Expression): UnaryExpression = js.native
  def apply(operator: Tilde, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def apply(operator: `-_`, argument: Expression): UnaryExpression = js.native
  def apply(operator: `-_`, argument: Expression, prefix: Boolean): UnaryExpression = js.native
}

