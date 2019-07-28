package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportAllDeclaration
  extends Node
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  var source: StringLiteral
  @JSName("type")
  var type_ExportAllDeclaration: typings.babelDashTypes.babelDashTypesStrings.ExportAllDeclaration
}

object ExportAllDeclaration {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ExportAllDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, source = source, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

