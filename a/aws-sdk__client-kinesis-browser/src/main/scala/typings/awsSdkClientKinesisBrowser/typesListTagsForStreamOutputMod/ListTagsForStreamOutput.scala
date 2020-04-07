package typings.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForStreamOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>If set to <code>true</code>, more tags are available. To request additional tags, set <code>ExclusiveStartTagKey</code> to the key of the last tag returned.</p>
    */
  var HasMoreTags: Boolean
  /**
    * <p>A list of tags associated with <code>StreamName</code>, starting with the first tag after <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>. </p>
    */
  var Tags: js.Array[UnmarshalledTag]
}

object ListTagsForStreamOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, HasMoreTags: Boolean, Tags: js.Array[UnmarshalledTag]): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
}

