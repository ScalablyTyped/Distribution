package typings
package delugeLib.delugeMod.delugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var id: java.lang.String
  var ip: java.lang.String
  var port: scala.Double
  var status: java.lang.String
}

object Host {
  @scala.inline
  def apply(id: java.lang.String, ip: java.lang.String, port: scala.Double, status: java.lang.String): Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Host]
  }
}

