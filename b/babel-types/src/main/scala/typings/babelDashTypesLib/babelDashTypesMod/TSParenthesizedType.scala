package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParenthesizedType
  extends Node
     with TSType {
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSParenthesizedType: babelDashTypesLib.babelDashTypesLibStrings.TSParenthesizedType
}

object TSParenthesizedType {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSParenthesizedType,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSParenthesizedType = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSParenthesizedType]
  }
}

