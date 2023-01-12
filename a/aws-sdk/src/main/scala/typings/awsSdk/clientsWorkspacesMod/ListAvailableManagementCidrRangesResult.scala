package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableManagementCidrRangesResult extends StObject {
  
  /**
    * The list of available IP address ranges, specified as IPv4 CIDR blocks.
    */
  var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAvailableManagementCidrRangesResult {
  
  inline def apply(): ListAvailableManagementCidrRangesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagementCidrRangesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAvailableManagementCidrRangesResult] (val x: Self) extends AnyVal {
    
    inline def setManagementCidrRanges(value: DedicatedTenancyCidrRangeList): Self = StObject.set(x, "ManagementCidrRanges", value.asInstanceOf[js.Any])
    
    inline def setManagementCidrRangesUndefined: Self = StObject.set(x, "ManagementCidrRanges", js.undefined)
    
    inline def setManagementCidrRangesVarargs(value: DedicatedTenancyManagementCidrRange*): Self = StObject.set(x, "ManagementCidrRanges", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
