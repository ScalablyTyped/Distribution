package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "classProperty")
@js.native
object classProperty extends js.Object {
  def apply(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    value: js.UndefOr[Expression | Null],
    typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null],
    decorators: js.UndefOr[js.Array[Decorator_] | Null],
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean]
  ): ClassProperty_ = js.native
}

