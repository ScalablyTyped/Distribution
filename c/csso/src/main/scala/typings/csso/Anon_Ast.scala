package typings.csso

import typings.cssDashTree.cssDashTreeMod.CssNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ast extends js.Object {
  var ast: CssNode
}

object Anon_Ast {
  @scala.inline
  def apply(ast: CssNode): Anon_Ast = {
    val __obj = js.Dynamic.literal(ast = ast)
  
    __obj.asInstanceOf[Anon_Ast]
  }
}

