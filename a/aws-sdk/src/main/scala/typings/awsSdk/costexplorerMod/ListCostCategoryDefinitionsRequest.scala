package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCostCategoryDefinitionsRequest extends StObject {
  
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    *  The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[CostCategoryMaxResults] = js.undefined
  
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
}
object ListCostCategoryDefinitionsRequest {
  
  inline def apply(): ListCostCategoryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostCategoryDefinitionsRequest]
  }
  
  extension [Self <: ListCostCategoryDefinitionsRequest](x: Self) {
    
    inline def setEffectiveOn(value: ZonedDateTime): Self = StObject.set(x, "EffectiveOn", value.asInstanceOf[js.Any])
    
    inline def setEffectiveOnUndefined: Self = StObject.set(x, "EffectiveOn", js.undefined)
    
    inline def setMaxResults(value: CostCategoryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
