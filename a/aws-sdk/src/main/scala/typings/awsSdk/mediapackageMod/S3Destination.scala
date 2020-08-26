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
  @scala.inline
  implicit class S3DestinationOps[Self <: S3Destination] (val x: Self) extends AnyVal {
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
    def setBucketName(value: string): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestKey(value: string): Self = this.set("ManifestKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
  }
  
}

