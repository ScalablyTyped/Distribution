package typings.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
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

