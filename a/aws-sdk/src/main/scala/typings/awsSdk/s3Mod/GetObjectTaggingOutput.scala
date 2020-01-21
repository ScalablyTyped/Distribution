package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectTaggingOutput extends js.Object {
  /**
    * Contains the tag set.
    */
  var TagSet: typings.awsSdk.s3Mod.TagSet = js.native
  /**
    * The versionId of the object for which you got the tagging information.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object GetObjectTaggingOutput {
  @scala.inline
  def apply(TagSet: TagSet, VersionId: ObjectVersionId = null): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
}

