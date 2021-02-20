package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityGroupReferencesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of the security groups in your account.
    */
  var GroupId: GroupIds = js.native
}
object DescribeSecurityGroupReferencesRequest {
  
  @scala.inline
  def apply(GroupId: GroupIds): DescribeSecurityGroupReferencesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityGroupReferencesRequest]
  }
  
  @scala.inline
  implicit class DescribeSecurityGroupReferencesRequestMutableBuilder[Self <: DescribeSecurityGroupReferencesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGroupId(value: GroupIds): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdVarargs(value: SecurityGroupId*): Self = StObject.set(x, "GroupId", js.Array(value :_*))
  }
}
