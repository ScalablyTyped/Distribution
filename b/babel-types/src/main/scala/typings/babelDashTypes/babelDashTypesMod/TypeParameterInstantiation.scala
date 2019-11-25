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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterInstantiation]
  }
}

@JSImport("babel-types", "typeParameterInstantiation")
@js.native
object typeParameterInstantiation extends js.Object {
  def apply(): TypeParameterInstantiation = js.native
  def apply(params: js.Array[FlowTypeAnnotation]): TypeParameterInstantiation = js.native
}

