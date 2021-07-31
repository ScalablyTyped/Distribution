package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionCodeRequest extends StObject {
  
  /**
    * Set to true to validate the request parameters and access permissions without modifying the function code.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName
  
  /**
    * Set to true to publish a new version of the function after updating the code. This has the same effect as calling PublishVersion separately.
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.lambdaMod.S3Bucket] = js.undefined
  
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[typings.awsSdk.lambdaMod.S3Key] = js.undefined
  
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[typings.awsSdk.lambdaMod.S3ObjectVersion] = js.undefined
  
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.undefined
}
object UpdateFunctionCodeRequest {
  
  @scala.inline
  def apply(FunctionName: FunctionName): UpdateFunctionCodeRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionCodeRequest]
  }
  
  @scala.inline
  implicit class UpdateFunctionCodeRequestMutableBuilder[Self <: UpdateFunctionCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: Boolean): Self = StObject.set(x, "Publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishUndefined: Self = StObject.set(x, "Publish", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: S3ObjectVersion): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
    
    @scala.inline
    def setZipFile(value: _Blob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
