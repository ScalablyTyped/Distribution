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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

@JSImport("babel-types", "exportAllDeclaration")
@js.native
object exportAllDeclaration extends js.Object {
  def apply(): ExportAllDeclaration = js.native
  def apply(source: StringLiteral): ExportAllDeclaration = js.native
}

