package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "functionExpression")
@js.native
object functionExpression extends js.Object {
  def apply(): FunctionExpression_ = js.native
  def apply(id: Identifier_): FunctionExpression_ = js.native
  def apply(id: Identifier_, params: js.Array[LVal]): FunctionExpression_ = js.native
  def apply(id: Identifier_, params: js.Array[LVal], body: BlockStatement_): FunctionExpression_ = js.native
  def apply(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean): FunctionExpression_ = js.native
  def apply(id: Identifier_, params: js.Array[LVal], body: BlockStatement_, generator: Boolean, async: Boolean): FunctionExpression_ = js.native
}

