package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryTaskFailureDetails extends js.Object {
  var Message: js.UndefOr[ErrorMessage] = js.native
}

object DataRepositoryTaskFailureDetails {
  @scala.inline
  def apply(Message: ErrorMessage = null): DataRepositoryTaskFailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRepositoryTaskFailureDetails]
  }
}

