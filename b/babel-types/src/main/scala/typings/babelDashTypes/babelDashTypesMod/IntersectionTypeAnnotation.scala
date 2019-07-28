package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  @JSName("type")
  var type_IntersectionTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.IntersectionTypeAnnotation
  var types: js.Array[FlowTypeAnnotation]
}

object IntersectionTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.IntersectionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, types = types)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[IntersectionTypeAnnotation]
  }
}

