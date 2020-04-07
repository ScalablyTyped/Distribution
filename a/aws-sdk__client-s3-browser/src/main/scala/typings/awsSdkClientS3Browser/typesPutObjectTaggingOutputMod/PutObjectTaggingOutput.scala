package typings.awsSdkClientS3Browser.typesPutObjectTaggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object PutObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, VersionId: String = null): PutObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectTaggingOutput]
  }
}

