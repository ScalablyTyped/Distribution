package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamedDeclaration
  extends Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration
  var source: StringLiteral | Null
  var specifiers: js.Array[ExportSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: typings.babelDashTypes.babelDashTypesStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ExportNamedDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    source: StringLiteral = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

@JSImport("babel-types", "exportNamedDeclaration")
@js.native
object exportNamedDeclaration extends js.Object {
  def apply(): ExportNamedDeclaration = js.native
  def apply(declaration: Declaration): ExportNamedDeclaration = js.native
  def apply(declaration: Declaration, specifiers: js.Array[ExportSpecifier]): ExportNamedDeclaration = js.native
  def apply(declaration: Declaration, specifiers: js.Array[ExportSpecifier], source: StringLiteral): ExportNamedDeclaration = js.native
}

