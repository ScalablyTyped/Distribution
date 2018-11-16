package typings
package cryptojsLib.CryptoJSNs.kdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKdfImpl extends js.Object {
  def execute(password: java.lang.String, keySize: scala.Double, ivSize: scala.Double): cryptojsLib.CryptoJSNs.libNs.CipherParams = js.native
  def execute(
    password: java.lang.String,
    keySize: scala.Double,
    ivSize: scala.Double,
    salt: cryptojsLib.CryptoJSNs.libNs.WordArray
  ): cryptojsLib.CryptoJSNs.libNs.CipherParams = js.native
  def execute(password: java.lang.String, keySize: scala.Double, ivSize: scala.Double, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.CipherParams = js.native
}

