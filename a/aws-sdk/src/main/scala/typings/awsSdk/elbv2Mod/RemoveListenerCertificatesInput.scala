package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveListenerCertificatesInput extends js.Object {
  /**
    * The certificate to remove. You can specify one certificate per call. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: CertificateList = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.elbv2Mod.ListenerArn = js.native
}

object RemoveListenerCertificatesInput {
  @scala.inline
  def apply(Certificates: CertificateList, ListenerArn: ListenerArn): RemoveListenerCertificatesInput = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveListenerCertificatesInput]
  }
}

