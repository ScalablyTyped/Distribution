package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ExportNamedDeclaration
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var declaration: Declaration | scala.Null
  var source: StringLiteral | scala.Null
  var specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: atBabelTypesLib.atBabelTypesLibStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ExportNamedDeclaration,
    declaration: Declaration = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    source: StringLiteral = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers)
    __obj.updateDynamic("type")(`type`)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (source != null) __obj.updateDynamic("source")(source)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

