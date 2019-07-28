package typings.cryptojs.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//tparam C - Configuration type
@js.native
trait IHasher[C] extends BufferedBlockAlgorithm {
  var blockSize: Double = js.native
  var cfg: C = js.native
  def _createHelper(hasher: Hasher): IHasherHelper[C] = js.native
  def _createHmacHelper(hasher: Hasher): IHasherHmacHelper = js.native
  def create(): IHasher[C] = js.native
  def create(cfg: C): IHasher[C] = js.native
  def finalize(messageUpdate: String): WordArray = js.native
  def finalize(messageUpdate: WordArray): WordArray = js.native
  def init(): Unit = js.native
  def init(cfg: C): Unit = js.native
  def update(messageUpdate: String): Hasher = js.native
  def update(messageUpdate: WordArray): Hasher = js.native
}

