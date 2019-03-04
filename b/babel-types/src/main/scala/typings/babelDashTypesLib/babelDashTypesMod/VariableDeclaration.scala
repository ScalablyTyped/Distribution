package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends Node
     with Declaration
     with Statement {
  var declarations: js.Array[VariableDeclarator]
  var kind: babelDashTypesLib.babelDashTypesLibStrings.`var` | babelDashTypesLib.babelDashTypesLibStrings.let | babelDashTypesLib.babelDashTypesLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: babelDashTypesLib.babelDashTypesLibStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    end: scala.Double,
    kind: babelDashTypesLib.babelDashTypesLibStrings.`var` | babelDashTypesLib.babelDashTypesLibStrings.let | babelDashTypesLib.babelDashTypesLibStrings.const,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.VariableDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations, end = end, kind = kind.asInstanceOf[js.Any], loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

