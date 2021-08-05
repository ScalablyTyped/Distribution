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
  
  inline def apply(): DescribeProductAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductAsAdminOutput]
  }
  
  extension [Self <: DescribeProductAsAdminOutput](x: Self) {
    
    inline def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value :_*))
    
    inline def setProductViewDetail(value: ProductViewDetail): Self = StObject.set(x, "ProductViewDetail", value.asInstanceOf[js.Any])
    
    inline def setProductViewDetailUndefined: Self = StObject.set(x, "ProductViewDetail", js.undefined)
    
    inline def setProvisioningArtifactSummaries(value: ProvisioningArtifactSummaries): Self = StObject.set(x, "ProvisioningArtifactSummaries", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactSummariesUndefined: Self = StObject.set(x, "ProvisioningArtifactSummaries", js.undefined)
    
    inline def setProvisioningArtifactSummariesVarargs(value: ProvisioningArtifactSummary*): Self = StObject.set(x, "ProvisioningArtifactSummaries", js.Array(value :_*))
    
    inline def setTagOptions(value: TagOptionDetails): Self = StObject.set(x, "TagOptions", value.asInstanceOf[js.Any])
    
    inline def setTagOptionsUndefined: Self = StObject.set(x, "TagOptions", js.undefined)
    
    inline def setTagOptionsVarargs(value: TagOptionDetail*): Self = StObject.set(x, "TagOptions", js.Array(value :_*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
