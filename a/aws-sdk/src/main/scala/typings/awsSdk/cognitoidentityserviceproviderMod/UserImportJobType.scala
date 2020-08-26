package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserImportJobType extends js.Object {
  /**
    * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
    */
  var CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.native
  /**
    * The date when the user import job was completed.
    */
  var CompletionDate: js.UndefOr[DateType] = js.native
  /**
    * The message returned when the user import job is completed.
    */
  var CompletionMessage: js.UndefOr[CompletionMessageType] = js.native
  /**
    * The date the user import job was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * The number of users that could not be imported.
    */
  var FailedUsers: js.UndefOr[LongType] = js.native
  /**
    * The number of users that were successfully imported.
    */
  var ImportedUsers: js.UndefOr[LongType] = js.native
  /**
    * The job ID for the user import job.
    */
  var JobId: js.UndefOr[UserImportJobIdType] = js.native
  /**
    * The job name for the user import job.
    */
  var JobName: js.UndefOr[UserImportJobNameType] = js.native
  /**
    * The pre-signed URL to be used to upload the .csv file.
    */
  var PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.native
  /**
    * The number of users that were skipped.
    */
  var SkippedUsers: js.UndefOr[LongType] = js.native
  /**
    * The date when the user import job was started.
    */
  var StartDate: js.UndefOr[DateType] = js.native
  /**
    * The status of the user import job. One of the following:    Created - The job was created but not started.    Pending - A transition state. You have started the job, but it has not begun importing users yet.    InProgress - The job has started, and users are being imported.    Stopping - You have stopped the job, but the job has not stopped importing users yet.    Stopped - You have stopped the job, and the job has stopped importing users.    Succeeded - The job has completed successfully.    Failed - The job has stopped due to an error.    Expired - You created a job, but did not start the job within 24-48 hours. All data associated with the job was deleted, and the job cannot be started.  
    */
  var Status: js.UndefOr[UserImportJobStatusType] = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object UserImportJobType {
  @scala.inline
  def apply(): UserImportJobType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserImportJobType]
  }
  @scala.inline
  implicit class UserImportJobTypeOps[Self <: UserImportJobType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloudWatchLogsRoleArn(value: ArnType): Self = this.set("CloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogsRoleArn: Self = this.set("CloudWatchLogsRoleArn", js.undefined)
    @scala.inline
    def setCompletionDate(value: DateType): Self = this.set("CompletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionDate: Self = this.set("CompletionDate", js.undefined)
    @scala.inline
    def setCompletionMessage(value: CompletionMessageType): Self = this.set("CompletionMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionMessage: Self = this.set("CompletionMessage", js.undefined)
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setFailedUsers(value: LongType): Self = this.set("FailedUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedUsers: Self = this.set("FailedUsers", js.undefined)
    @scala.inline
    def setImportedUsers(value: LongType): Self = this.set("ImportedUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportedUsers: Self = this.set("ImportedUsers", js.undefined)
    @scala.inline
    def setJobId(value: UserImportJobIdType): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setJobName(value: UserImportJobNameType): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setPreSignedUrl(value: PreSignedUrlType): Self = this.set("PreSignedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreSignedUrl: Self = this.set("PreSignedUrl", js.undefined)
    @scala.inline
    def setSkippedUsers(value: LongType): Self = this.set("SkippedUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippedUsers: Self = this.set("SkippedUsers", js.undefined)
    @scala.inline
    def setStartDate(value: DateType): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
    @scala.inline
    def setStatus(value: UserImportJobStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("UserPoolId", js.undefined)
  }
  
}

