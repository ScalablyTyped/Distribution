package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsLambdaFunctionCode extends js.Object {
  
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[NonEmptyString] = js.native
}
object AwsLambdaFunctionCode {
  
  @scala.inline
  def apply(): AwsLambdaFunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionCode]
  }
  
  @scala.inline
  implicit class AwsLambdaFunctionCodeOps[Self <: AwsLambdaFunctionCode] (val x: Self) extends AnyVal {
    
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
    def setS3Bucket(value: NonEmptyString): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: NonEmptyString): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: NonEmptyString): Self = this.set("S3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ObjectVersion: Self = this.set("S3ObjectVersion", js.undefined)
    
    @scala.inline
    def setZipFile(value: NonEmptyString): Self = this.set("ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFile: Self = this.set("ZipFile", js.undefined)
  }
}
