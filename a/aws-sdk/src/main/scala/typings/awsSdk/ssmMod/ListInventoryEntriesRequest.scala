package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInventoryEntriesRequest extends StObject {
  
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.undefined
  
  /**
    * The instance ID for which you want inventory information.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * The type of inventory item for which you want information.
    */
  var TypeName: InventoryItemTypeName
}
object ListInventoryEntriesRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, TypeName: InventoryItemTypeName): ListInventoryEntriesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInventoryEntriesRequest]
  }
  
  @scala.inline
  implicit class ListInventoryEntriesRequestMutableBuilder[Self <: ListInventoryEntriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: InventoryFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: InventoryFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
