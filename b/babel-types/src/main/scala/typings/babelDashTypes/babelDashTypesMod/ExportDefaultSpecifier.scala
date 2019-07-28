package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDefaultSpecifier
  extends Node
     with ModuleSpecifier {
  var exported: Identifier
  @JSName("type")
  var type_ExportDefaultSpecifier: typings.babelDashTypes.babelDashTypesStrings.ExportDefaultSpecifier
}

object ExportDefaultSpecifier {
  @scala.inline
  def apply(
    end: Double,
    exported: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ExportDefaultSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(end = end, exported = exported, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportDefaultSpecifier]
  }
}

