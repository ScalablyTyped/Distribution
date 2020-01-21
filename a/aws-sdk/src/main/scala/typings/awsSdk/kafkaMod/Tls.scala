package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tls extends js.Object {
  /**
    * 
    List of ACM Certificate Authority ARNs.
    
    */
  var CertificateAuthorityArnList: js.UndefOr[listOfString] = js.native
}

object Tls {
  @scala.inline
  def apply(CertificateAuthorityArnList: listOfString = null): Tls = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityArnList != null) __obj.updateDynamic("CertificateAuthorityArnList")(CertificateAuthorityArnList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tls]
  }
}

