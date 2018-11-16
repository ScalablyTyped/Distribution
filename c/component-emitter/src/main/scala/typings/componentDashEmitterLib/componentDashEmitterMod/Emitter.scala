package typings
package componentDashEmitterLib.componentDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def hasListeners(event: java.lang.String): scala.Boolean = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def off(): Emitter = js.native
  def off(event: java.lang.String): Emitter = js.native
  def off(event: java.lang.String, listener: js.Function): Emitter = js.native
  def on(event: java.lang.String, listener: js.Function): Emitter = js.native
  def once(event: java.lang.String, listener: js.Function): Emitter = js.native
}

