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
    * The Amazon Resource Name (key ARN) of the CMK to use in a subsequent ImportKeyMaterial request. This is the same CMK specified in the GetParametersForImport request.
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
  def apply(): GetParametersForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersForImportResponse]
  }
  @scala.inline
  implicit class GetParametersForImportResponseOps[Self <: GetParametersForImportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportToken(value: CiphertextType): Self = this.set("ImportToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportToken: Self = this.set("ImportToken", js.undefined)
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setParametersValidTo(value: DateType): Self = this.set("ParametersValidTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParametersValidTo: Self = this.set("ParametersValidTo", js.undefined)
    @scala.inline
    def setPublicKey(value: PlaintextType): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
  }
  
}

