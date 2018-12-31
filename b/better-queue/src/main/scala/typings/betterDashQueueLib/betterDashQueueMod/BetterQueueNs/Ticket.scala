package typings
package betterDashQueueLib.betterDashQueueMod.BetterQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ticket
  extends nodeLib.NodeJSNs.EventEmitter {
  def on(event: TicketEvent, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
}

