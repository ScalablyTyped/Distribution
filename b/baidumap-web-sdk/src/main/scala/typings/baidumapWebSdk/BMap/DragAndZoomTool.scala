package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndZoomTool extends js.Object {
  def close(): Unit
  def ondrawend(event: typings.baidumapWebSdk.anon.Bounds): Unit
  def open(): Boolean
}

object DragAndZoomTool {
  @scala.inline
  def apply(close: () => Unit, ondrawend: typings.baidumapWebSdk.anon.Bounds => Unit, open: () => Boolean): DragAndZoomTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DragAndZoomTool]
  }
}

