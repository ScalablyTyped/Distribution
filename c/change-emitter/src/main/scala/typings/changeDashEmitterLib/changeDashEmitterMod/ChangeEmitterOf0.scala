package typings
package changeDashEmitterLib.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf0 extends js.Object {
  def emit(): scala.Unit
  def listen(listener: ListenerOf0): Unlisten
}

object ChangeEmitterOf0 {
  @scala.inline
  def apply(emit: js.Function0[scala.Unit], listen: js.Function1[ListenerOf0, Unlisten]): ChangeEmitterOf0 = {
    val __obj = js.Dynamic.literal(emit = emit, listen = listen)
  
    __obj.asInstanceOf[ChangeEmitterOf0]
  }
}

