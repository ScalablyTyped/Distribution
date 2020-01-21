package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportNamespaceSpecifier_
  extends Node
     with ModuleSpecifier {
  var exported: Identifier_
  @JSName("type")
  var type_ExportNamespaceSpecifier_ : ExportNamespaceSpecifier
}

object ExportNamespaceSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ExportNamespaceSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamespaceSpecifier_]
  }
}

