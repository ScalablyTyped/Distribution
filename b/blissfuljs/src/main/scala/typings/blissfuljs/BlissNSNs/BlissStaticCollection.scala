package typings.blissfuljs.BlissNSNs

import typings.blissfuljs.Array
import typings.blissfuljs.Element
import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissStaticCollection extends BlissStatic {
  def apply(expr: Node): js.Array[Node] = js.native
  def apply(expr: Node, context: Element): js.Array[Node] = js.native
  def apply(expr: Window): js.Array[Window] = js.native
  def apply(expr: Window, context: Element): js.Array[Window] = js.native
  def apply[T](expr: js.Object): Array[T] = js.native
  def apply[T](expr: js.Object, context: Element): Array[T] = js.native
}

