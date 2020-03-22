package typings.componentEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter[Event] extends js.Object {
  def emit(event: Event, args: js.Any*): Emitter[String] = js.native
  def hasListeners(event: Event): Boolean = js.native
  def listeners(event: Event): js.Array[js.Function] = js.native
  def off(): Emitter[String] = js.native
  def off(event: Event): Emitter[String] = js.native
  def off(event: Event, listener: js.Function): Emitter[String] = js.native
  def on(event: Event, listener: js.Function): Emitter[String] = js.native
  def once(event: Event, listener: js.Function): Emitter[String] = js.native
}

