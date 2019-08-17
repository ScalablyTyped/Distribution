package typings.atAwsDashSdkClientDashKmsDashBrowser.typesListKeyPoliciesOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeyPoliciesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of key policy names. Currently, there is only one key policy per CMK and it is always named <code>default</code>.</p>
    */
  var PolicyNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}

object ListKeyPoliciesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextMarker: String = null,
    PolicyNames: js.Array[String] = null,
    Truncated: js.UndefOr[Boolean] = js.undefined
  ): ListKeyPoliciesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ListKeyPoliciesOutput]
  }
}

