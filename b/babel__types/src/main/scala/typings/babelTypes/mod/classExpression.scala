package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "classExpression")
@js.native
object classExpression extends js.Object {
  def apply(id: js.UndefOr[Identifier_ | Null], superClass: js.UndefOr[Expression | Null], body: ClassBody_): ClassExpression_ = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody_,
    decorators: js.Array[Decorator_]
  ): ClassExpression_ = js.native
}

