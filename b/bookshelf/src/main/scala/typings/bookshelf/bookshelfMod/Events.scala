package typings.bookshelf.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Events")
@js.native
abstract class Events[T] () extends js.Object {
  def off(): Unit = js.native
  def off(event: String): Unit = js.native
  def on(): Unit = js.native
  def on(event: String): Unit = js.native
  def on(event: String, callback: EventFunction[T]): Unit = js.native
  def on(event: String, callback: EventFunction[T], context: js.Any): Unit = js.native
  def once(event: String, callback: EventFunction[T]): Unit = js.native
  def once(event: String, callback: EventFunction[T], context: js.Any): Unit = js.native
  def trigger(): Unit = js.native
  def trigger(event: String, args: js.Any*): Unit = js.native
  def triggerThen(name: String, args: js.Any*): typings.bluebird.bluebirdMod.^[_] = js.native
}

