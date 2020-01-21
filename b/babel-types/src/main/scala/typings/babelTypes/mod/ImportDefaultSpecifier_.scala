package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDefaultSpecifier_
  extends Node
     with ModuleSpecifier {
  var local: Identifier_
  @JSName("type")
  var type_ImportDefaultSpecifier_ : ImportDefaultSpecifier
}

object ImportDefaultSpecifier_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportDefaultSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDefaultSpecifier_]
  }
}

