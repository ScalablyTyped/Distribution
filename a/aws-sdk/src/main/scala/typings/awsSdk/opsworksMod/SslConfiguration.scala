package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslConfiguration extends js.Object {
  /**
    * The contents of the certificate's domain.crt file.
    */
  var Certificate: String = js.native
  /**
    * Optional. Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var Chain: js.UndefOr[String] = js.native
  /**
    * The private key; the contents of the certificate's domain.kex file.
    */
  var PrivateKey: String = js.native
}

object SslConfiguration {
  @scala.inline
  def apply(Certificate: String, PrivateKey: String): SslConfiguration = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslConfiguration]
  }
  @scala.inline
  implicit class SslConfigurationOps[Self <: SslConfiguration] (val x: Self) extends AnyVal {
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
    def setCertificate(value: String): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("PrivateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setChain(value: String): Self = this.set("Chain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChain: Self = this.set("Chain", js.undefined)
  }
  
}

