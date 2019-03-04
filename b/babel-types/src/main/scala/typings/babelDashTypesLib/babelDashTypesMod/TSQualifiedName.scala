package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSQualifiedName
  extends Node
     with TSEntityName {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: babelDashTypesLib.babelDashTypesLibStrings.TSQualifiedName
}

object TSQualifiedName {
  @scala.inline
  def apply(
    end: scala.Double,
    left: TSEntityName,
    loc: SourceLocation,
    right: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSQualifiedName,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSQualifiedName = {
    val __obj = js.Dynamic.literal(end = end, left = left, loc = loc, right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSQualifiedName]
  }
}

