package typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteObjectTaggingOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The versionId of the object the tag-set was removed from.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object DeleteObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, VersionId: String = null): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
}

