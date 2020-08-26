package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProductViewOutput extends js.Object {
  /**
    * Summary information about the product.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  /**
    * Information about the provisioning artifacts for the product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifacts] = js.native
}

object DescribeProductViewOutput {
  @scala.inline
  def apply(): DescribeProductViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductViewOutput]
  }
  @scala.inline
  implicit class DescribeProductViewOutputOps[Self <: DescribeProductViewOutput] (val x: Self) extends AnyVal {
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
    def setProductViewSummary(value: ProductViewSummary): Self = this.set("ProductViewSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductViewSummary: Self = this.set("ProductViewSummary", js.undefined)
    @scala.inline
    def setProvisioningArtifactsVarargs(value: ProvisioningArtifact*): Self = this.set("ProvisioningArtifacts", js.Array(value :_*))
    @scala.inline
    def setProvisioningArtifacts(value: ProvisioningArtifacts): Self = this.set("ProvisioningArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifacts: Self = this.set("ProvisioningArtifacts", js.undefined)
  }
  
}

