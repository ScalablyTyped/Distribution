package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisionedProductOutput extends js.Object {
  /**
    * Any CloudWatch dashboards that were created when provisioning the product.
    */
  var CloudWatchDashboards: js.UndefOr[typings.awsSdk.servicecatalogMod.CloudWatchDashboards] = js.native
  /**
    * Information about the provisioned product.
    */
  var ProvisionedProductDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductDetail] = js.native
}

object DescribeProvisionedProductOutput {
  @scala.inline
  def apply(): DescribeProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductOutput]
  }
  @scala.inline
  implicit class DescribeProvisionedProductOutputOps[Self <: DescribeProvisionedProductOutput] (val x: Self) extends AnyVal {
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
    def setCloudWatchDashboardsVarargs(value: CloudWatchDashboard*): Self = this.set("CloudWatchDashboards", js.Array(value :_*))
    @scala.inline
    def setCloudWatchDashboards(value: CloudWatchDashboards): Self = this.set("CloudWatchDashboards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchDashboards: Self = this.set("CloudWatchDashboards", js.undefined)
    @scala.inline
    def setProvisionedProductDetail(value: ProvisionedProductDetail): Self = this.set("ProvisionedProductDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProductDetail: Self = this.set("ProvisionedProductDetail", js.undefined)
  }
  
}

