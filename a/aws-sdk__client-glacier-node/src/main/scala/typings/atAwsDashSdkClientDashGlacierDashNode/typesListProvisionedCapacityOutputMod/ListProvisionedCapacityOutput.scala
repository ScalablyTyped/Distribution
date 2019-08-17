package typings.atAwsDashSdkClientDashGlacierDashNode.typesListProvisionedCapacityOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreProvisionedCapacityDescriptionMod._UnmarshalledProvisionedCapacityDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProvisionedCapacityOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The response body contains the following JSON fields.</p>
    */
  var ProvisionedCapacityList: js.UndefOr[js.Array[_UnmarshalledProvisionedCapacityDescription]] = js.undefined
}

object ListProvisionedCapacityOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ProvisionedCapacityList: js.Array[_UnmarshalledProvisionedCapacityDescription] = null
  ): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ProvisionedCapacityList != null) __obj.updateDynamic("ProvisionedCapacityList")(ProvisionedCapacityList)
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
}

