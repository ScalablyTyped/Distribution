package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamespaceSpecifier
  extends Node
     with ModuleSpecifier {
  var exported: Identifier
  @JSName("type")
  var type_ExportNamespaceSpecifier: babelDashTypesLib.babelDashTypesLibStrings.ExportNamespaceSpecifier
}

object ExportNamespaceSpecifier {
  @scala.inline
  def apply(
    end: scala.Double,
    exported: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ExportNamespaceSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(end = end, exported = exported, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportNamespaceSpecifier]
  }
}

