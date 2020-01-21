package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/PurchaseProvisionedCapacityOutput", JSImport.Namespace)
@js.native
object typesPurchaseProvisionedCapacityOutputMod extends js.Object {
  @js.native
  trait PurchaseProvisionedCapacityOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The ID that identifies the provisioned capacity unit.</p>
      */
    var capacityId: js.UndefOr[String] = js.native
  }
  
}

