package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebACLResponse extends js.Object {
  /**
    * High-level information about a WebACL, returned by operations like create and list. This provides information like the ID, that you can use to retrieve and manage a WebACL, and the ARN, that you provide to operations like AssociateWebACL.
    */
  var Summary: js.UndefOr[WebACLSummary] = js.native
}

object CreateWebACLResponse {
  @scala.inline
  def apply(Summary: WebACLSummary = null): CreateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLResponse]
  }
}

