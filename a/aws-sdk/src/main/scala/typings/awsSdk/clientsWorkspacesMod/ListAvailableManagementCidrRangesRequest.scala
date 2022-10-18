package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableManagementCidrRangesRequest extends StObject {
  
  /**
    * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block).
    */
  var ManagementCidrRangeConstraint: typings.awsSdk.clientsWorkspacesMod.ManagementCidrRangeConstraint
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAvailableManagementCidrRangesRequest {
  
  inline def apply(ManagementCidrRangeConstraint: ManagementCidrRangeConstraint): ListAvailableManagementCidrRangesRequest = {
    val __obj = js.Dynamic.literal(ManagementCidrRangeConstraint = ManagementCidrRangeConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableManagementCidrRangesRequest]
  }
  
  extension [Self <: ListAvailableManagementCidrRangesRequest](x: Self) {
    
    inline def setManagementCidrRangeConstraint(value: ManagementCidrRangeConstraint): Self = StObject.set(x, "ManagementCidrRangeConstraint", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ManagementCidrRangeMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
