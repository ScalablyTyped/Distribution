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
  @scala.inline
  implicit class SocketAddressOps[Self <: SocketAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Integer): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

