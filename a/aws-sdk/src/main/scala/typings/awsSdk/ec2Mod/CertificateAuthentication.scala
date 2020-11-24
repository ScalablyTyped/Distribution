package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthentication extends js.Object {
  
  /**
    * The ARN of the client certificate. 
    */
  var ClientRootCertificateChain: js.UndefOr[String] = js.native
}
object CertificateAuthentication {
  
  @scala.inline
  def apply(): CertificateAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthentication]
  }
  
  @scala.inline
  implicit class CertificateAuthenticationOps[Self <: CertificateAuthentication] (val x: Self) extends AnyVal {
    
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
    def setClientRootCertificateChain(value: String): Self = this.set("ClientRootCertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRootCertificateChain: Self = this.set("ClientRootCertificateChain", js.undefined)
  }
}
