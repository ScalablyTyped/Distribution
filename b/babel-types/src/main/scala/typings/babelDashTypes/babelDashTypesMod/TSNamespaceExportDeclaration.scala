package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSNamespaceExportDeclaration
  extends Node
     with Statement {
  var id: Identifier
  @JSName("type")
  var type_TSNamespaceExportDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSNamespaceExportDeclaration
}

object TSNamespaceExportDeclaration {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSNamespaceExportDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSNamespaceExportDeclaration]
  }
}

