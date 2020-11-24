package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkInterfacePermissionsResult extends js.Object {
  
  /**
    * The network interface permissions.
    */
  var NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeNetworkInterfacePermissionsResult {
  
  @scala.inline
  def apply(): DescribeNetworkInterfacePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsResult]
  }
  
  @scala.inline
  implicit class DescribeNetworkInterfacePermissionsResultOps[Self <: DescribeNetworkInterfacePermissionsResult] (val x: Self) extends AnyVal {
    
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
    def setNetworkInterfacePermissionsVarargs(value: NetworkInterfacePermission*): Self = this.set("NetworkInterfacePermissions", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfacePermissions(value: NetworkInterfacePermissionList): Self = this.set("NetworkInterfacePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfacePermissions: Self = this.set("NetworkInterfacePermissions", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
