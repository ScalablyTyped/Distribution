package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.AmpersandEqualssign
import typings.babelDashTypes.babelDashTypesStrings.AsteriskEqualssign
import typings.babelDashTypes.babelDashTypesStrings.Equalssign
import typings.babelDashTypes.babelDashTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.LessthansignLessthansignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.PercentsignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.PlussignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.SlashEqualssign
import typings.babelDashTypes.babelDashTypesStrings.VerticallineEqualssign
import typings.babelDashTypes.babelDashTypesStrings.`-Equalssign`
import typings.babelDashTypes.babelDashTypesStrings.`^Equalssign`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression
  extends Node
     with Expression {
  var left: LVal
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: typings.babelDashTypes.babelDashTypesStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.AssignmentExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
}

@JSImport("babel-types", "assignmentExpression")
@js.native
object assignmentExpression extends js.Object {
  def apply(): AssignmentExpression = js.native
  def apply(operator: String): AssignmentExpression = js.native
  def apply(operator: String, left: LVal): AssignmentExpression = js.native
  def apply(operator: String, left: LVal, right: Expression): AssignmentExpression = js.native
}

