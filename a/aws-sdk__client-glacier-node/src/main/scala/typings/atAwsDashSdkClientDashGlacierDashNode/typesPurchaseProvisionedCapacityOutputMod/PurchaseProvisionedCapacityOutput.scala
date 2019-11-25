package typings.atAwsDashSdkClientDashGlacierDashNode.typesPurchaseProvisionedCapacityOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PurchaseProvisionedCapacityOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The ID that identifies the provisioned capacity unit.</p>
    */
  var capacityId: js.UndefOr[String] = js.undefined
}

object PurchaseProvisionedCapacityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, capacityId: String = null): PurchaseProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (capacityId != null) __obj.updateDynamic("capacityId")(capacityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
  }
}

