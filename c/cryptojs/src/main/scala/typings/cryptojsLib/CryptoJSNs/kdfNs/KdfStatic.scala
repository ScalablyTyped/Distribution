package typings
package cryptojsLib.CryptoJSNs.kdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KdfStatic extends js.Object {
  var OpenSSL: IKdfImpl
}

object KdfStatic {
  @scala.inline
  def apply(OpenSSL: IKdfImpl): KdfStatic = {
    val __obj = js.Dynamic.literal(OpenSSL = OpenSSL)
  
    __obj.asInstanceOf[KdfStatic]
  }
}

