package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBulkTemplatedEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendBulkTemplatedEmail action.
    */
  var Status: BulkEmailDestinationStatusList = js.native
}

object SendBulkTemplatedEmailResponse {
  @scala.inline
  def apply(Status: BulkEmailDestinationStatusList): SendBulkTemplatedEmailResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkTemplatedEmailResponse]
  }
}

