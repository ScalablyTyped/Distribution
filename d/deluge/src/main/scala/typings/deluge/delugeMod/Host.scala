package typings.deluge.delugeMod

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
    val __obj = js.Dynamic.literal(id = id, ip = ip, port = port, status = status)
  
    __obj.asInstanceOf[Host]
  }
}

