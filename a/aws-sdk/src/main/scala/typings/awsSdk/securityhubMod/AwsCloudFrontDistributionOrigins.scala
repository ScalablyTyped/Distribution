package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudFrontDistributionOrigins extends js.Object {
  /**
    * A complex type that contains origins or origin groups for this distribution.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginItemList] = js.native
}

object AwsCloudFrontDistributionOrigins {
  @scala.inline
  def apply(Items: AwsCloudFrontDistributionOriginItemList = null): AwsCloudFrontDistributionOrigins = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudFrontDistributionOrigins]
  }
}

