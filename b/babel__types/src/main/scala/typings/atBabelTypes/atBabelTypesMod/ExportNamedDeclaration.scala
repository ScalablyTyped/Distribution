package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`type`
import typings.atBabelTypes.atBabelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ExportNamedDeclaration
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration | Null
  var exportKind: `type` | value | Null
  var source: StringLiteral | Null
  var specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: typings.atBabelTypes.atBabelTypesStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    `type`: typings.atBabelTypes.atBabelTypesStrings.ExportNamedDeclaration,
    declaration: Declaration = null,
    end: Int | Double = null,
    exportKind: `type` | value = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    source: StringLiteral = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exportKind != null) __obj.updateDynamic("exportKind")(exportKind.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

@JSImport("@babel/types", "exportNamedDeclaration")
@js.native
object exportNamedDeclaration extends js.Object {
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier]
  ): ExportNamedDeclaration = js.native
  def apply(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier]
  ): ExportNamedDeclaration = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def apply(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier]
  ): ExportNamedDeclaration = js.native
  def apply(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
}

