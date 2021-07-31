package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsLambdaFunctionCode extends StObject {
  
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsLambdaFunctionCode {
  
  @scala.inline
  def apply(): AwsLambdaFunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionCode]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionCodeMutableBuilder[Self <: AwsLambdaFunctionCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: NonEmptyString): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: NonEmptyString): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: NonEmptyString): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
    
    @scala.inline
    def setZipFile(value: NonEmptyString): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
