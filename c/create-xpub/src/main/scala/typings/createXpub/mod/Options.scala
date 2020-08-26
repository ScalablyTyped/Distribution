package typings.createXpub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The chain code.
    */
  var chainCode: String = js.native
  /**
    * The child number.
    */
  var childNumber: Double = js.native
  /**
    * The depth of the derived key.
    */
  var depth: Double = js.native
  /**
    * Network version bytes.
    * @default 0x0488B21E
    */
  var networkVersion: js.UndefOr[Double] = js.native
  /**
    * The public key in compressed or uncompressed form.
    */
  var publicKey: String = js.native
}

object Options {
  @scala.inline
  def apply(chainCode: String, childNumber: Double, depth: Double, publicKey: String): Options = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNumber = childNumber.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setChainCode(value: String): Self = this.set("chainCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNumber(value: Double): Self = this.set("childNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkVersion(value: Double): Self = this.set("networkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkVersion: Self = this.set("networkVersion", js.undefined)
  }
  
}

