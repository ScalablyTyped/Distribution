package typings.cesium.mod

import typings.cesium.mod.Event.RemoveCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Event")
@js.native
class Event[T /* <: js.Array[_] */] () extends js.Object {
  var numberOfListeners: Double = js.native
  def addEventListener(listener: js.Function1[/* args */ T, Unit]): RemoveCallback = js.native
  def addEventListener(listener: js.Function1[/* args */ T, Unit], scope: js.Any): RemoveCallback = js.native
  def raiseEvent(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Unit = js.native
  def removeEventListener(listener: js.Function1[/* args */ T, Unit]): Boolean = js.native
  def removeEventListener(listener: js.Function1[/* args */ T, Unit], scope: js.Any): Boolean = js.native
}

@JSImport("cesium", "Event")
@js.native
object Event extends js.Object {
  type RemoveCallback = js.Function0[Unit]
}

