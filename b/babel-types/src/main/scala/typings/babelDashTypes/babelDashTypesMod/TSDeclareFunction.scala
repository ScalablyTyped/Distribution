package typings.babelDashTypes.babelDashTypesMod

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
  var id: Identifier | Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var typeParameters: TypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_TSDeclareFunction: typings.babelDashTypes.babelDashTypesStrings.TSDeclareFunction
}

@JSImport("babel-types", "TSDeclareFunction")
@js.native
object TSDeclareFunction extends js.Object {
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | Null],
    params: js.Array[LVal]
  ): TSDeclareFunction = js.native
  def apply(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): TSDeclareFunction = js.native
}

