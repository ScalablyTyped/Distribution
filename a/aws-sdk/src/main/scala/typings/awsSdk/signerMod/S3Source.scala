package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Source extends js.Object {
  
  /**
    * Name of the S3 bucket.
    */
  var bucketName: BucketName = js.native
  
  /**
    * Key name of the bucket object that contains your unsigned code.
    */
  var key: Key_ = js.native
  
  /**
    * Version of your source image in your version enabled S3 bucket.
    */
  var version: Version = js.native
}
object S3Source {
  
  @scala.inline
  def apply(bucketName: BucketName, key: Key_, version: Version): S3Source = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
  
  @scala.inline
  implicit class S3SourceOps[Self <: S3Source] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key_): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
