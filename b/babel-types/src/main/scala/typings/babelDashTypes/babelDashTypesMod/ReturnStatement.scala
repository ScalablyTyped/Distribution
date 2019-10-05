package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  var argument: Expression
  @JSName("type")
  var type_ReturnStatement: typings.babelDashTypes.babelDashTypesStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ReturnStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ReturnStatement]
  }
}

@JSImport("babel-types", "returnStatement")
@js.native
object returnStatement extends js.Object {
  def apply(): ReturnStatement = js.native
  def apply(argument: Expression): ReturnStatement = js.native
}

