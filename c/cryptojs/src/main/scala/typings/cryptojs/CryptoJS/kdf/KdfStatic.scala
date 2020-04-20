package typings.cryptojs.CryptoJS.kdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KdfStatic extends js.Object {
  var OpenSSL: IKdfImpl
}

object KdfStatic {
  @scala.inline
  def apply(OpenSSL: IKdfImpl): KdfStatic = {
    val __obj = js.Dynamic.literal(OpenSSL = OpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[KdfStatic]
  }
}

