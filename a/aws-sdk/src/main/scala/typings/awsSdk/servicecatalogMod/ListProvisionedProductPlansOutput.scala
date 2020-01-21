package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedProductPlansOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the plans.
    */
  var ProvisionedProductPlans: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductPlans] = js.native
}

object ListProvisionedProductPlansOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProvisionedProductPlans: ProvisionedProductPlans = null): ListProvisionedProductPlansOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisionedProductPlans != null) __obj.updateDynamic("ProvisionedProductPlans")(ProvisionedProductPlans.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisionedProductPlansOutput]
  }
}

