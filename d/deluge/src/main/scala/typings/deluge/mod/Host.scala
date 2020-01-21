package typings.deluge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var id: String
  var ip: String
  var port: Double
  var status: String
}

object Host {
  @scala.inline
  def apply(id: String, ip: String, port: Double, status: String): Host = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Host]
  }
}

