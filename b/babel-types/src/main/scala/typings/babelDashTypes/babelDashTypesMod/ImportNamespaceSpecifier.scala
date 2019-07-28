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
    val __obj = js.Dynamic.literal(end = end, loc = loc, local = local, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
}

