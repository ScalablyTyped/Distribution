package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForOfStatement
  extends Node
     with BlockParent
     with For
     with ForXStatement
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var left: VariableDeclaration | LVal
  var right: Expression
  @JSName("type")
  var type_ForOfStatement: babelDashTypesLib.babelDashTypesLibStrings.ForOfStatement
}

object ForOfStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: scala.Double,
    left: VariableDeclaration | LVal,
    loc: SourceLocation,
    right: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ForOfStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, left = left.asInstanceOf[js.Any], loc = loc, right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForOfStatement]
  }
}

