package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//tparam C - Configuration type
@js.native
trait IHasherHelper[C] extends js.Object {
  def apply(message: WordArray): WordArray = js.native
  def apply(message: WordArray, cfg: C): WordArray = js.native
  def apply(message: java.lang.String): WordArray = js.native
  def apply(message: java.lang.String, cfg: C): WordArray = js.native
}

