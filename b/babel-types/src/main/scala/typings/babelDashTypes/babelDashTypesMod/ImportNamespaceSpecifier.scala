package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportNamespaceSpecifier
  extends Node
     with ModuleSpecifier {
  var local: Identifier
  @JSName("type")
  var type_ImportNamespaceSpecifier: typings.babelDashTypes.babelDashTypesStrings.ImportNamespaceSpecifier
}

object ImportNamespaceSpecifier {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    local: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ImportNamespaceSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
}

@JSImport("babel-types", "importNamespaceSpecifier")
@js.native
object importNamespaceSpecifier extends js.Object {
  def apply(): ImportNamespaceSpecifier = js.native
  def apply(local: Identifier): ImportNamespaceSpecifier = js.native
}

