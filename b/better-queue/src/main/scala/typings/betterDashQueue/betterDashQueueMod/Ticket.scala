package typings.betterDashQueue.betterDashQueueMod

import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("better-queue", "Ticket")
@js.native
class Ticket () extends EventEmitter {
  def on(event: TicketEvent, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
}

