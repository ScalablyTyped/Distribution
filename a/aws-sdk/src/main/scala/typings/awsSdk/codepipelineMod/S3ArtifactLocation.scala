package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

