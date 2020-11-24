package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-tree", "walk")
@js.native
object walk extends js.Object {
  
  def apply(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = js.native
  def apply(ast: CssNode, options: WalkOptions): Unit = js.native
}
