package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFunctionCodeRequest extends js.Object {
  
  /**
    * Set to true to validate the request parameters and access permissions without modifying the function code.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  
  /**
    * Set to true to publish a new version of the function after updating the code. This has the same effect as calling PublishVersion separately.
    */
  var Publish: js.UndefOr[Boolean] = js.native
  
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.lambdaMod.S3Bucket] = js.native
  
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[typings.awsSdk.lambdaMod.S3Key] = js.native
  
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[typings.awsSdk.lambdaMod.S3ObjectVersion] = js.native
  
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}
object UpdateFunctionCodeRequest {
  
  @scala.inline
  def apply(FunctionName: FunctionName): UpdateFunctionCodeRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionCodeRequest]
  }
  
  @scala.inline
  implicit class UpdateFunctionCodeRequestOps[Self <: UpdateFunctionCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setPublish(value: Boolean): Self = this.set("Publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublish: Self = this.set("Publish", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: S3ObjectVersion): Self = this.set("S3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ObjectVersion: Self = this.set("S3ObjectVersion", js.undefined)
    
    @scala.inline
    def setZipFile(value: _Blob): Self = this.set("ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFile: Self = this.set("ZipFile", js.undefined)
  }
}
