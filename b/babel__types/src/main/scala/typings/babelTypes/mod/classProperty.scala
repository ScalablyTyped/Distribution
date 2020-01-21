package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "classProperty")
@js.native
object classProperty extends js.Object {
  def apply(key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression): ClassProperty_ = js.native
  def apply(key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression, value: Expression): ClassProperty_ = js.native
  def apply(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    value: Expression,
    typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_
  ): ClassProperty_ = js.native
  def apply(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    value: Expression,
    typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_,
    decorators: js.Array[Decorator_]
  ): ClassProperty_ = js.native
  def apply(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    value: Expression,
    typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_,
    decorators: js.Array[Decorator_],
    computed: Boolean
  ): ClassProperty_ = js.native
  def apply(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    value: Expression,
    typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_,
    decorators: js.Array[Decorator_],
    computed: Boolean,
    _static: Boolean
  ): ClassProperty_ = js.native
}

