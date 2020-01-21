package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthentication extends js.Object {
  /**
    * The ARN of the client certificate. 
    */
  var ClientRootCertificateChain: js.UndefOr[String] = js.native
}

object CertificateAuthentication {
  @scala.inline
  def apply(ClientRootCertificateChain: String = null): CertificateAuthentication = {
    val __obj = js.Dynamic.literal()
    if (ClientRootCertificateChain != null) __obj.updateDynamic("ClientRootCertificateChain")(ClientRootCertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthentication]
  }
}

