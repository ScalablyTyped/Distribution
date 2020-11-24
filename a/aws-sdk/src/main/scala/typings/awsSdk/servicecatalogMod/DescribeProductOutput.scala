package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProductOutput extends js.Object {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.native
  
  /**
    * Information about the associated launch paths.
    */
  var LaunchPaths: js.UndefOr[typings.awsSdk.servicecatalogMod.LaunchPaths] = js.native
  
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  
  /**
    * Information about the provisioning artifacts for the specified product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifacts] = js.native
}
object DescribeProductOutput {
  
  @scala.inline
  def apply(): DescribeProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductOutput]
  }
  
  @scala.inline
  implicit class DescribeProductOutputOps[Self <: DescribeProductOutput] (val x: Self) extends AnyVal {
    
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
    def setBudgetsVarargs(value: BudgetDetail*): Self = this.set("Budgets", js.Array(value :_*))
    
    @scala.inline
    def setBudgets(value: Budgets): Self = this.set("Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgets: Self = this.set("Budgets", js.undefined)
    
    @scala.inline
    def setLaunchPathsVarargs(value: LaunchPath*): Self = this.set("LaunchPaths", js.Array(value :_*))
    
    @scala.inline
    def setLaunchPaths(value: LaunchPaths): Self = this.set("LaunchPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchPaths: Self = this.set("LaunchPaths", js.undefined)
    
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
