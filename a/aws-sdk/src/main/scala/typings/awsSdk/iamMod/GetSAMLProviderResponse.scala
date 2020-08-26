package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSAMLProviderResponse extends js.Object {
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  /**
    * The XML metadata document that includes information about an identity provider.
    */
  var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.native
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[dateType] = js.native
}

object GetSAMLProviderResponse {
  @scala.inline
  def apply(): GetSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSAMLProviderResponse]
  }
  @scala.inline
  implicit class GetSAMLProviderResponseOps[Self <: GetSAMLProviderResponse] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setSAMLMetadataDocument(value: SAMLMetadataDocumentType): Self = this.set("SAMLMetadataDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSAMLMetadataDocument: Self = this.set("SAMLMetadataDocument", js.undefined)
    @scala.inline
    def setValidUntil(value: dateType): Self = this.set("ValidUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUntil: Self = this.set("ValidUntil", js.undefined)
  }
  
}

