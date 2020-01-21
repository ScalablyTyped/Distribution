package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisionedProductPlanOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the plan.
    */
  var ProvisionedProductPlanDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductPlanDetails] = js.native
  /**
    * Information about the resource changes that will occur when the plan is executed.
    */
  var ResourceChanges: js.UndefOr[typings.awsSdk.servicecatalogMod.ResourceChanges] = js.native
}

object DescribeProvisionedProductPlanOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProvisionedProductPlanDetails: ProvisionedProductPlanDetails = null,
    ResourceChanges: ResourceChanges = null
  ): DescribeProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisionedProductPlanDetails != null) __obj.updateDynamic("ProvisionedProductPlanDetails")(ProvisionedProductPlanDetails.asInstanceOf[js.Any])
    if (ResourceChanges != null) __obj.updateDynamic("ResourceChanges")(ResourceChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
  }
}

