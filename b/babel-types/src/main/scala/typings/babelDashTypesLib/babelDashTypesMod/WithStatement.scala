package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStatement
  extends Node
     with Statement {
  var body: BlockStatement | Statement
  var `object`: Expression
  @JSName("type")
  var type_WithStatement: babelDashTypesLib.babelDashTypesLibStrings.WithStatement
}

object WithStatement {
  @scala.inline
  def apply(
    body: BlockStatement | Statement,
    end: scala.Double,
    loc: SourceLocation,
    `object`: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.WithStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end, loc = loc, start = start)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[WithStatement]
  }
}

