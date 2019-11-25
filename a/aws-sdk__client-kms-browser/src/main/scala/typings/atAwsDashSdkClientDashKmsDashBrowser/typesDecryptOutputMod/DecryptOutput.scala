package typings.atAwsDashSdkClientDashKmsDashBrowser.typesDecryptOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the operation.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var Plaintext: js.UndefOr[Uint8Array] = js.undefined
}

object DecryptOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, KeyId: String = null, Plaintext: Uint8Array = null): DecryptOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOutput]
  }
}

