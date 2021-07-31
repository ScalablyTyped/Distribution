package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserImportJobRequest extends StObject {
  
  /**
    * The job ID for the user import job.
    */
  var JobId: UserImportJobIdType
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}
object DescribeUserImportJobRequest {
  
  @scala.inline
  def apply(JobId: UserImportJobIdType, UserPoolId: UserPoolIdType): DescribeUserImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserImportJobRequest]
  }
  
  @scala.inline
  implicit class DescribeUserImportJobRequestMutableBuilder[Self <: DescribeUserImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: UserImportJobIdType): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
