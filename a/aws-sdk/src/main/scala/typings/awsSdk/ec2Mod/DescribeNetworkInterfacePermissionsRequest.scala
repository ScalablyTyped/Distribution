package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkInterfacePermissionsRequest extends StObject {
  
  /**
    * One or more filters.    network-interface-permission.network-interface-permission-id - The ID of the permission.    network-interface-permission.network-interface-id - The ID of the network interface.    network-interface-permission.aws-account-id - The AWS account ID.    network-interface-permission.aws-service - The AWS service.    network-interface-permission.permission - The type of permission (INSTANCE-ATTACH | EIP-ASSOCIATE).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. If this parameter is not specified, up to 50 results are returned by default.
    */
  var MaxResults: js.UndefOr[DescribeNetworkInterfacePermissionsMaxResults] = js.native
  
  /**
    * One or more network interface permission IDs.
    */
  var NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeNetworkInterfacePermissionsRequest {
  
  @scala.inline
  def apply(): DescribeNetworkInterfacePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeNetworkInterfacePermissionsRequestMutableBuilder[Self <: DescribeNetworkInterfacePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeNetworkInterfacePermissionsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePermissionIds(value: NetworkInterfacePermissionIdList): Self = StObject.set(x, "NetworkInterfacePermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacePermissionIdsUndefined: Self = StObject.set(x, "NetworkInterfacePermissionIds", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePermissionIdsVarargs(value: NetworkInterfacePermissionId*): Self = StObject.set(x, "NetworkInterfacePermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
