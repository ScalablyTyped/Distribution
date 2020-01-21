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

trait TSDeclareMethod extends Node {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var computed: Boolean
  var decorators: js.Array[Decorator_] | Null
  var generator: Boolean
  var key: Expression
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null
  var static: Boolean | Null
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null
  @JSName("type")
  var type_TSDeclareMethod: typings.babelTypes.babelTypesStrings.TSDeclareMethod
}

@JSImport("babel-types", "TSDeclareMethod")
@js.native
object TSDeclareMethod extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator_] | Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator_] | Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_
  ): TSDeclareMethod = js.native
}

