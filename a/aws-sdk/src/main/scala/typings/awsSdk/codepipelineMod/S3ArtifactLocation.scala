package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ArtifactLocation extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var bucketName: S3BucketName
  
  /**
    * The key of the object in the S3 bucket, which uniquely identifies the object in the bucket.
    */
  var objectKey: S3ObjectKey
}
object S3ArtifactLocation {
  
  @scala.inline
  def apply(bucketName: S3BucketName, objectKey: S3ObjectKey): S3ArtifactLocation = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ArtifactLocation]
  }
  
  @scala.inline
  implicit class S3ArtifactLocationMutableBuilder[Self <: S3ArtifactLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: S3BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectKey(value: S3ObjectKey): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
  }
}
