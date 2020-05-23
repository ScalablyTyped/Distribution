package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Distance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceTool extends js.Object {
  def close(): Unit
  def ondrawend(event: Distance): Unit
  def open(): Boolean
}

object DistanceTool {
  @scala.inline
  def apply(close: () => Unit, ondrawend: Distance => Unit, open: () => Boolean): DistanceTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DistanceTool]
  }
}

