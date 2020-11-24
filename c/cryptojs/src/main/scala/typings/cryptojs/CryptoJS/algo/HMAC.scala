package typings.cryptojs.CryptoJS.algo

import typings.cryptojs.CryptoJS.lib.Base
import typings.cryptojs.CryptoJS.lib.Hasher
import typings.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HMAC extends Base {
  
  def create(): HMAC = js.native
  def create(hasher: js.UndefOr[scala.Nothing], key: String): HMAC = js.native
  def create(hasher: js.UndefOr[scala.Nothing], key: WordArray): HMAC = js.native
  def create(hasher: Hasher): HMAC = js.native
  def create(hasher: Hasher, key: String): HMAC = js.native
  def create(hasher: Hasher, key: WordArray): HMAC = js.native
  
  def finalize(messageUpdate: String): WordArray = js.native
  def finalize(messageUpdate: WordArray): WordArray = js.native
  
  def init(): Unit = js.native
  def init(hasher: js.UndefOr[scala.Nothing], key: String): Unit = js.native
  def init(hasher: js.UndefOr[scala.Nothing], key: WordArray): Unit = js.native
  def init(hasher: Hasher): Unit = js.native
  def init(hasher: Hasher, key: String): Unit = js.native
  def init(hasher: Hasher, key: WordArray): Unit = js.native
  
  def update(messageUpdate: String): HMAC = js.native
  def update(messageUpdate: WordArray): HMAC = js.native
}
