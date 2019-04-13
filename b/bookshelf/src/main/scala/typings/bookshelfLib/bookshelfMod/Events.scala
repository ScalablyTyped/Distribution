package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bookshelf", "Events")
@js.native
abstract class Events[T] () extends js.Object {
  def off(): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def on(): scala.Unit = js.native
  def on(event: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, callback: EventFunction[T]): scala.Unit = js.native
  def on(event: java.lang.String, callback: EventFunction[T], context: js.Any): scala.Unit = js.native
  def once(event: java.lang.String, callback: EventFunction[T]): scala.Unit = js.native
  def once(event: java.lang.String, callback: EventFunction[T], context: js.Any): scala.Unit = js.native
  def trigger(): scala.Unit = js.native
  def trigger(event: java.lang.String, args: js.Any*): scala.Unit = js.native
  def triggerThen(name: java.lang.String, args: js.Any*): bluebirdLib.bluebirdMod.^[_] = js.native
}

