package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "forStatement")
@js.native
object forStatement extends js.Object {
  def apply(
    init: js.UndefOr[Expression | Null | VariableDeclaration_],
    test: js.UndefOr[Expression | Null],
    update: js.UndefOr[Expression | Null],
    body: Statement
  ): ForStatement_ = js.native
}

