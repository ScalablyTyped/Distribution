package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersForImportResponse extends js.Object {
  /**
    * The import token to send in a subsequent ImportKeyMaterial request.
    */
  var ImportToken: js.UndefOr[CiphertextType] = js.native
  /**
    * The identifier of the CMK to use in a subsequent ImportKeyMaterial request. This is the same CMK specified in the GetParametersForImport request.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an ImportKeyMaterial request and you must send another GetParametersForImport request to get new ones.
    */
  var ParametersValidTo: js.UndefOr[DateType] = js.native
  /**
    * The public key to use to encrypt the key material before importing it with ImportKeyMaterial.
    */
  var PublicKey: js.UndefOr[PlaintextType] = js.native
}

object GetParametersForImportResponse {
  @scala.inline
  def apply(
    ImportToken: CiphertextType = null,
    KeyId: KeyIdType = null,
    ParametersValidTo: DateType = null,
    PublicKey: PlaintextType = null
  ): GetParametersForImportResponse = {
    val __obj = js.Dynamic.literal()
    if (ImportToken != null) __obj.updateDynamic("ImportToken")(ImportToken.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (ParametersValidTo != null) __obj.updateDynamic("ParametersValidTo")(ParametersValidTo.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersForImportResponse]
  }
}

