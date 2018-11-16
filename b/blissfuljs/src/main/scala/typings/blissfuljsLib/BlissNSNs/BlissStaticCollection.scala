package typings
package blissfuljsLib.BlissNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlissStaticCollection extends BlissStatic {
  def apply(expr: stdLib.Node): js.Array[stdLib.Node] = js.native
  def apply(expr: stdLib.Node, context: blissfuljsLib.Element): js.Array[stdLib.Node] = js.native
  def apply(expr: stdLib.Window): js.Array[stdLib.Window] = js.native
  def apply(expr: stdLib.Window, context: blissfuljsLib.Element): js.Array[stdLib.Window] = js.native
  def apply[T](expr: js.Object): blissfuljsLib.Array[T] = js.native
  def apply[T](expr: js.Object, context: blissfuljsLib.Element): blissfuljsLib.Array[T] = js.native
}

