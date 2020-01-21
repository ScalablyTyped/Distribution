package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeTokenStatusResponse extends js.Object {
  /**
    * The status of the change token.
    */
  var ChangeTokenStatus: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeTokenStatus] = js.native
}

object GetChangeTokenStatusResponse {
  @scala.inline
  def apply(ChangeTokenStatus: ChangeTokenStatus = null): GetChangeTokenStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeTokenStatus != null) __obj.updateDynamic("ChangeTokenStatus")(ChangeTokenStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenStatusResponse]
  }
}

