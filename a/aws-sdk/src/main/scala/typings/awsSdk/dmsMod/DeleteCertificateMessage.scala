package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCertificateMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted certificate.
    */
  var CertificateArn: String = js.native
}

object DeleteCertificateMessage {
  @scala.inline
  def apply(CertificateArn: String): DeleteCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCertificateMessage]
  }
}

