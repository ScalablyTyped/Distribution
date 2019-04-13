package typings
package betterDashQueueLib.betterDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("better-queue", "Ticket")
@js.native
class Ticket ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def on(event: TicketEvent, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
}

