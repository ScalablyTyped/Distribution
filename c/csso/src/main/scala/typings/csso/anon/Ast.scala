package typings.csso.anon

import typings.cssTree.mod.CssNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ast extends js.Object {
  var ast: CssNode = js.native
}

object Ast {
  @scala.inline
  def apply(ast: CssNode): Ast = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
  @scala.inline
  implicit class AstOps[Self <: Ast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAst(value: CssNode): Self = this.set("ast", value.asInstanceOf[js.Any])
  }
  
}

