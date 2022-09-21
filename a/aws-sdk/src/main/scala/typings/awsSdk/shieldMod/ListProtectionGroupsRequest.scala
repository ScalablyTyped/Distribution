package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionGroupsRequest extends StObject {
  
  /**
    * Narrows the set of protection groups that the call retrieves. You can retrieve a single protection group by its name and you can retrieve all protection groups that are configured with specific pattern or aggregation settings. You can provide up to one criteria per filter type. Shield Advanced returns the protection groups that exactly match all of the search criteria that you provide.
    */
  var InclusionFilters: js.UndefOr[InclusionProtectionGroupFilters] = js.undefined
  
  /**
    * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might return fewer objects than you indicate in this setting, even if more objects are available. If there are more objects remaining, Shield Advanced will always also return a NextToken value in the response. The default setting is 20.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.undefined
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value. On your first call to a list operation, leave this setting empty.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListProtectionGroupsRequest {
  
  inline def apply(): ListProtectionGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionGroupsRequest]
  }
  
  extension [Self <: ListProtectionGroupsRequest](x: Self) {
    
    inline def setInclusionFilters(value: InclusionProtectionGroupFilters): Self = StObject.set(x, "InclusionFilters", value.asInstanceOf[js.Any])
    
    inline def setInclusionFiltersUndefined: Self = StObject.set(x, "InclusionFilters", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
