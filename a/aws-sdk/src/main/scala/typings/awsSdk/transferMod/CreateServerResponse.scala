package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServerResponse extends js.Object {
  /**
    * The service-assigned ID of the file transfer protocol-enabled server that is created.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}

object CreateServerResponse {
  @scala.inline
  def apply(ServerId: ServerId): CreateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServerResponse]
  }
}

