package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReason extends js.Object {
  /**
    * The corresponding description for the status reason code.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * A code that represents a reason for the control status. For the list of status reason codes and their meanings, see Standards-related information in the ASFF in the AWS Security Hub User Guide. 
    */
  var ReasonCode: NonEmptyString = js.native
}

object StatusReason {
  @scala.inline
  def apply(ReasonCode: NonEmptyString, Description: NonEmptyString = null): StatusReason = {
    val __obj = js.Dynamic.literal(ReasonCode = ReasonCode.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
}

