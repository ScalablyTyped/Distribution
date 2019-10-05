package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  @JSName("type")
  var type_UnionTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.UnionTypeAnnotation
  var types: js.Array[FlowTypeAnnotation]
}

object UnionTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.UnionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, types = types)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnionTypeAnnotation]
  }
}

@JSImport("babel-types", "unionTypeAnnotation")
@js.native
object unionTypeAnnotation extends js.Object {
  def apply(): UnionTypeAnnotation = js.native
  def apply(types: js.Array[FlowTypeAnnotation]): UnionTypeAnnotation = js.native
}

