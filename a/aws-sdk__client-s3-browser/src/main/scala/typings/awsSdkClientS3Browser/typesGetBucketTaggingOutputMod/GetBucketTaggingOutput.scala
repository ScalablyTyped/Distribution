package typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[UnmarshalledTag] = js.native
}

object GetBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
  @scala.inline
  implicit class GetBucketTaggingOutputOps[Self <: GetBucketTaggingOutput] (val x: Self) extends AnyVal {
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
    def setTagSetVarargs(value: UnmarshalledTag*): Self = this.set("TagSet", js.Array(value :_*))
    @scala.inline
    def setTagSet(value: js.Array[UnmarshalledTag]): Self = this.set("TagSet", value.asInstanceOf[js.Any])
  }
  
}

