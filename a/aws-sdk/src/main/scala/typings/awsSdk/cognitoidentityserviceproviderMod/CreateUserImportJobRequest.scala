package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserImportJobRequest extends js.Object {
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
}

