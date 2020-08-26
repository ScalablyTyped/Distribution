package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningClaimResponse extends js.Object {
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The provisioning claim certificate.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The provisioning claim expiration time.
    */
  var expiration: js.UndefOr[DateType] = js.native
  /**
    * The provisioning claim key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object CreateProvisioningClaimResponse {
  @scala.inline
  def apply(): CreateProvisioningClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisioningClaimResponse]
  }
  @scala.inline
  implicit class CreateProvisioningClaimResponseOps[Self <: CreateProvisioningClaimResponse] (val x: Self) extends AnyVal {
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
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePem: Self = this.set("certificatePem", js.undefined)
    @scala.inline
    def setExpiration(value: DateType): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setKeyPair(value: KeyPair): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
  }
  
}

