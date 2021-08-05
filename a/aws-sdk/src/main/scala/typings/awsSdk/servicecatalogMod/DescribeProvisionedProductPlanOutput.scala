package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisionedProductPlanOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the plan.
    */
  var ProvisionedProductPlanDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductPlanDetails] = js.undefined
  
  /**
    * Information about the resource changes that will occur when the plan is executed.
    */
  var ResourceChanges: js.UndefOr[typings.awsSdk.servicecatalogMod.ResourceChanges] = js.undefined
}
object DescribeProvisionedProductPlanOutput {
  
  inline def apply(): DescribeProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
  }
  
  extension [Self <: DescribeProvisionedProductPlanOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProvisionedProductPlanDetails(value: ProvisionedProductPlanDetails): Self = StObject.set(x, "ProvisionedProductPlanDetails", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductPlanDetailsUndefined: Self = StObject.set(x, "ProvisionedProductPlanDetails", js.undefined)
    
    inline def setResourceChanges(value: ResourceChanges): Self = StObject.set(x, "ResourceChanges", value.asInstanceOf[js.Any])
    
    inline def setResourceChangesUndefined: Self = StObject.set(x, "ResourceChanges", js.undefined)
    
    inline def setResourceChangesVarargs(value: ResourceChange*): Self = StObject.set(x, "ResourceChanges", js.Array(value :_*))
  }
}
