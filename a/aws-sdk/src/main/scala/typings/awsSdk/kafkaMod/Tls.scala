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
  def apply(): Tls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tls]
  }
  @scala.inline
  implicit class TlsOps[Self <: Tls] (val x: Self) extends AnyVal {
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
    def setCertificateAuthorityArnListVarargs(value: string*): Self = this.set("CertificateAuthorityArnList", js.Array(value :_*))
    @scala.inline
    def setCertificateAuthorityArnList(value: listOfString): Self = this.set("CertificateAuthorityArnList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorityArnList: Self = this.set("CertificateAuthorityArnList", js.undefined)
  }
  
}

