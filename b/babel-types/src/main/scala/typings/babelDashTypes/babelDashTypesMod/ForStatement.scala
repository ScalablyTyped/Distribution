package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends Node
     with BlockParent
     with For
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var init: VariableDeclaration | Expression
  var test: Expression
  @JSName("type")
  var type_ForStatement: typings.babelDashTypes.babelDashTypesStrings.ForStatement
  var update: Expression
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    init: VariableDeclaration | Expression,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ForStatement,
    update: Expression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, init = init.asInstanceOf[js.Any], loc = loc, start = start, test = test, update = update)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForStatement]
  }
}

@JSImport("babel-types", "forStatement")
@js.native
object forStatement extends js.Object {
  def apply(): ForStatement = js.native
  def apply(init: Expression): ForStatement = js.native
  def apply(init: Expression, test: Expression): ForStatement = js.native
  def apply(init: Expression, test: Expression, update: Expression): ForStatement = js.native
  def apply(init: Expression, test: Expression, update: Expression, body: Statement): ForStatement = js.native
  def apply(init: VariableDeclaration): ForStatement = js.native
  def apply(init: VariableDeclaration, test: Expression): ForStatement = js.native
  def apply(init: VariableDeclaration, test: Expression, update: Expression): ForStatement = js.native
  def apply(init: VariableDeclaration, test: Expression, update: Expression, body: Statement): ForStatement = js.native
}

