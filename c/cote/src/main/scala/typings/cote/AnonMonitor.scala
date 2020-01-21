package typings.cote

import typings.cote.mod.Monitor
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonitor extends js.Object {
  var monitor: Monitor
  var server: Server
}

object AnonMonitor {
  @scala.inline
  def apply(monitor: Monitor, server: Server): AnonMonitor = {
    val __obj = js.Dynamic.literal(monitor = monitor.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMonitor]
  }
}

