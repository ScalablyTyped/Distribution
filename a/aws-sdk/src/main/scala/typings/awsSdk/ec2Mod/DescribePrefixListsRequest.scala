package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePrefixListsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    prefix-list-id: The ID of a prefix list.    prefix-list-name: The name of a prefix list.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more prefix list IDs.
    */
  var PrefixListIds: js.UndefOr[PrefixListResourceIdStringList] = js.native
}
object DescribePrefixListsRequest {
  
  @scala.inline
  def apply(): DescribePrefixListsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrefixListsRequest]
  }
  
  @scala.inline
  implicit class DescribePrefixListsRequestMutableBuilder[Self <: DescribePrefixListsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPrefixListIds(value: PrefixListResourceIdStringList): Self = StObject.set(x, "PrefixListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListIdsUndefined: Self = StObject.set(x, "PrefixListIds", js.undefined)
    
    @scala.inline
    def setPrefixListIdsVarargs(value: PrefixListResourceId*): Self = StObject.set(x, "PrefixListIds", js.Array(value :_*))
  }
}
