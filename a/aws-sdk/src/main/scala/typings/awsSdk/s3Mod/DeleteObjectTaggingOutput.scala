package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectTaggingOutput extends js.Object {
  /**
    * The versionId of the object the tag-set was removed from.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeleteObjectTaggingOutput {
  @scala.inline
  def apply(VersionId: ObjectVersionId = null): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal()
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
}

