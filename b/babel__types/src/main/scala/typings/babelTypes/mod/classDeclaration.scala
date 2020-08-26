package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "classDeclaration")
@js.native
object classDeclaration extends js.Object {
  def apply(id: Identifier_, superClass: js.UndefOr[scala.Nothing], body: ClassBody_): ClassDeclaration_ = js.native
  def apply(
    id: Identifier_,
    superClass: js.UndefOr[scala.Nothing],
    body: ClassBody_,
    decorators: js.Array[Decorator_]
  ): ClassDeclaration_ = js.native
  def apply(id: Identifier_, superClass: Null, body: ClassBody_): ClassDeclaration_ = js.native
  def apply(id: Identifier_, superClass: Null, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
  def apply(id: Identifier_, superClass: Expression, body: ClassBody_): ClassDeclaration_ = js.native
  def apply(id: Identifier_, superClass: Expression, body: ClassBody_, decorators: js.Array[Decorator_]): ClassDeclaration_ = js.native
}

