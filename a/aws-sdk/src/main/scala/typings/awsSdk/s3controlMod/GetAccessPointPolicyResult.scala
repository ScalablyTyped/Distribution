package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointPolicyResult extends js.Object {
  /**
    * The access point policy associated with the specified access point.
    */
  var Policy: js.UndefOr[typings.awsSdk.s3controlMod.Policy] = js.native
}

object GetAccessPointPolicyResult {
  @scala.inline
  def apply(Policy: Policy = null): GetAccessPointPolicyResult = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPolicyResult]
  }
}

