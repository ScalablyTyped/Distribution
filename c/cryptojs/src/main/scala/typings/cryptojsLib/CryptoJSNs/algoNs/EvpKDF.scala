package typings
package cryptojsLib.CryptoJSNs.algoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvpKDF
  extends cryptojsLib.CryptoJSNs.libNs.Base {
  var cfg: IEvpKDFCfg = js.native
  def compute(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def compute(password: cryptojsLib.CryptoJSNs.libNs.WordArray, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def compute(password: java.lang.String, salt: cryptojsLib.CryptoJSNs.libNs.WordArray): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def compute(password: java.lang.String, salt: java.lang.String): cryptojsLib.CryptoJSNs.libNs.WordArray = js.native
  def create(): EvpKDF = js.native
  def create(cfg: IEvpKDFCfg): EvpKDF = js.native
  def init(): scala.Unit = js.native
  def init(cfg: IEvpKDFCfg): scala.Unit = js.native
}

