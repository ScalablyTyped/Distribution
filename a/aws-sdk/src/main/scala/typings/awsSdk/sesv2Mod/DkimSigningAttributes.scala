package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DkimSigningAttributes extends js.Object {
  /**
    * A private key that's used to generate a DKIM signature. The private key must use 1024-bit RSA encryption, and must be encoded using base64 encoding.
    */
  var DomainSigningPrivateKey: PrivateKey = js.native
  /**
    * A string that's used to identify a public key in the DNS configuration for a domain.
    */
  var DomainSigningSelector: Selector = js.native
}

object DkimSigningAttributes {
  @scala.inline
  def apply(DomainSigningPrivateKey: PrivateKey, DomainSigningSelector: Selector): DkimSigningAttributes = {
    val __obj = js.Dynamic.literal(DomainSigningPrivateKey = DomainSigningPrivateKey.asInstanceOf[js.Any], DomainSigningSelector = DomainSigningSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DkimSigningAttributes]
  }
  @scala.inline
  implicit class DkimSigningAttributesOps[Self <: DkimSigningAttributes] (val x: Self) extends AnyVal {
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
    def setDomainSigningPrivateKey(value: PrivateKey): Self = this.set("DomainSigningPrivateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainSigningSelector(value: Selector): Self = this.set("DomainSigningSelector", value.asInstanceOf[js.Any])
  }
  
}

