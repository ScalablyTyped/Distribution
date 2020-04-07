package typings.awsSdkClientKmsBrowser.typesListGrantsOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsBrowser.typesGrantListEntryMod.UnmarshalledGrantListEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGrantsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[UnmarshalledGrantListEntry]] = js.undefined
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}

object ListGrantsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Grants: js.Array[UnmarshalledGrantListEntry] = null,
    NextMarker: String = null,
    Truncated: js.UndefOr[Boolean] = js.undefined
  ): ListGrantsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGrantsOutput]
  }
}

