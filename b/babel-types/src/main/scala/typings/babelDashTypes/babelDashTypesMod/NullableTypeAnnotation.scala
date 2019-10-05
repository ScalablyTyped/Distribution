package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_NullableTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.NullableTypeAnnotation
}

object NullableTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.NullableTypeAnnotation,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[NullableTypeAnnotation]
  }
}

@JSImport("babel-types", "nullableTypeAnnotation")
@js.native
object nullableTypeAnnotation extends js.Object {
  def apply(): NullableTypeAnnotation = js.native
  def apply(typeAnnotation: FlowTypeAnnotation): NullableTypeAnnotation = js.native
}

