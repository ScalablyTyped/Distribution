package typings.atAwsDashSdkSignatureDashV4.buildSignatureV4Mod

import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureV4CryptoInit extends js.Object {
  var sha256: HashConstructor
}

object SignatureV4CryptoInit {
  @scala.inline
  def apply(sha256: HashConstructor): SignatureV4CryptoInit = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignatureV4CryptoInit]
  }
}

