package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesAffected extends js.Object {
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
  implicit class ResourcesAffectedOps[Self <: ResourcesAffected] (val x: Self) extends AnyVal {
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
    def setS3Bucket(value: S3Bucket): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    @scala.inline
    def setS3Object(value: S3Object): Self = this.set("s3Object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Object: Self = this.set("s3Object", js.undefined)
  }
  
}

