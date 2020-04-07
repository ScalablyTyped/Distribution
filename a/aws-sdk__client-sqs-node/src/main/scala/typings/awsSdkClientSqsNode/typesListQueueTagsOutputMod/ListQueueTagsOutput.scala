package typings.awsSdkClientSqsNode.typesListQueueTagsOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueueTagsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The list of all tags added to the specified queue.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.undefined
}

object ListQueueTagsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Tags: StringDictionary[String] = null): ListQueueTagsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueueTagsOutput]
  }
}

