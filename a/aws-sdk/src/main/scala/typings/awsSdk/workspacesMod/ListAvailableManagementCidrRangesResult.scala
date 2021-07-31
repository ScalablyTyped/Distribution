package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableManagementCidrRangesResult extends StObject {
  
  /**
    * The list of available IP address ranges, specified as IPv4 CIDR blocks.
    */
  var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.undefined
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAvailableManagementCidrRangesResult {
  
  @scala.inline
  def apply(): ListAvailableManagementCidrRangesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
  }
  
  @scala.inline
  implicit class ListAvailableManagementCidrRangesResultMutableBuilder[Self <: ListAvailableManagementCidrRangesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagementCidrRanges(value: DedicatedTenancyCidrRangeList): Self = StObject.set(x, "ManagementCidrRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementCidrRangesUndefined: Self = StObject.set(x, "ManagementCidrRanges", js.undefined)
    
    @scala.inline
    def setManagementCidrRangesVarargs(value: DedicatedTenancyManagementCidrRange*): Self = StObject.set(x, "ManagementCidrRanges", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
