package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement
  extends Node
     with Statement {
  var block: BlockStatement
  var finalizer: BlockStatement
  var handler: CatchClause
  @JSName("type")
  var type_TryStatement: typings.babelDashTypes.babelDashTypesStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatement,
    end: Double,
    finalizer: BlockStatement,
    handler: CatchClause,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TryStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block, end = end, finalizer = finalizer, handler = handler, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TryStatement]
  }
}

