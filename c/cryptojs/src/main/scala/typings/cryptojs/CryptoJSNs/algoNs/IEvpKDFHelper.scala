package typings.cryptojs.CryptoJSNs.algoNs

import typings.cryptojs.CryptoJSNs.libNs.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvpKDFHelper extends js.Object {
  def apply(password: String, salt: String): WordArray = js.native
  def apply(password: String, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
  def apply(password: String, salt: WordArray): WordArray = js.native
  def apply(password: String, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
  def apply(password: WordArray, salt: String): WordArray = js.native
  def apply(password: WordArray, salt: String, cfg: IEvpKDFCfg): WordArray = js.native
  def apply(password: WordArray, salt: WordArray): WordArray = js.native
  def apply(password: WordArray, salt: WordArray, cfg: IEvpKDFCfg): WordArray = js.native
}

