package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "objectProperty")
@js.native
object objectProperty extends js.Object {
  def apply(
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    value: Expression | PatternLike,
    computed: js.UndefOr[Boolean],
    shorthand: js.UndefOr[Boolean],
    decorators: js.UndefOr[js.Array[Decorator_] | Null]
  ): ObjectProperty_ = js.native
}

