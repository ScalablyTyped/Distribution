package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForOfStatement
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
  var type_ForOfStatement: typings.babelDashTypes.babelDashTypesStrings.ForOfStatement
}

object ForOfStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    left: VariableDeclaration | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ForOfStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, left = left.asInstanceOf[js.Any], loc = loc, right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForOfStatement]
  }
}

@JSImport("babel-types", "forOfStatement")
@js.native
object forOfStatement extends js.Object {
  def apply(): ForOfStatement = js.native
  def apply(left: LVal): ForOfStatement = js.native
  def apply(left: LVal, right: Expression): ForOfStatement = js.native
  def apply(left: LVal, right: Expression, body: Statement): ForOfStatement = js.native
  def apply(left: VariableDeclaration): ForOfStatement = js.native
  def apply(left: VariableDeclaration, right: Expression): ForOfStatement = js.native
  def apply(left: VariableDeclaration, right: Expression, body: Statement): ForOfStatement = js.native
}

