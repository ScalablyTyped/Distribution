package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Object extends js.Object {
  
  /**
    * The bucket containing the object.
    */
  var bucket: S3Bucket = js.native
  
  /**
    * The etag of the object.
    */
  var etag: js.UndefOr[S3Etag] = js.native
  
  /**
    * The key of the object.
    */
  var key: S3Key = js.native
}
object S3Object {
  
  @scala.inline
  def apply(bucket: S3Bucket, key: S3Key): S3Object = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Object]
  }
  
  @scala.inline
  implicit class S3ObjectOps[Self <: S3Object] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: S3Bucket): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: S3Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: S3Etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
  }
}
