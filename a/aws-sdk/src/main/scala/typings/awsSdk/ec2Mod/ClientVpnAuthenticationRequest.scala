package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnAuthenticationRequest extends js.Object {
  /**
    * Information about the Active Directory to be used, if applicable. You must provide this information if Type is directory-service-authentication.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthenticationRequest] = js.native
  /**
    * Information about the IAM SAML identity provider to be used, if applicable. You must provide this information if Type is federated-authentication.
    */
  var FederatedAuthentication: js.UndefOr[FederatedAuthenticationRequest] = js.native
  /**
    * Information about the authentication certificates to be used, if applicable. You must provide this information if Type is certificate-authentication.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthenticationRequest] = js.native
  /**
    * The type of client authentication to be used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.native
}

object ClientVpnAuthenticationRequest {
  @scala.inline
  def apply(): ClientVpnAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthenticationRequest]
  }
  @scala.inline
  implicit class ClientVpnAuthenticationRequestOps[Self <: ClientVpnAuthenticationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveDirectory(value: DirectoryServiceAuthenticationRequest): Self = this.set("ActiveDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveDirectory: Self = this.set("ActiveDirectory", js.undefined)
    @scala.inline
    def setFederatedAuthentication(value: FederatedAuthenticationRequest): Self = this.set("FederatedAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFederatedAuthentication: Self = this.set("FederatedAuthentication", js.undefined)
    @scala.inline
    def setMutualAuthentication(value: CertificateAuthenticationRequest): Self = this.set("MutualAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutualAuthentication: Self = this.set("MutualAuthentication", js.undefined)
    @scala.inline
    def setType(value: ClientVpnAuthenticationType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

