package typings.componentEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  def emit(event: String, args: js.Any*): Emitter = js.native
  def hasListeners(event: String): Boolean = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def off(): Emitter = js.native
  def off(event: String): Emitter = js.native
  def off(event: String, listener: js.Function): Emitter = js.native
  def on(event: String, listener: js.Function): Emitter = js.native
  def once(event: String, listener: js.Function): Emitter = js.native
}

