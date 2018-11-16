package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvpKDFHelper extends js.Object {
  def apply(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(
    password: cryptojsLib.CryptoJSNs.libNs.WordArray,
    salt: cryptojsLib.CryptoJSNs.libNs.WordArray,
    cfg: IEvpKDFCfg
  ): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: java.lang.String, cfg: IEvpKDFCfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(password: java.lang.String, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(password: java.lang.String, salt: cryptojsLib.CryptoJSNs.libNs.WordArray, cfg: IEvpKDFCfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(password: java.lang.String, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def apply(password: java.lang.String, salt: java.lang.String, cfg: IEvpKDFCfg): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
}

