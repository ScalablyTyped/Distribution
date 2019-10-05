package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`var`
import typings.babelDashTypes.babelDashTypesStrings.const
import typings.babelDashTypes.babelDashTypesStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends Node
     with Declaration
     with Statement {
  var declarations: js.Array[VariableDeclarator]
  var kind: `var` | let | const
  @JSName("type")
  var type_VariableDeclaration: typings.babelDashTypes.babelDashTypesStrings.VariableDeclaration
}

object VariableDeclaration {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator],
    end: Double,
    kind: `var` | let | const,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.VariableDeclaration,
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

@JSImport("babel-types", "variableDeclaration")
@js.native
object variableDeclaration extends js.Object {
  def apply(): VariableDeclaration = js.native
}

