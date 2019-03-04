package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var elementType: FlowTypeAnnotation
  @JSName("type")
  var type_ArrayTypeAnnotation: babelDashTypesLib.babelDashTypesLibStrings.ArrayTypeAnnotation
}

object ArrayTypeAnnotation {
  @scala.inline
  def apply(
    elementType: FlowTypeAnnotation,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ArrayTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayTypeAnnotation]
  }
}

