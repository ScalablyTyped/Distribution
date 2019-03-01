package typings
package cssoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ast extends js.Object {
  var ast: cssDashTreeLib.cssDashTreeMod.CssNode
}

object Anon_Ast {
  @scala.inline
  def apply(ast: cssDashTreeLib.cssDashTreeMod.CssNode): Anon_Ast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast)
    __obj.asInstanceOf[Anon_Ast]
  }
}

