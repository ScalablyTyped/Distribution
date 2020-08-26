package typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>If set to <code>true</code>, more tags are available. To request additional tags, set <code>ExclusiveStartTagKey</code> to the key of the last tag returned.</p>
    */
  var HasMoreTags: Boolean = js.native
  /**
    * <p>A list of tags associated with <code>StreamName</code>, starting with the first tag after <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>. </p>
    */
  var Tags: js.Array[UnmarshalledTag] = js.native
}

object ListTagsForStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, HasMoreTags: Boolean, Tags: js.Array[UnmarshalledTag]): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  @scala.inline
  implicit class ListTagsForStreamOutputOps[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMoreTags(value: Boolean): Self = this.set("HasMoreTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: UnmarshalledTag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[UnmarshalledTag]): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

