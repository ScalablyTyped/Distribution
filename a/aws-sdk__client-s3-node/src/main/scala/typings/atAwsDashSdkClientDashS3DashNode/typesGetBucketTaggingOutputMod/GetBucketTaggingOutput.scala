package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketTaggingOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[_UnmarshalledTag]
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[_UnmarshalledTag]): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, TagSet = TagSet)
  
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
}

