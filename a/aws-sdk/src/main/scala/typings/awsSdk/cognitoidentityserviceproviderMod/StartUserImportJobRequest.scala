package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartUserImportJobRequest extends js.Object {
  /**
    * The job ID for the user import job.
    */
  var JobId: UserImportJobIdType = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object StartUserImportJobRequest {
  @scala.inline
  def apply(JobId: UserImportJobIdType, UserPoolId: UserPoolIdType): StartUserImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartUserImportJobRequest]
  }
}

