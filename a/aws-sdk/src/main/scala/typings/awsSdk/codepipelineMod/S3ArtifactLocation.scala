package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ArtifactLocation extends js.Object {
  
  /**
    * The name of the S3 bucket.
    */
  var bucketName: S3BucketName = js.native
  
  /**
    * The key of the object in the S3 bucket, which uniquely identifies the object in the bucket.
    */
  var objectKey: S3ObjectKey = js.native
}
object S3ArtifactLocation {
  
  @scala.inline
  def apply(bucketName: S3BucketName, objectKey: S3ObjectKey): S3ArtifactLocation = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ArtifactLocation]
  }
  
  @scala.inline
  implicit class S3ArtifactLocationOps[Self <: S3ArtifactLocation] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: S3BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectKey(value: S3ObjectKey): Self = this.set("objectKey", value.asInstanceOf[js.Any])
  }
}
