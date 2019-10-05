package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`private`
import typings.babelDashTypes.babelDashTypesStrings.`protected`
import typings.babelDashTypes.babelDashTypesStrings.constructor
import typings.babelDashTypes.babelDashTypesStrings.get
import typings.babelDashTypes.babelDashTypesStrings.method
import typings.babelDashTypes.babelDashTypesStrings.public
import typings.babelDashTypes.babelDashTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSDeclareMethod extends Node {
  var `abstract`: Boolean | Null
  var access: public | `private` | `protected` | Null
  var accessibility: public | `private` | `protected` | Null
  var async: Boolean
  var computed: Boolean
  var decorators: js.Array[Decorator] | Null
  var generator: Boolean
  var key: Expression
  var kind: get | set | method | constructor
  var optional: Boolean | Null
  var params: js.Array[LVal]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | Null
  var static: Boolean | Null
  var typeParameters: TypeParameterDeclaration | Noop | Null
  @JSName("type")
  var type_TSDeclareMethod: typings.babelDashTypes.babelDashTypesStrings.TSDeclareMethod
}

@JSImport("babel-types", "TSDeclareMethod")
@js.native
object TSDeclareMethod extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | Null],
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): TSDeclareMethod = js.native
}

