package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends Node
     with Conditional
     with Statement {
  var alternate: Statement
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: typings.babelDashTypes.babelDashTypesStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    alternate: Statement,
    consequent: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.IfStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

@JSImport("babel-types", "ifStatement")
@js.native
object ifStatement extends js.Object {
  def apply(): IfStatement = js.native
  def apply(test: Expression): IfStatement = js.native
  def apply(test: Expression, consequent: Statement): IfStatement = js.native
  def apply(test: Expression, consequent: Statement, alternate: Statement): IfStatement = js.native
}

