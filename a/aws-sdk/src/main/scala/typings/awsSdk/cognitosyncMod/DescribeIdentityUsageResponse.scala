package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityUsageResponse extends js.Object {
  /**
    * Usage information for the identity.
    */
  var IdentityUsage: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityUsage] = js.native
}

object DescribeIdentityUsageResponse {
  @scala.inline
  def apply(IdentityUsage: IdentityUsage = null): DescribeIdentityUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityUsage != null) __obj.updateDynamic("IdentityUsage")(IdentityUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityUsageResponse]
  }
}

