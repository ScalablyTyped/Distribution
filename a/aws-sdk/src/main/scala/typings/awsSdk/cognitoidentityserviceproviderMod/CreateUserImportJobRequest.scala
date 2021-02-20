package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserImportJobRequest extends StObject {
  
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job.
    */
  var CloudWatchLogsRoleArn: ArnType = js.native
  
  /**
    * The job name for the user import job.
    */
  var JobName: UserImportJobNameType = js.native
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object CreateUserImportJobRequest {
  
  @scala.inline
  def apply(CloudWatchLogsRoleArn: ArnType, JobName: UserImportJobNameType, UserPoolId: UserPoolIdType): CreateUserImportJobRequest = {
    val __obj = js.Dynamic.literal(CloudWatchLogsRoleArn = CloudWatchLogsRoleArn.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserImportJobRequest]
  }
  
  @scala.inline
  implicit class CreateUserImportJobRequestMutableBuilder[Self <: CreateUserImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: ArnType): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: UserImportJobNameType): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
