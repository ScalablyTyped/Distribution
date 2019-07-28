package typings.breeze.breezeNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.core.Event")
@js.native
class Event protected () extends js.Object {
  def this(name: String, publisher: js.Any) = this()
  def this(name: String, publisher: js.Any, defaultErrorCallback: ErrorCallback) = this()
  def clear(): Unit = js.native
  def publish(data: js.Any): Unit = js.native
  def publish(data: js.Any, publishAsync: Boolean): Unit = js.native
  def publish(data: js.Any, publishAsync: Boolean, errorCallback: ErrorCallback): Unit = js.native
  def publishAsync(data: js.Any): Unit = js.native
  def publishAsync(data: js.Any, errorCallback: ErrorCallback): Unit = js.native
  def subscribe(): Double = js.native
  def subscribe(callback: js.Function1[/* data */ js.Any, Unit]): Double = js.native
  def unsubscribe(unsubKey: Double): Boolean = js.native
}

/* static members */
@JSGlobal("breeze.core.Event")
@js.native
object Event extends js.Object {
  def enable(eventName: String, target: js.Any): Unit = js.native
  def enable(eventName: String, target: js.Any, isEnabled: js.Function): Unit = js.native
  def enable(eventName: String, target: js.Any, isEnabled: Boolean): Unit = js.native
  def isEnabled(eventName: String, target: js.Any): Boolean = js.native
}

