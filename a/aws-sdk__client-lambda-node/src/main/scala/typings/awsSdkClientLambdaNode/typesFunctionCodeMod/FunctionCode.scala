package typings.awsSdkClientLambdaNode.typesFunctionCodeMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionCode extends js.Object {
  
  /**
    * <p>An Amazon S3 bucket in the same region as your function.</p>
    */
  var S3Bucket: js.UndefOr[String] = js.native
  
  /**
    * <p>The Amazon S3 key of the deployment package.</p>
    */
  var S3Key: js.UndefOr[String] = js.native
  
  /**
    * <p>For versioned objects, the version of the deployment package object to use.</p>
    */
  var S3ObjectVersion: js.UndefOr[String] = js.native
  
  /**
    * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
    */
  var ZipFile: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
}
object FunctionCode {
  
  @scala.inline
  def apply(): FunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCode]
  }
  
  @scala.inline
  implicit class FunctionCodeOps[Self <: FunctionCode] (val x: Self) extends AnyVal {
    
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
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Key(value: String): Self = this.set("S3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Key: Self = this.set("S3Key", js.undefined)
    
    @scala.inline
    def setS3ObjectVersion(value: String): Self = this.set("S3ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ObjectVersion: Self = this.set("S3ObjectVersion", js.undefined)
    
    @scala.inline
    def setZipFile(value: ArrayBuffer | ArrayBufferView | String): Self = this.set("ZipFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFile: Self = this.set("ZipFile", js.undefined)
  }
}
