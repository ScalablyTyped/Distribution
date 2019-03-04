package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDefaultSpecifier
  extends Node
     with ModuleSpecifier {
  var local: Identifier
  @JSName("type")
  var type_ImportDefaultSpecifier: babelDashTypesLib.babelDashTypesLibStrings.ImportDefaultSpecifier
}

object ImportDefaultSpecifier {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    local: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ImportDefaultSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, local = local, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
}

