package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var params: js.Array[FunctionTypeParam]
  var rest: FunctionTypeParam
  var returnType: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_FunctionTypeAnnotation: typings.babelDashTypes.babelDashTypesStrings.FunctionTypeAnnotation
}

object FunctionTypeAnnotation {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowTypeAnnotation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.FunctionTypeAnnotation,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, params = params, rest = rest, returnType = returnType, start = start, typeParameters = typeParameters)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionTypeAnnotation]
  }
}

@JSImport("babel-types", "functionTypeAnnotation")
@js.native
object functionTypeAnnotation extends js.Object {
  def apply(): FunctionTypeAnnotation = js.native
  def apply(typeParameters: TypeParameterDeclaration): FunctionTypeAnnotation = js.native
  def apply(typeParameters: TypeParameterDeclaration, params: js.Array[FunctionTypeParam]): FunctionTypeAnnotation = js.native
  def apply(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam
  ): FunctionTypeAnnotation = js.native
  def apply(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowTypeAnnotation
  ): FunctionTypeAnnotation = js.native
}

