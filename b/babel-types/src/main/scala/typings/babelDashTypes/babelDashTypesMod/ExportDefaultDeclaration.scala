package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDefaultDeclaration
  extends Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration | Expression
  @JSName("type")
  var type_ExportDefaultDeclaration: typings.babelDashTypes.babelDashTypesStrings.ExportDefaultDeclaration
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    declaration: Declaration | Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ExportDefaultDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
}

@JSImport("babel-types", "exportDefaultDeclaration")
@js.native
object exportDefaultDeclaration extends js.Object {
  def apply(): ExportDefaultDeclaration = js.native
  def apply(declaration: ClassDeclaration): ExportDefaultDeclaration = js.native
  def apply(declaration: Expression): ExportDefaultDeclaration = js.native
  def apply(declaration: FunctionDeclaration): ExportDefaultDeclaration = js.native
}

