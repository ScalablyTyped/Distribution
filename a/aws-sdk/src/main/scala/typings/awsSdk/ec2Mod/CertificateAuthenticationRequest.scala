package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthenticationRequest extends js.Object {
  
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM).
    */
  var ClientRootCertificateChainArn: js.UndefOr[String] = js.native
}
object CertificateAuthenticationRequest {
  
  @scala.inline
  def apply(): CertificateAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthenticationRequest]
  }
  
  @scala.inline
  implicit class CertificateAuthenticationRequestOps[Self <: CertificateAuthenticationRequest] (val x: Self) extends AnyVal {
    
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
    def setClientRootCertificateChainArn(value: String): Self = this.set("ClientRootCertificateChainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRootCertificateChainArn: Self = this.set("ClientRootCertificateChainArn", js.undefined)
  }
}
