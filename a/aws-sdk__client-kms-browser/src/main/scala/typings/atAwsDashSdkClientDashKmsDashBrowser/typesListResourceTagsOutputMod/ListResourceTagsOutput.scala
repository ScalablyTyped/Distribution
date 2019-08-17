package typings.atAwsDashSdkClientDashKmsDashBrowser.typesListResourceTagsOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceTagsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p> <p>Do not assume or infer any information from this value.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of tags. Each tag consists of a tag key and a tag value.</p>
    */
  var Tags: js.UndefOr[js.Array[_UnmarshalledTag]] = js.undefined
  /**
    * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}

object ListResourceTagsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextMarker: String = null,
    Tags: js.Array[_UnmarshalledTag] = null,
    Truncated: js.UndefOr[Boolean] = js.undefined
  ): ListResourceTagsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ListResourceTagsOutput]
  }
}

