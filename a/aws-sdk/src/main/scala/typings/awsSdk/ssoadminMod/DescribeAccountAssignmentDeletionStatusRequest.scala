package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAssignmentDeletionStatusRequest extends StObject {
  
  /**
    * The identifier that is used to track the request operation progress.
    */
  var AccountAssignmentDeletionRequestId: UUId
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: typings.awsSdk.ssoadminMod.InstanceArn
}
object DescribeAccountAssignmentDeletionStatusRequest {
  
  inline def apply(AccountAssignmentDeletionRequestId: UUId, InstanceArn: InstanceArn): DescribeAccountAssignmentDeletionStatusRequest = {
    val __obj = js.Dynamic.literal(AccountAssignmentDeletionRequestId = AccountAssignmentDeletionRequestId.asInstanceOf[js.Any], InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountAssignmentDeletionStatusRequest]
  }
  
  extension [Self <: DescribeAccountAssignmentDeletionStatusRequest](x: Self) {
    
    inline def setAccountAssignmentDeletionRequestId(value: UUId): Self = StObject.set(x, "AccountAssignmentDeletionRequestId", value.asInstanceOf[js.Any])
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
