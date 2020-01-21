package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "functionTypeAnnotation")
@js.native
object functionTypeAnnotation extends js.Object {
  def apply(): FunctionTypeAnnotation_ = js.native
  def apply(typeParameters: TypeParameterDeclaration_): FunctionTypeAnnotation_ = js.native
  def apply(typeParameters: TypeParameterDeclaration_, params: js.Array[FunctionTypeParam_]): FunctionTypeAnnotation_ = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_
  ): FunctionTypeAnnotation_ = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation
  ): FunctionTypeAnnotation_ = js.native
}

