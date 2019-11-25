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
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTypeAnnotation]
  }
}

@JSImport("babel-types", "typeofTypeAnnotation")
@js.native
object typeofTypeAnnotation extends js.Object {
  def apply(): TypeofTypeAnnotation = js.native
  def apply(argument: FlowTypeAnnotation): TypeofTypeAnnotation = js.native
}

