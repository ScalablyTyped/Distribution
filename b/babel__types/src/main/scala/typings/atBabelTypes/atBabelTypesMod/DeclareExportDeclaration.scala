package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DeclareExportDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var declaration: Flow | Null
  var default: Boolean | Null
  var source: StringLiteral | Null
  var specifiers: (js.Array[ExportSpecifier | ExportNamespaceSpecifier]) | Null
  @JSName("type")
  var type_DeclareExportDeclaration: typings.atBabelTypes.atBabelTypesStrings.DeclareExportDeclaration
}

object DeclareExportDeclaration {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.DeclareExportDeclaration,
    declaration: Flow = null,
    default: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    source: StringLiteral = null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier] = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DeclareExportDeclaration]
  }
}

@JSImport("@babel/types", "declareExportDeclaration")
@js.native
object declareExportDeclaration extends js.Object {
  def apply(): DeclareExportDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier]): DeclareExportDeclaration = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: Null,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): DeclareExportDeclaration = js.native
  def apply(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def apply(declaration: Null, specifiers: Null, source: Null, _default: Boolean): DeclareExportDeclaration = js.native
  def apply(declaration: Null, specifiers: Null, source: StringLiteral): DeclareExportDeclaration = js.native
  def apply(declaration: Null, specifiers: Null, source: StringLiteral, _default: Boolean): DeclareExportDeclaration = js.native
  def apply(declaration: Flow): DeclareExportDeclaration = js.native
  def apply(declaration: Flow, specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier]): DeclareExportDeclaration = js.native
  def apply(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: Null,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def apply(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): DeclareExportDeclaration = js.native
  def apply(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def apply(declaration: Flow, specifiers: Null, source: Null, _default: Boolean): DeclareExportDeclaration = js.native
  def apply(declaration: Flow, specifiers: Null, source: StringLiteral): DeclareExportDeclaration = js.native
  def apply(declaration: Flow, specifiers: Null, source: StringLiteral, _default: Boolean): DeclareExportDeclaration = js.native
}

