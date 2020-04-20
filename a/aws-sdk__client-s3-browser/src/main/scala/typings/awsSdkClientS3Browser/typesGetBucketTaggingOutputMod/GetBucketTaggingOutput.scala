package typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[UnmarshalledTag]
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
}

