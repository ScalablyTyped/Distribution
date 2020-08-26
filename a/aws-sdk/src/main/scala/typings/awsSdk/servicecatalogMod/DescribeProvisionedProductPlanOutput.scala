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
  def apply(): DescribeProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
  }
  @scala.inline
  implicit class DescribeProvisionedProductPlanOutputOps[Self <: DescribeProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setProvisionedProductPlanDetails(value: ProvisionedProductPlanDetails): Self = this.set("ProvisionedProductPlanDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProductPlanDetails: Self = this.set("ProvisionedProductPlanDetails", js.undefined)
    @scala.inline
    def setResourceChangesVarargs(value: ResourceChange*): Self = this.set("ResourceChanges", js.Array(value :_*))
    @scala.inline
    def setResourceChanges(value: ResourceChanges): Self = this.set("ResourceChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceChanges: Self = this.set("ResourceChanges", js.undefined)
  }
  
}

