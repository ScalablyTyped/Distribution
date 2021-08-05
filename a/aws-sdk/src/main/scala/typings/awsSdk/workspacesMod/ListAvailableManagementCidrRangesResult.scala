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
  
  inline def apply(): ListAvailableManagementCidrRangesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
  }
  
  extension [Self <: ListAvailableManagementCidrRangesResult](x: Self) {
    
    inline def setManagementCidrRanges(value: DedicatedTenancyCidrRangeList): Self = StObject.set(x, "ManagementCidrRanges", value.asInstanceOf[js.Any])
    
    inline def setManagementCidrRangesUndefined: Self = StObject.set(x, "ManagementCidrRanges", js.undefined)
    
    inline def setManagementCidrRangesVarargs(value: DedicatedTenancyManagementCidrRange*): Self = StObject.set(x, "ManagementCidrRanges", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
