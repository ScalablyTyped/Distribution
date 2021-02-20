package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Object extends StObject {
  
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
  implicit class S3ObjectMutableBuilder[Self <: S3Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: S3Etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
