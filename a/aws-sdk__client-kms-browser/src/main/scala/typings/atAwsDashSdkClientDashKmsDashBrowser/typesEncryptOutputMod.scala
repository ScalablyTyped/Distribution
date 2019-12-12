package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/EncryptOutput", JSImport.Namespace)
@js.native
object typesEncryptOutputMod extends js.Object {
  @js.native
  trait EncryptOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
      */
    var CiphertextBlob: js.UndefOr[Uint8Array] = js.native
    /**
      * <p>The ID of the key used during encryption.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
  }
  
}

