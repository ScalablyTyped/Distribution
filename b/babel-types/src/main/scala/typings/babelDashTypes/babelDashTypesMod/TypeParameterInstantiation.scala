package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameterInstantiation
  extends Node
     with Flow {
  var params: js.Array[FlowTypeAnnotation]
  @JSName("type")
  var type_TypeParameterInstantiation: typings.babelDashTypes.babelDashTypesStrings.TypeParameterInstantiation
}

object TypeParameterInstantiation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FlowTypeAnnotation],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeParameterInstantiation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, params = params, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeParameterInstantiation]
  }
}

