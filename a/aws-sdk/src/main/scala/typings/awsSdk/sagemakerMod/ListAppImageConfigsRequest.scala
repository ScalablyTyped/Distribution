package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppImageConfigsRequest extends StObject {
  
  /**
    * A filter that returns only AppImageConfigs created on or after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only AppImageConfigs created on or before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of AppImageConfigs to return in the response. The default value is 10. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * A filter that returns only AppImageConfigs modified on or after the specified time.
    */
  var ModifiedTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only AppImageConfigs modified on or before the specified time.
    */
  var ModifiedTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only AppImageConfigs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[AppImageConfigName] = js.undefined
  
  /**
    * If the previous call to ListImages didn't return the full set of AppImageConfigs, the call returns a token for getting the next set of AppImageConfigs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[AppImageConfigSortKey] = js.undefined
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.undefined
}
object ListAppImageConfigsRequest {
  
  inline def apply(): ListAppImageConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppImageConfigsRequest]
  }
  
  extension [Self <: ListAppImageConfigsRequest](x: Self) {
    
    inline def setCreationTimeAfter(value: Timestamp): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: Timestamp): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModifiedTimeAfter(value: Timestamp): Self = StObject.set(x, "ModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeAfterUndefined: Self = StObject.set(x, "ModifiedTimeAfter", js.undefined)
    
    inline def setModifiedTimeBefore(value: Timestamp): Self = StObject.set(x, "ModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeBeforeUndefined: Self = StObject.set(x, "ModifiedTimeBefore", js.undefined)
    
    inline def setNameContains(value: AppImageConfigName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: AppImageConfigSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
