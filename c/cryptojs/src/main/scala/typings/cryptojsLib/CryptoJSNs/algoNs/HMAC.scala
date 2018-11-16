package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HMAC
  extends cryptojsLib.CryptoJSNs.libNs.Base {
  def create(): HMAC = js.native
  def create(hasher: cryptojsLib.CryptoJSNs.libNs.Hasher): HMAC = js.native
  def create(hasher: cryptojsLib.CryptoJSNs.libNs.Hasher, key: cryptojsLib.CryptoJSNs.libNs.WordArray): HMAC = js.native
  def create(hasher: cryptojsLib.CryptoJSNs.libNs.Hasher, key: java.lang.String): HMAC = js.native
  def finalize(messageUpdate: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def finalize(messageUpdate: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def init(): scala.Unit = js.native
  def init(hasher: cryptojsLib.CryptoJSNs.libNs.Hasher): scala.Unit = js.native
  def init(hasher: cryptojsLib.CryptoJSNs.libNs.Hasher, key: cryptojsLib.CryptoJSNs.libNs.WordArray): scala.Unit = js.native
  def init(hasher: cryptojsLib.CryptoJSNs.libNs.Hasher, key: java.lang.String): scala.Unit = js.native
  def update(messageUpdate: cryptojsLib.CryptoJSNs.libNs.WordArray): HMAC = js.native
  def update(messageUpdate: java.lang.String): HMAC = js.native
}

