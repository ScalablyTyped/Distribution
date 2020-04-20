package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChangeTokenStatusRequest extends js.Object {
  /**
    * The change token for which you want to get the status. This change token was previously returned in the GetChangeToken response.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
}

object GetChangeTokenStatusRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken): GetChangeTokenStatusRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenStatusRequest]
  }
}

