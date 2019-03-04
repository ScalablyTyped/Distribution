package typings
package babelDashTypesLib.babelDashTypesMod

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
  var type_DoWhileStatement: babelDashTypesLib.babelDashTypesLibStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    test: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.DoWhileStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, loc = loc, start = start, test = test)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DoWhileStatement]
  }
}

