package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserImportJobRequest extends StObject {
  
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job.
    */
  var CloudWatchLogsRoleArn: ArnType
  
  /**
    * The job name for the user import job.
    */
  var JobName: UserImportJobNameType
  
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType
}
object CreateUserImportJobRequest {
  
  inline def apply(CloudWatchLogsRoleArn: ArnType, JobName: UserImportJobNameType, UserPoolId: UserPoolIdType): CreateUserImportJobRequest = {
    val __obj = js.Dynamic.literal(CloudWatchLogsRoleArn = CloudWatchLogsRoleArn.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserImportJobRequest]
  }
  
  extension [Self <: CreateUserImportJobRequest](x: Self) {
    
    inline def setCloudWatchLogsRoleArn(value: ArnType): Self = StObject.set(x, "CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: UserImportJobNameType): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
