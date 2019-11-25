package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoWhileStatement
  extends Node
     with BlockParent
     with Loop
     with Scopable
     with Statement
     with While {
  var body: Statement
  var test: Expression
  @JSName("type")
  var type_DoWhileStatement: typings.babelDashTypes.babelDashTypesStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: typings.babelDashTypes.babelDashTypesStrings.DoWhileStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoWhileStatement]
  }
}

@JSImport("babel-types", "doWhileStatement")
@js.native
object doWhileStatement extends js.Object {
  def apply(): DoWhileStatement = js.native
  def apply(test: Expression): DoWhileStatement = js.native
  def apply(test: Expression, body: Statement): DoWhileStatement = js.native
}

