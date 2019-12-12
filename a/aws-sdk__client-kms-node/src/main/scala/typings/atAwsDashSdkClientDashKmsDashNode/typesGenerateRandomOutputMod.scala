package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/GenerateRandomOutput", JSImport.Namespace)
@js.native
object typesGenerateRandomOutputMod extends js.Object {
  @js.native
  trait GenerateRandomOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var Plaintext: js.UndefOr[Uint8Array] = js.native
  }
  
}

