package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStatement
  extends Node
     with Statement {
  var body: BlockStatement | Statement
  var `object`: Expression
  @JSName("type")
  var type_WithStatement: typings.babelDashTypes.babelDashTypesStrings.WithStatement
}

object WithStatement {
  @scala.inline
  def apply(
    body: BlockStatement | Statement,
    end: Double,
    loc: SourceLocation,
    `object`: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.WithStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement]
  }
}

@JSImport("babel-types", "withStatement")
@js.native
object withStatement extends js.Object {
  def apply(): WithStatement = js.native
  def apply(`object`: Expression): WithStatement = js.native
  def apply(`object`: Expression, body: BlockStatement): WithStatement = js.native
  def apply(`object`: Expression, body: Statement): WithStatement = js.native
}

