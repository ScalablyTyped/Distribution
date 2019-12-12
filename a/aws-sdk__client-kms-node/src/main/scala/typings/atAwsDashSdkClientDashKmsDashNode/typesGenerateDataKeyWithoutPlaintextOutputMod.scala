package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/GenerateDataKeyWithoutPlaintextOutput", JSImport.Namespace)
@js.native
object typesGenerateDataKeyWithoutPlaintextOutputMod extends js.Object {
  @js.native
  trait GenerateDataKeyWithoutPlaintextOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var CiphertextBlob: js.UndefOr[Uint8Array] = js.native
    /**
      * <p>The identifier of the CMK under which the data encryption key was generated and encrypted.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
  }
  
}

