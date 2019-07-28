package typings.cliDashCursor

import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-cursor", JSImport.Namespace)
@js.native
object cliDashCursorMod extends js.Object {
  def hide(): Unit = js.native
  def hide(stream: WritableStream): Unit = js.native
  def show(): Unit = js.native
  def show(stream: WritableStream): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(force: Boolean): Unit = js.native
  def toggle(force: Boolean, stream: WritableStream): Unit = js.native
}

