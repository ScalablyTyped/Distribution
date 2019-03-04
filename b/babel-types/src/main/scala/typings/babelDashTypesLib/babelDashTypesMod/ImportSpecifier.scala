package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSpecifier
  extends Node
     with ModuleSpecifier {
  var imported: Identifier
  var local: Identifier
  @JSName("type")
  var type_ImportSpecifier: babelDashTypesLib.babelDashTypesLibStrings.ImportSpecifier
}

object ImportSpecifier {
  @scala.inline
  def apply(
    end: scala.Double,
    imported: Identifier,
    loc: SourceLocation,
    local: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ImportSpecifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ImportSpecifier = {
    val __obj = js.Dynamic.literal(end = end, imported = imported, loc = loc, local = local, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportSpecifier]
  }
}

