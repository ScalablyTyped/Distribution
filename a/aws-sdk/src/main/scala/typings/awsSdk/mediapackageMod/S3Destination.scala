package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Destination extends js.Object {
  /**
    * The name of an S3 bucket within which harvested content will be exported
    */
  var BucketName: string = js.native
  /**
    * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
    */
  var ManifestKey: string = js.native
  /**
    * The IAM role used to write to the specified S3 bucket
    */
  var RoleArn: string = js.native
}

object S3Destination {
  @scala.inline
  def apply(BucketName: string, ManifestKey: string, RoleArn: string): S3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ManifestKey = ManifestKey.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
}

