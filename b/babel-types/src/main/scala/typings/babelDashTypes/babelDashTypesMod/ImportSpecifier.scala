package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSpecifier
  extends Node
     with ModuleSpecifier {
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ImportSpecifier: typings.babelDashTypes.babelDashTypesStrings.ImportSpecifier
}

object ImportSpecifier {
  @scala.inline
  def apply(
    end: Double,
    imported: Identifier,
    loc: SourceLocation,
    local: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ImportSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier]
  }
}

@JSImport("babel-types", "importSpecifier")
@js.native
object importSpecifier extends js.Object {
  def apply(): ImportSpecifier = js.native
  def apply(local: Identifier): ImportSpecifier = js.native
  def apply(local: Identifier, imported: Identifier): ImportSpecifier = js.native
}

