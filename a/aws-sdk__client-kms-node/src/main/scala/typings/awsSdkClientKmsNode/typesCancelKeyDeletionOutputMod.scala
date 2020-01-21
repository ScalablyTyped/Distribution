package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/CancelKeyDeletionOutput", JSImport.Namespace)
@js.native
object typesCancelKeyDeletionOutputMod extends js.Object {
  @js.native
  trait CancelKeyDeletionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The unique identifier of the master key for which deletion is canceled.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
  }
  
}

