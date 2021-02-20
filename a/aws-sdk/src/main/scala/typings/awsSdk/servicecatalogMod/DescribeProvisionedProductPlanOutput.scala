package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProvisionedProductPlanOutput extends StObject {
  
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
  implicit class DescribeProvisionedProductPlanOutputMutableBuilder[Self <: DescribeProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setProvisionedProductPlanDetails(value: ProvisionedProductPlanDetails): Self = StObject.set(x, "ProvisionedProductPlanDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductPlanDetailsUndefined: Self = StObject.set(x, "ProvisionedProductPlanDetails", js.undefined)
    
    @scala.inline
    def setResourceChanges(value: ResourceChanges): Self = StObject.set(x, "ResourceChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceChangesUndefined: Self = StObject.set(x, "ResourceChanges", js.undefined)
    
    @scala.inline
    def setResourceChangesVarargs(value: ResourceChange*): Self = StObject.set(x, "ResourceChanges", js.Array(value :_*))
  }
}
