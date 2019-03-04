package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareExportDeclaration
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var declaration: Flow | scala.Null
  var default: scala.Boolean | scala.Null
  var source: StringLiteral | scala.Null
  var specifiers: (js.Array[ExportSpecifier | ExportNamespaceSpecifier]) | scala.Null
  @JSName("type")
  var type_DeclareExportDeclaration: atBabelTypesLib.atBabelTypesLibStrings.DeclareExportDeclaration
}

object DeclareExportDeclaration {
  @scala.inline
  def apply(
    `type`: atBabelTypesLib.atBabelTypesLibStrings.DeclareExportDeclaration,
    declaration: Flow = null,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    source: StringLiteral = null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier] = null,
    start: scala.Int | scala.Double = null,
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

