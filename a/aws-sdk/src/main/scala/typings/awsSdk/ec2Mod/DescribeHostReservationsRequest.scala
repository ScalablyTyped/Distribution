package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostReservationsRequest extends StObject {
  
  /**
    * The filters.    instance-family - The instance family (for example, m4).    payment-option - The payment option (NoUpfront | PartialUpfront | AllUpfront).    state - The state of the reservation (payment-pending | payment-failed | active | retired).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filter: js.UndefOr[FilterList] = js.native
  
  /**
    * The host reservation IDs.
    */
  var HostReservationIdSet: js.UndefOr[typings.awsSdk.ec2Mod.HostReservationIdSet] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeHostReservationsRequest {
  
  @scala.inline
  def apply(): DescribeHostReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationsRequest]
  }
  
  @scala.inline
  implicit class DescribeHostReservationsRequestMutableBuilder[Self <: DescribeHostReservationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterList): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: Filter*): Self = StObject.set(x, "Filter", js.Array(value :_*))
    
    @scala.inline
    def setHostReservationIdSet(value: HostReservationIdSet): Self = StObject.set(x, "HostReservationIdSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostReservationIdSetUndefined: Self = StObject.set(x, "HostReservationIdSet", js.undefined)
    
    @scala.inline
    def setHostReservationIdSetVarargs(value: HostReservationId*): Self = StObject.set(x, "HostReservationIdSet", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
