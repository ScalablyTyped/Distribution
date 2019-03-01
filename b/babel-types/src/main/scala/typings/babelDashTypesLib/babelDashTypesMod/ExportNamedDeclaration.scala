package typings
package babelDashTypesLib.babelDashTypesMod

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
  var source: StringLiteral | scala.Null
  var specifiers: js.Array[ExportSpecifier]
  @JSName("type")
  var type_ExportNamedDeclaration: babelDashTypesLib.babelDashTypesLibStrings.ExportNamedDeclaration
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(
    declaration: Declaration,
    end: scala.Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ExportNamedDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    source: StringLiteral = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("declaration")(declaration)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("specifiers")(specifiers)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (source != null) __obj.updateDynamic("source")(source)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
}

