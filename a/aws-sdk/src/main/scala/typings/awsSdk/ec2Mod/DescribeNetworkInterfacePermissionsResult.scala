package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkInterfacePermissionsResult extends StObject {
  
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
  implicit class DescribeNetworkInterfacePermissionsResultMutableBuilder[Self <: DescribeNetworkInterfacePermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkInterfacePermissions(value: NetworkInterfacePermissionList): Self = StObject.set(x, "NetworkInterfacePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacePermissionsUndefined: Self = StObject.set(x, "NetworkInterfacePermissions", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePermissionsVarargs(value: NetworkInterfacePermission*): Self = StObject.set(x, "NetworkInterfacePermissions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
