package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/ReEncryptOutput", JSImport.Namespace)
@js.native
object typesReEncryptOutputMod extends js.Object {
  @js.native
  trait ReEncryptOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var CiphertextBlob: js.UndefOr[Uint8Array] = js.native
    /**
      * <p>Unique identifier of the CMK used to reencrypt the data.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
    /**
      * <p>Unique identifier of the CMK used to originally encrypt the data.</p>
      */
    var SourceKeyId: js.UndefOr[String] = js.native
  }
  
}

