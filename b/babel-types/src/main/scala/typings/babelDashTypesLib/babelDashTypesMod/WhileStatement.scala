package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhileStatement
  extends Node
     with BlockParent
     with Loop
     with Scopable
     with Statement
     with While {
  var body: Statement
  var test: Expression
  @JSName("type")
  var type_WhileStatement: babelDashTypesLib.babelDashTypesLibStrings.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    test: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.WhileStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): WhileStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("test")(test)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[WhileStatement]
  }
}

