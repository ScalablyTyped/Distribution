package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobManifestLocation extends js.Object {
  /**
    * The ETag for the specified manifest object.
    */
  var ETag: NonEmptyMaxLength1024String = js.native
  /**
    * The Amazon Resource Name (ARN) for a manifest object.
    */
  var ObjectArn: S3KeyArnString = js.native
  /**
    * The optional version ID to identify a specific version of the manifest object.
    */
  var ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.native
}

object JobManifestLocation {
  @scala.inline
  def apply(ETag: NonEmptyMaxLength1024String, ObjectArn: S3KeyArnString): JobManifestLocation = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], ObjectArn = ObjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestLocation]
  }
  @scala.inline
  implicit class JobManifestLocationOps[Self <: JobManifestLocation] (val x: Self) extends AnyVal {
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
    def setETag(value: NonEmptyMaxLength1024String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectArn(value: S3KeyArnString): Self = this.set("ObjectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectVersionId(value: S3ObjectVersionId): Self = this.set("ObjectVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectVersionId: Self = this.set("ObjectVersionId", js.undefined)
  }
  
}

