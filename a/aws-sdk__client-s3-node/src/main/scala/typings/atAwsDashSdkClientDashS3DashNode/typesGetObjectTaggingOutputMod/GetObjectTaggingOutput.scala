package typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectTaggingOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[_UnmarshalledTag]
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object GetObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[_UnmarshalledTag], VersionId: String = null): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
}

