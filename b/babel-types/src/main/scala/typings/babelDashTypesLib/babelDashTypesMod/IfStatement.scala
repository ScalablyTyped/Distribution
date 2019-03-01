package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends Node
     with Conditional
     with Statement {
  var alternate: Statement
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: babelDashTypesLib.babelDashTypesLibStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    alternate: Statement,
    consequent: Statement,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    test: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.IfStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("alternate")(alternate)
    __obj.updateDynamic("consequent")(consequent)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("test")(test)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[IfStatement]
  }
}

