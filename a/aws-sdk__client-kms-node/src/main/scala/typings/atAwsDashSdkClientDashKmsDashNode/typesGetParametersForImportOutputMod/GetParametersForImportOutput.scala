package typings.atAwsDashSdkClientDashKmsDashNode.typesGetParametersForImportOutputMod

import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParametersForImportOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The import token to send in a subsequent <a>ImportKeyMaterial</a> request.</p>
    */
  var ImportToken: js.UndefOr[Uint8Array] = js.undefined
  /**
    * <p>The identifier of the CMK to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same CMK specified in the <code>GetParametersForImport</code> request.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  /**
    * <p>The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to get new ones.</p>
    */
  var ParametersValidTo: js.UndefOr[Date] = js.undefined
  /**
    * <p>The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.</p>
    */
  var PublicKey: js.UndefOr[Uint8Array] = js.undefined
}

object GetParametersForImportOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ImportToken: Uint8Array = null,
    KeyId: String = null,
    ParametersValidTo: Date = null,
    PublicKey: Uint8Array = null
  ): GetParametersForImportOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ImportToken != null) __obj.updateDynamic("ImportToken")(ImportToken)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (ParametersValidTo != null) __obj.updateDynamic("ParametersValidTo")(ParametersValidTo)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    __obj.asInstanceOf[GetParametersForImportOutput]
  }
}

