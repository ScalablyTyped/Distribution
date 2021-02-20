package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourcesAffected extends StObject {
  
  /**
    * An array of objects, one for each S3 bucket that the finding applies to. Each object provides a set of metadata about an affected S3 bucket.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  
  /**
    * An array of objects, one for each S3 object that the finding applies to. Each object provides a set of metadata about an affected S3 object.
    */
  var s3Object: js.UndefOr[S3Object] = js.native
}
object ResourcesAffected {
  
  @scala.inline
  def apply(): ResourcesAffected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesAffected]
  }
  
  @scala.inline
  implicit class ResourcesAffectedMutableBuilder[Self <: ResourcesAffected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "s3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "s3Object", js.undefined)
  }
}
