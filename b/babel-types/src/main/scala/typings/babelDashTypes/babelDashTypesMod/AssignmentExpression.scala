package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`%=`
import typings.babelDashTypes.babelDashTypesStrings.`&=`
import typings.babelDashTypes.babelDashTypesStrings.`*=`
import typings.babelDashTypes.babelDashTypesStrings.`+=`
import typings.babelDashTypes.babelDashTypesStrings.`-=`
import typings.babelDashTypes.babelDashTypesStrings.`/=`
import typings.babelDashTypes.babelDashTypesStrings.`<<=`
import typings.babelDashTypes.babelDashTypesStrings.`=`
import typings.babelDashTypes.babelDashTypesStrings.`>>=`
import typings.babelDashTypes.babelDashTypesStrings.`>>>=`
import typings.babelDashTypes.babelDashTypesStrings.`^=`
import typings.babelDashTypes.babelDashTypesStrings.`|=`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression
  extends Node
     with Expression {
  var left: LVal
  var operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`
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
    operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.AssignmentExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(end = end, left = left, loc = loc, operator = operator.asInstanceOf[js.Any], right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
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

