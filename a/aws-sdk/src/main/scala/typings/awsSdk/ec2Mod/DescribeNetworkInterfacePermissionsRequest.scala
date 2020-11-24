package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkInterfacePermissionsRequest extends js.Object {
  
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
  implicit class DescribeNetworkInterfacePermissionsRequestOps[Self <: DescribeNetworkInterfacePermissionsRequest] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeNetworkInterfacePermissionsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePermissionIdsVarargs(value: NetworkInterfacePermissionId*): Self = this.set("NetworkInterfacePermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfacePermissionIds(value: NetworkInterfacePermissionIdList): Self = this.set("NetworkInterfacePermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfacePermissionIds: Self = this.set("NetworkInterfacePermissionIds", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
