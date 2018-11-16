package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEmitter extends js.Object {
  def emit(args: js.Any*): scala.Unit
  def listen(listener: Listener): Unlisten
}

