package typings.awsSdkClientKmsBrowser.typesGenerateDataKeyOutputMod

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateDataKeyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var CiphertextBlob: js.UndefOr[Uint8Array] = js.undefined
  /**
    * <p>The identifier of the CMK under which the data encryption key was generated and encrypted.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded. Use this data key for local encryption and decryption, then remove it from memory as soon as possible.</p>
    */
  var Plaintext: js.UndefOr[Uint8Array] = js.undefined
}

object GenerateDataKeyOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CiphertextBlob: Uint8Array = null,
    KeyId: String = null,
    Plaintext: Uint8Array = null
  ): GenerateDataKeyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyOutput]
  }
}

