package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServerRequest extends js.Object {
  /**
    * A unique system-assigned identifier for a file transfer protocol-enabled server instance.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
}

