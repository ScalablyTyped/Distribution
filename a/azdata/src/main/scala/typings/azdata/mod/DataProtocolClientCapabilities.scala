package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProtocolClientCapabilities extends js.Object {
  var hostName: String
  var hostVersion: String
}

object DataProtocolClientCapabilities {
  @scala.inline
  def apply(hostName: String, hostVersion: String): DataProtocolClientCapabilities = {
    val __obj = js.Dynamic.literal(hostName = hostName.asInstanceOf[js.Any], hostVersion = hostVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataProtocolClientCapabilities]
  }
}

