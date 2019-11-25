package typings.cote

import typings.cote.coteMod.Monitor
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Monitor extends js.Object {
  var monitor: Monitor
  var server: Server
}

object Anon_Monitor {
  @scala.inline
  def apply(monitor: Monitor, server: Server): Anon_Monitor = {
    val __obj = js.Dynamic.literal(monitor = monitor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Monitor]
  }
}

