package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppImageConfigsRequest extends StObject {
  
  /**
    * A filter that returns only AppImageConfigs created on or after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only AppImageConfigs created on or before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * The maximum number of AppImageConfigs to return in the response. The default value is 10. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  
  /**
    * A filter that returns only AppImageConfigs modified on or after the specified time.
    */
  var ModifiedTimeAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only AppImageConfigs modified on or before the specified time.
    */
  var ModifiedTimeBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * A filter that returns only AppImageConfigs whose name contains the specified string.
    */
  var NameContains: js.UndefOr[AppImageConfigName] = js.native
  
  /**
    * If the previous call to ListImages didn't return the full set of AppImageConfigs, the call returns a token for getting the next set of AppImageConfigs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * The property used to sort results. The default value is CreationTime.
    */
  var SortBy: js.UndefOr[AppImageConfigSortKey] = js.native
  
  /**
    * The sort order. The default value is Descending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
}
object ListAppImageConfigsRequest {
  
  @scala.inline
  def apply(): ListAppImageConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppImageConfigsRequest]
  }
  
  @scala.inline
  implicit class ListAppImageConfigsRequestMutableBuilder[Self <: ListAppImageConfigsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setModifiedTimeAfter(value: Timestamp): Self = StObject.set(x, "ModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeAfterUndefined: Self = StObject.set(x, "ModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setModifiedTimeBefore(value: Timestamp): Self = StObject.set(x, "ModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeBeforeUndefined: Self = StObject.set(x, "ModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setNameContains(value: AppImageConfigName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: AppImageConfigSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
