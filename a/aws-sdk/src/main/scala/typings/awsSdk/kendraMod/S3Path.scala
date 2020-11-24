package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Path extends js.Object {
  
  /**
    * The name of the S3 bucket that contains the file.
    */
  var Bucket: S3BucketName = js.native
  
  /**
    * The name of the file.
    */
  var Key: S3ObjectKey = js.native
}
object S3Path {
  
  @scala.inline
  def apply(Bucket: S3BucketName, Key: S3ObjectKey): S3Path = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Path]
  }
  
  @scala.inline
  implicit class S3PathOps[Self <: S3Path] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: S3BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: S3ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
}
