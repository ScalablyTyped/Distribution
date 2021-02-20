package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProductOutput extends StObject {
  
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
  implicit class DescribeProductOutputMutableBuilder[Self <: DescribeProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    @scala.inline
    def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value :_*))
    
    @scala.inline
    def setLaunchPaths(value: LaunchPaths): Self = StObject.set(x, "LaunchPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPathsUndefined: Self = StObject.set(x, "LaunchPaths", js.undefined)
    
    @scala.inline
    def setLaunchPathsVarargs(value: LaunchPath*): Self = StObject.set(x, "LaunchPaths", js.Array(value :_*))
    
    @scala.inline
    def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    @scala.inline
    def setProvisioningArtifacts(value: ProvisioningArtifacts): Self = StObject.set(x, "ProvisioningArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactsUndefined: Self = StObject.set(x, "ProvisioningArtifacts", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactsVarargs(value: ProvisioningArtifact*): Self = StObject.set(x, "ProvisioningArtifacts", js.Array(value :_*))
  }
}
