package typings.babelDashTypes.babelDashTypesMod

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
  var type_ExportSpecifier: typings.babelDashTypes.babelDashTypesStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier,
    imported: Identifier,
    loc: SourceLocation,
    local: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ExportSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier]
  }
}

@JSImport("babel-types", "exportSpecifier")
@js.native
object exportSpecifier extends js.Object {
  def apply(): ExportSpecifier = js.native
  def apply(local: Identifier): ExportSpecifier = js.native
  def apply(local: Identifier, exported: Identifier): ExportSpecifier = js.native
}

