package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareFunction
  extends Node
     with Declaration
     with Statement {
  var async: Boolean
  var declare: Boolean | Null
  var generator: Boolean
  var id: Identifier_ | Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null
  @JSName("type")
  var type_TSDeclareFunction: typings.babelTypes.babelTypesStrings.TSDeclareFunction
}

@JSImport("babel-types", "TSDeclareFunction")
@js.native
object TSDeclareFunction extends js.Object {
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal]
  ): TSDeclareFunction = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_
  ): TSDeclareFunction = js.native
}

