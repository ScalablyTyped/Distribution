package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "functionTypeAnnotation")
@js.native
object functionTypeAnnotation extends js.Object {
  def apply(
    typeParameters: js.UndefOr[Null | TypeParameterDeclaration_],
    params: js.Array[FunctionTypeParam_],
    rest: js.UndefOr[FunctionTypeParam_ | Null],
    returnType: FlowType
  ): FunctionTypeAnnotation_ = js.native
}

