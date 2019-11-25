package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForInStatement
  extends Node
     with BlockParent
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var left: VariableDeclaration | LVal
  var right: Expression
  @JSName("type")
  var type_ForInStatement: typings.babelDashTypes.babelDashTypesStrings.ForInStatement
}

object ForInStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    left: VariableDeclaration | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ForInStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForInStatement]
  }
}

@JSImport("babel-types", "forInStatement")
@js.native
object forInStatement extends js.Object {
  def apply(): ForInStatement = js.native
  def apply(left: LVal): ForInStatement = js.native
  def apply(left: LVal, right: Expression): ForInStatement = js.native
  def apply(left: LVal, right: Expression, body: Statement): ForInStatement = js.native
  def apply(left: VariableDeclaration): ForInStatement = js.native
  def apply(left: VariableDeclaration, right: Expression): ForInStatement = js.native
  def apply(left: VariableDeclaration, right: Expression, body: Statement): ForInStatement = js.native
}

