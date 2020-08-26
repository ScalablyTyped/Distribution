package typings.awsSdkClientS3Browser.typesDeleteObjectTaggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The versionId of the object the tag-set was removed from.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
  @scala.inline
  implicit class DeleteObjectTaggingOutputOps[Self <: DeleteObjectTaggingOutput] (val x: Self) extends AnyVal {
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
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

