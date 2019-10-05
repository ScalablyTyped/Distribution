package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-tree", "walk")
@js.native
object walk extends js.Object {
  def apply(ast: CssNode, options: EnterOrLeaveFn): Unit = js.native
  def apply(ast: CssNode, options: WalkOptions): Unit = js.native
}

