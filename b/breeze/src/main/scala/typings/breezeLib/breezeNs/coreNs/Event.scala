package typings
package breezeLib.breezeNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.core.Event")
@js.native
class Event protected () extends js.Object {
  def this(name: java.lang.String, publisher: js.Any) = this()
  def this(name: java.lang.String, publisher: js.Any, defaultErrorCallback: ErrorCallback) = this()
  def clear(): scala.Unit = js.native
  def publish(data: js.Any): scala.Unit = js.native
  def publish(data: js.Any, publishAsync: scala.Boolean): scala.Unit = js.native
  def publish(data: js.Any, publishAsync: scala.Boolean, errorCallback: ErrorCallback): scala.Unit = js.native
  def publishAsync(data: js.Any): scala.Unit = js.native
  def publishAsync(data: js.Any, errorCallback: ErrorCallback): scala.Unit = js.native
  def subscribe(): scala.Double = js.native
  def subscribe(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Double = js.native
  def unsubscribe(unsubKey: scala.Double): scala.Boolean = js.native
}

/* static members */
@JSGlobal("breeze.core.Event")
@js.native
object Event extends js.Object {
  def enable(eventName: java.lang.String, target: js.Any): scala.Unit = js.native
  def enable(eventName: java.lang.String, target: js.Any, isEnabled: js.Function): scala.Unit = js.native
  def enable(eventName: java.lang.String, target: js.Any, isEnabled: scala.Boolean): scala.Unit = js.native
  def isEnabled(eventName: java.lang.String, target: js.Any): scala.Boolean = js.native
}

