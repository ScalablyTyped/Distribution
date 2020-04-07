package typings.awsSdkClientS3Node.typesGetObjectTaggingOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[UnmarshalledTag]
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object GetObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag], VersionId: String = null): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
}

