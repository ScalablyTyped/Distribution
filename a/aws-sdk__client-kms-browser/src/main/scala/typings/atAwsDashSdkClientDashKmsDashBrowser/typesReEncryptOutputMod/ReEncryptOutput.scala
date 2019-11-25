package typings.atAwsDashSdkClientDashKmsDashBrowser.typesReEncryptOutputMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReEncryptOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not encoded.</p>
    */
  var CiphertextBlob: js.UndefOr[Uint8Array] = js.undefined
  /**
    * <p>Unique identifier of the CMK used to reencrypt the data.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>Unique identifier of the CMK used to originally encrypt the data.</p>
    */
  var SourceKeyId: js.UndefOr[String] = js.undefined
}

object ReEncryptOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CiphertextBlob: Uint8Array = null,
    KeyId: String = null,
    SourceKeyId: String = null
  ): ReEncryptOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (SourceKeyId != null) __obj.updateDynamic("SourceKeyId")(SourceKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReEncryptOutput]
  }
}

