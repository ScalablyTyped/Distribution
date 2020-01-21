package typings.csso

import typings.cssTree.mod.CssNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAst extends js.Object {
  var ast: CssNode
}

object AnonAst {
  @scala.inline
  def apply(ast: CssNode): AnonAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAst]
  }
}

