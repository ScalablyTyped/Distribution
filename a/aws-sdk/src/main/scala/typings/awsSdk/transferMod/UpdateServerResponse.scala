package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that the user account is assigned to.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}

object UpdateServerResponse {
  @scala.inline
  def apply(ServerId: ServerId): UpdateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerResponse]
  }
}

