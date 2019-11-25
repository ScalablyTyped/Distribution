package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListTagsOfResourceOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsOfResourceOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The tags currently associated with the Amazon DynamoDB resource.</p>
    */
  var Tags: js.UndefOr[js.Array[_UnmarshalledTag]] = js.undefined
}

object ListTagsOfResourceOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, NextToken: String = null, Tags: js.Array[_UnmarshalledTag] = null): ListTagsOfResourceOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsOfResourceOutput]
  }
}

