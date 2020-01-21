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
  def apply(
    ETag: NonEmptyMaxLength1024String,
    ObjectArn: S3KeyArnString,
    ObjectVersionId: S3ObjectVersionId = null
  ): JobManifestLocation = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], ObjectArn = ObjectArn.asInstanceOf[js.Any])
    if (ObjectVersionId != null) __obj.updateDynamic("ObjectVersionId")(ObjectVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestLocation]
  }
}

