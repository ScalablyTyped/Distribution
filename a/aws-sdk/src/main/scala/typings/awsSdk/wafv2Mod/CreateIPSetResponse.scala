package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetResponse extends js.Object {
  /**
    * High-level information about an IPSet, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage an IPSet, and the ARN, that you provide to the IPSetReferenceStatement to use the address set in a Rule.
    */
  var Summary: js.UndefOr[IPSetSummary] = js.native
}

object CreateIPSetResponse {
  @scala.inline
  def apply(Summary: IPSetSummary = null): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetResponse]
  }
}

