package typings.cryptojs.CryptoJS.lib

import typings.cryptojs.CryptoJS.enc.IEncoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordArray extends Base {
  
  def clamp(): Unit = js.native
  
  def concat(wordArray: WordArray): WordArray = js.native
  
  def create(): WordArray = js.native
  def create(typedArray: SomeArray): WordArray = js.native
  def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): WordArray = js.native
  def create(words: js.Array[Double]): WordArray = js.native
  def create(words: js.Array[Double], sigBytes: Double): WordArray = js.native
  
  def init(): Unit = js.native
  def init(typedArray: SomeArray): Unit = js.native
  def init(words: js.UndefOr[scala.Nothing], sigBytes: Double): Unit = js.native
  def init(words: js.Array[Double]): Unit = js.native
  def init(words: js.Array[Double], sigBytes: Double): Unit = js.native
  
  def random(nBytes: Double): WordArray = js.native
  
  var sigBytes: Double = js.native
  
  def toString(encoder: IEncoder): String = js.native
  
  var words: js.Array[Double] = js.native
}
