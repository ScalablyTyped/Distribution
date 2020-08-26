package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOperation extends js.Object {
  /**
    * Directs the specified job to invoke an AWS Lambda function on each object in the manifest.
    */
  var LambdaInvoke: js.UndefOr[LambdaInvokeOperation] = js.native
  /**
    * Directs the specified job to execute an Initiate Glacier Restore call on each object in the manifest.
    */
  var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation] = js.native
  /**
    * Directs the specified job to execute a PUT Object acl call on each object in the manifest.
    */
  var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation] = js.native
  /**
    * Directs the specified job to execute a PUT Copy object call on each object in the manifest.
    */
  var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation] = js.native
  var S3PutObjectLegalHold: js.UndefOr[S3SetObjectLegalHoldOperation] = js.native
  var S3PutObjectRetention: js.UndefOr[S3SetObjectRetentionOperation] = js.native
  /**
    * Directs the specified job to execute a PUT Object tagging call on each object in the manifest.
    */
  var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation] = js.native
}

object JobOperation {
  @scala.inline
  def apply(): JobOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOperation]
  }
  @scala.inline
  implicit class JobOperationOps[Self <: JobOperation] (val x: Self) extends AnyVal {
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
    def setLambdaInvoke(value: LambdaInvokeOperation): Self = this.set("LambdaInvoke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaInvoke: Self = this.set("LambdaInvoke", js.undefined)
    @scala.inline
    def setS3InitiateRestoreObject(value: S3InitiateRestoreObjectOperation): Self = this.set("S3InitiateRestoreObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3InitiateRestoreObject: Self = this.set("S3InitiateRestoreObject", js.undefined)
    @scala.inline
    def setS3PutObjectAcl(value: S3SetObjectAclOperation): Self = this.set("S3PutObjectAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3PutObjectAcl: Self = this.set("S3PutObjectAcl", js.undefined)
    @scala.inline
    def setS3PutObjectCopy(value: S3CopyObjectOperation): Self = this.set("S3PutObjectCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3PutObjectCopy: Self = this.set("S3PutObjectCopy", js.undefined)
    @scala.inline
    def setS3PutObjectLegalHold(value: S3SetObjectLegalHoldOperation): Self = this.set("S3PutObjectLegalHold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3PutObjectLegalHold: Self = this.set("S3PutObjectLegalHold", js.undefined)
    @scala.inline
    def setS3PutObjectRetention(value: S3SetObjectRetentionOperation): Self = this.set("S3PutObjectRetention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3PutObjectRetention: Self = this.set("S3PutObjectRetention", js.undefined)
    @scala.inline
    def setS3PutObjectTagging(value: S3SetObjectTaggingOperation): Self = this.set("S3PutObjectTagging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3PutObjectTagging: Self = this.set("S3PutObjectTagging", js.undefined)
  }
  
}

