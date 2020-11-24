package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//tparam C - Configuration type
@js.native
trait IHasherHelper[C] extends js.Object {
  
  def apply(message: String): WordArray = js.native
  def apply(message: String, cfg: C): WordArray = js.native
  def apply(message: WordArray): WordArray = js.native
  def apply(message: WordArray, cfg: C): WordArray = js.native
}
