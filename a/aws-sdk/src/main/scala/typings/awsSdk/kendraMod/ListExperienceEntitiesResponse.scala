package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExperienceEntitiesResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve the next set of users or groups.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kendraMod.NextToken] = js.undefined
  
  /**
    * An array of summary information for one or more users or groups.
    */
  var SummaryItems: js.UndefOr[ExperienceEntitiesSummaryList] = js.undefined
}
object ListExperienceEntitiesResponse {
  
  inline def apply(): ListExperienceEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExperienceEntitiesResponse]
  }
  
  extension [Self <: ListExperienceEntitiesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaryItems(value: ExperienceEntitiesSummaryList): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    inline def setSummaryItemsVarargs(value: ExperienceEntitiesSummary*): Self = StObject.set(x, "SummaryItems", js.Array(value*))
  }
}
