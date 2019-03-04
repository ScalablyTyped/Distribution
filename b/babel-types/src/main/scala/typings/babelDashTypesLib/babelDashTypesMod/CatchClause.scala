package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatchClause
  extends Node
     with Scopable {
  var body: BlockStatement
  var param: Identifier
  @JSName("type")
  var type_CatchClause: babelDashTypesLib.babelDashTypesLibStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatement,
    end: scala.Double,
    loc: SourceLocation,
    param: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.CatchClause,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body, end = end, loc = loc, param = param, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[CatchClause]
  }
}

