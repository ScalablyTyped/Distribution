package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement
  extends Node
     with Block
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement]
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  @JSName("type")
  var type_BlockStatement: babelDashTypesLib.babelDashTypesLibStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.BlockStatement,
    directives: js.Array[Directive] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BlockStatement]
  }
}

