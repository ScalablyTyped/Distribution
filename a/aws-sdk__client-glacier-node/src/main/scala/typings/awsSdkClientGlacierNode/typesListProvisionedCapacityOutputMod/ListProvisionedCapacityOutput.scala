package typings.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesProvisionedCapacityDescriptionMod.UnmarshalledProvisionedCapacityDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var ProvisionedCapacityList: js.UndefOr[js.Array[UnmarshalledProvisionedCapacityDescription]] = js.undefined
}

object ListProvisionedCapacityOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ProvisionedCapacityList: js.Array[UnmarshalledProvisionedCapacityDescription] = null
  ): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ProvisionedCapacityList != null) __obj.updateDynamic("ProvisionedCapacityList")(ProvisionedCapacityList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
}

