package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_TypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.TypeAnnotation
}

object TypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TypeAnnotation,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TypeAnnotation]
  }
}

@JSImport("babel-types", "typeAnnotation")
@js.native
object typeAnnotation extends js.Object {
  def apply(): TypeAnnotation = js.native
  def apply(typeAnnotation: FlowTypeAnnotation): TypeAnnotation = js.native
}

