package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSpecifier_
  extends Node
     with ModuleSpecifier {
  var exported: Identifier_
  var imported: Identifier_
  var local: Identifier_
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier
}

object ExportSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier_,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ExportSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier_]
  }
}

