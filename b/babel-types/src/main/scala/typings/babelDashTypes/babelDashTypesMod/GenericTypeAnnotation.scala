package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var id: Identifier
  var typeParameters: TypeParameterInstantiation
  @JSName("type")
  var type_GenericTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.GenericTypeAnnotation
}

object GenericTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.GenericTypeAnnotation,
    typeParameters: TypeParameterInstantiation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[GenericTypeAnnotation]
  }
}

@JSImport("babel-types", "genericTypeAnnotation")
@js.native
object genericTypeAnnotation extends js.Object {
  def apply(): GenericTypeAnnotation = js.native
  def apply(id: Identifier): GenericTypeAnnotation = js.native
  def apply(id: Identifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
}

