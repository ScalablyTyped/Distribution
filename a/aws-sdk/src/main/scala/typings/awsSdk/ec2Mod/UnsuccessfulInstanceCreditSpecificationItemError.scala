package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulInstanceCreditSpecificationItemError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[UnsuccessfulInstanceCreditSpecificationErrorCode] = js.native
  /**
    * The applicable error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object UnsuccessfulInstanceCreditSpecificationItemError {
  @scala.inline
  def apply(Code: UnsuccessfulInstanceCreditSpecificationErrorCode = null, Message: String = null): UnsuccessfulInstanceCreditSpecificationItemError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItemError]
  }
}

