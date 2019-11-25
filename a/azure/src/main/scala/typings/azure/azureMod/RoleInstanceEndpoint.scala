package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleInstanceEndpoint extends js.Object {
  var address: String
  var port: Double
  var protocol: String
}

object RoleInstanceEndpoint {
  @scala.inline
  def apply(address: String, port: Double, protocol: String): RoleInstanceEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoleInstanceEndpoint]
  }
}

