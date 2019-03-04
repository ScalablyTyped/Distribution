package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaProperty
  extends Node
     with Expression {
  var meta: Identifier
  var property: Identifier
  @JSName("type")
  var type_MetaProperty: babelDashTypesLib.babelDashTypesLibStrings.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    meta: Identifier,
    property: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.MetaProperty,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, meta = meta, property = property, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MetaProperty]
  }
}

