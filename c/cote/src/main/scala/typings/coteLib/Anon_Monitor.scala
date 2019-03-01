package typings
package coteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Monitor extends js.Object {
  var monitor: coteLib.coteMod.Monitor
  var server: nodeLib.httpMod.Server
}

object Anon_Monitor {
  @scala.inline
  def apply(monitor: coteLib.coteMod.Monitor, server: nodeLib.httpMod.Server): Anon_Monitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("monitor")(monitor)
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_Monitor]
  }
}

