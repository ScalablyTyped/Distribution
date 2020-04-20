package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServerRequest extends js.Object {
  /**
    * The ID of the server to delete.
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerName: ServerName): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
}

