package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPair extends js.Object {
  /**
    * The private key.
    */
  var PrivateKey: js.UndefOr[typings.awsSdk.iotMod.PrivateKey] = js.native
  /**
    * The public key.
    */
  var PublicKey: js.UndefOr[typings.awsSdk.iotMod.PublicKey] = js.native
}

object KeyPair {
  @scala.inline
  def apply(): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPair]
  }
  @scala.inline
  implicit class KeyPairOps[Self <: KeyPair] (val x: Self) extends AnyVal {
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
    def setPrivateKey(value: PrivateKey): Self = this.set("PrivateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKey: Self = this.set("PrivateKey", js.undefined)
    @scala.inline
    def setPublicKey(value: PublicKey): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
  }
  
}

