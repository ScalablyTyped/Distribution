package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAssignmentCreationStatusRequest extends StObject {
  
  /**
    * The identifier that is used to track the request operation progress.
    */
  var AccountAssignmentCreationRequestId: UUId
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
}
object DescribeAccountAssignmentCreationStatusRequest {
  
  @scala.inline
  def apply(AccountAssignmentCreationRequestId: UUId, InstanceArn: InstanceArn): DescribeAccountAssignmentCreationStatusRequest = {
    val __obj = js.Dynamic.literal(AccountAssignmentCreationRequestId = AccountAssignmentCreationRequestId.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAssignmentCreationStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeAccountAssignmentCreationStatusRequestMutableBuilder[Self <: DescribeAccountAssignmentCreationStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountAssignmentCreationRequestId(value: UUId): Self = StObject.set(x, "AccountAssignmentCreationRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
