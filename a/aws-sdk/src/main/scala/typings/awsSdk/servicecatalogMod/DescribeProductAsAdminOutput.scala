package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProductAsAdminOutput extends StObject {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.undefined
  
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetail] = js.undefined
  
  /**
    * Information about the provisioning artifacts (also known as versions) for the specified product.
    */
  var ProvisioningArtifactSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactSummaries] = js.undefined
  
  /**
    * Information about the TagOptions associated with the product.
    */
  var TagOptions: js.UndefOr[TagOptionDetails] = js.undefined
  
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.undefined
}
object DescribeProductAsAdminOutput {
  
  @scala.inline
  def apply(): DescribeProductAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductAsAdminOutput]
  }
  
  @scala.inline
  implicit class DescribeProductAsAdminOutputMutableBuilder[Self <: DescribeProductAsAdminOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    @scala.inline
    def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value :_*))
    
    @scala.inline
    def setProductViewDetail(value: ProductViewDetail): Self = StObject.set(x, "ProductViewDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewDetailUndefined: Self = StObject.set(x, "ProductViewDetail", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactSummaries(value: ProvisioningArtifactSummaries): Self = StObject.set(x, "ProvisioningArtifactSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactSummariesUndefined: Self = StObject.set(x, "ProvisioningArtifactSummaries", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactSummariesVarargs(value: ProvisioningArtifactSummary*): Self = StObject.set(x, "ProvisioningArtifactSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTagOptions(value: TagOptionDetails): Self = StObject.set(x, "TagOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagOptionsUndefined: Self = StObject.set(x, "TagOptions", js.undefined)
    
    @scala.inline
    def setTagOptionsVarargs(value: TagOptionDetail*): Self = StObject.set(x, "TagOptions", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
