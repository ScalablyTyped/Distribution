package typings.csso.anon

import typings.cssTree.mod.CssNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ast extends js.Object {
  var ast: CssNode
}

object Ast {
  @scala.inline
  def apply(ast: CssNode): Ast = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
}

