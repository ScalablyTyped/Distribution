package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyStatement
  extends Node
     with Statement {
  @JSName("type")
  var type_EmptyStatement: typings.babelDashTypes.babelDashTypesStrings.EmptyStatement
}

object EmptyStatement {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.EmptyStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): EmptyStatement = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[EmptyStatement]
  }
}

@JSImport("babel-types", "emptyStatement")
@js.native
object emptyStatement extends js.Object {
  def apply(): EmptyStatement = js.native
}

