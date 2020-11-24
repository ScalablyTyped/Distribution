package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppImageConfigsRequest extends js.Object {
  
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
  implicit class ListAppImageConfigsRequestOps[Self <: ListAppImageConfigsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = this.set("CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = this.set("CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setModifiedTimeAfter(value: Timestamp): Self = this.set("ModifiedTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTimeAfter: Self = this.set("ModifiedTimeAfter", js.undefined)
    
    @scala.inline
    def setModifiedTimeBefore(value: Timestamp): Self = this.set("ModifiedTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTimeBefore: Self = this.set("ModifiedTimeBefore", js.undefined)
    
    @scala.inline
    def setNameContains(value: AppImageConfigName): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: AppImageConfigSortKey): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
}
