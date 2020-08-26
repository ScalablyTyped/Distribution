package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnAuthentication extends js.Object {
  /**
    * Information about the Active Directory, if applicable.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthentication] = js.native
  /**
    * Information about the IAM SAML identity provider, if applicable.
    */
  var FederatedAuthentication: js.UndefOr[typings.awsSdk.ec2Mod.FederatedAuthentication] = js.native
  /**
    * Information about the authentication certificates, if applicable.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthentication] = js.native
  /**
    * The authentication type used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.native
}

object ClientVpnAuthentication {
  @scala.inline
  def apply(): ClientVpnAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthentication]
  }
  @scala.inline
  implicit class ClientVpnAuthenticationOps[Self <: ClientVpnAuthentication] (val x: Self) extends AnyVal {
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
    def setActiveDirectory(value: DirectoryServiceAuthentication): Self = this.set("ActiveDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveDirectory: Self = this.set("ActiveDirectory", js.undefined)
    @scala.inline
    def setFederatedAuthentication(value: FederatedAuthentication): Self = this.set("FederatedAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFederatedAuthentication: Self = this.set("FederatedAuthentication", js.undefined)
    @scala.inline
    def setMutualAuthentication(value: CertificateAuthentication): Self = this.set("MutualAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutualAuthentication: Self = this.set("MutualAuthentication", js.undefined)
    @scala.inline
    def setType(value: ClientVpnAuthenticationType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

