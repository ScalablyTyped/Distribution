package typings.atAwsDashSdkClientDashKmsDashNode.typesListKeysOutputMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUnderscoreKeyListEntryMod._UnmarshalledKeyListEntry
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeysOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of customer master keys (CMKs).</p>
    */
  var Keys: js.UndefOr[js.Array[_UnmarshalledKeyListEntry]] = js.undefined
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}

object ListKeysOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Keys: js.Array[_UnmarshalledKeyListEntry] = null,
    NextMarker: String = null,
    Truncated: js.UndefOr[Boolean] = js.undefined
  ): ListKeysOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Keys != null) __obj.updateDynamic("Keys")(Keys)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ListKeysOutput]
  }
}

