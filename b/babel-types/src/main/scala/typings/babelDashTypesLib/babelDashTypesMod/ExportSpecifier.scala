package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSpecifier
  extends Node
     with ModuleSpecifier {
  var exported: Identifier
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ExportSpecifier: babelDashTypesLib.babelDashTypesLibStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(
    end: scala.Double,
    exported: Identifier,
    imported: Identifier,
    loc: SourceLocation,
    local: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ExportSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportSpecifier = {
    val __obj = js.Dynamic.literal(end = end, exported = exported, imported = imported, loc = loc, local = local, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportSpecifier]
  }
}

