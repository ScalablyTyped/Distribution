package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJobRequest extends js.Object {
  
  /**
    * The AWS account ID that creates the job.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.
    */
  var ClientRequestToken: NonEmptyMaxLength64String = js.native
  
  /**
    * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[typings.awsSdk.s3controlMod.ConfirmationRequired] = js.native
  
  /**
    * A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.native
  
  /**
    * Configuration parameters for the manifest.
    */
  var Manifest: JobManifest = js.native
  
  /**
    * The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see Operations in the Amazon Simple Storage Service Developer Guide.
    */
  var Operation: JobOperation = js.native
  
  /**
    * The numerical priority for this job. Higher numbers indicate higher priority.
    */
  var Priority: JobPriority = js.native
  
  /**
    * Configuration parameters for the optional job-completion report.
    */
  var Report: JobReport = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to run this job's operation on each object in the manifest.
    */
  var RoleArn: IAMRoleArn = js.native
  
  /**
    * A set of tags to associate with the S3 Batch Operations job. This is an optional parameter. 
    */
  var Tags: js.UndefOr[S3TagSet] = js.native
}
object CreateJobRequest {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    ClientRequestToken: NonEmptyMaxLength64String,
    Manifest: JobManifest,
    Operation: JobOperation,
    Priority: JobPriority,
    Report: JobReport,
    RoleArn: IAMRoleArn
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit class CreateJobRequestOps[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: NonEmptyMaxLength64String): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifest(value: JobManifest): Self = this.set("Manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: JobOperation): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: JobPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: JobReport): Self = this.set("Report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationRequired(value: ConfirmationRequired): Self = this.set("ConfirmationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmationRequired: Self = this.set("ConfirmationRequired", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyMaxLength256String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: S3Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: S3TagSet): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
