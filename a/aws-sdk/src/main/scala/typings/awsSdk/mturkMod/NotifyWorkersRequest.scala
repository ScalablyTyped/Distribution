package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWorkersRequest extends js.Object {
  /**
    * The text of the email message to send. Can include up to 4,096 characters
    */
  var MessageText: String = js.native
  /**
    * The subject line of the email message to send. Can include up to 200 characters.
    */
  var Subject: String = js.native
  /**
    * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
    */
  var WorkerIds: CustomerIdList = js.native
}

object NotifyWorkersRequest {
  @scala.inline
  def apply(MessageText: String, Subject: String, WorkerIds: CustomerIdList): NotifyWorkersRequest = {
    val __obj = js.Dynamic.literal(MessageText = MessageText.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], WorkerIds = WorkerIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotifyWorkersRequest]
  }
}

