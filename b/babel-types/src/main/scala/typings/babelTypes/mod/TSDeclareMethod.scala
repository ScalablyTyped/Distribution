package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.public
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareMethod extends Node {
  var `abstract`: Boolean | Null = js.native
  var access: public | `private` | `protected` | Null = js.native
  var accessibility: public | `private` | `protected` | Null = js.native
  var async: Boolean = js.native
  var computed: Boolean = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var generator: Boolean = js.native
  var key: Expression = js.native
  var kind: get | set | method | constructor = js.native
  var optional: Boolean | Null = js.native
  var params: js.Array[LVal] = js.native
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null = js.native
  var static: Boolean | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_TSDeclareMethod: typings.babelTypes.babelTypesStrings.TSDeclareMethod = js.native
}

@JSImport("babel-types", "TSDeclareMethod")
@js.native
object TSDeclareMethod extends js.Object {
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[scala.Nothing],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(decorators: js.Array[Decorator_], key: Expression, typeParameters: Null, params: js.Array[LVal]): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(decorators: js.Array[Decorator_], key: Expression, typeParameters: Noop_, params: js.Array[LVal]): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal]): TSDeclareMethod = js.native
  def apply(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal], returnType: Noop_): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(decorators: Null, key: Expression, typeParameters: Noop_, params: js.Array[LVal]): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
}

