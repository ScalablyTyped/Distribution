package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisionedProductPlansOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the plans.
    */
  var ProvisionedProductPlans: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductPlans] = js.undefined
}
object ListProvisionedProductPlansOutput {
  
  inline def apply(): ListProvisionedProductPlansOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedProductPlansOutput]
  }
  
  extension [Self <: ListProvisionedProductPlansOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProvisionedProductPlans(value: ProvisionedProductPlans): Self = StObject.set(x, "ProvisionedProductPlans", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductPlansUndefined: Self = StObject.set(x, "ProvisionedProductPlans", js.undefined)
    
    inline def setProvisionedProductPlansVarargs(value: ProvisionedProductPlanSummary*): Self = StObject.set(x, "ProvisionedProductPlans", js.Array(value*))
  }
}
