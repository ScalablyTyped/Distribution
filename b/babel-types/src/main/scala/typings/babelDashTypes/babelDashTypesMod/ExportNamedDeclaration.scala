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
    val __obj = js.Dynamic.literal(declaration = declaration, end = end, loc = loc, specifiers = specifiers, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (source != null) __obj.updateDynamic("source")(source)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

