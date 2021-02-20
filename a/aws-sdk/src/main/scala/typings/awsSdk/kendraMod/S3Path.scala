package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Path extends StObject {
  
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
  implicit class S3PathMutableBuilder[Self <: S3Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: S3BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: S3ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
