package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketAddress extends js.Object {
  /**
    * Name of a socket address.
    */
  var name: String = js.native
  /**
    * Port of a socket address.
    */
  var port: Integer = js.native
}

object SocketAddress {
  @scala.inline
  def apply(name: String, port: Integer): SocketAddress = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketAddress]
  }
}

