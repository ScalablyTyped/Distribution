package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationStatus extends js.Object {
  /**
    * The state of the target network association.
    */
  var Code: js.UndefOr[AssociationStatusCode] = js.native
  /**
    * A message about the status of the target network association, if applicable.
    */
  var Message: js.UndefOr[String] = js.native
}

object AssociationStatus {
  @scala.inline
  def apply(Code: AssociationStatusCode = null, Message: String = null): AssociationStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationStatus]
  }
}

