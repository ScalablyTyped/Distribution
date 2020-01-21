package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityPoolUsageResponse extends js.Object {
  /**
    * Information about the usage of the identity pool.
    */
  var IdentityPoolUsage: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolUsage] = js.native
}

object DescribeIdentityPoolUsageResponse {
  @scala.inline
  def apply(IdentityPoolUsage: IdentityPoolUsage = null): DescribeIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolUsage != null) __obj.updateDynamic("IdentityPoolUsage")(IdentityPoolUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityPoolUsageResponse]
  }
}

