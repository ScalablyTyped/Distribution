package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var argument: FlowTypeAnnotation
  @JSName("type")
  var type_TypeofTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.TypeofTypeAnnotation
}

object TypeofTypeAnnotation {
  @scala.inline
  def apply(
    argument: FlowTypeAnnotation,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeofTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeofTypeAnnotation]
  }
}

