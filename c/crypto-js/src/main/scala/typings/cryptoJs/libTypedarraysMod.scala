package typings.cryptoJs

import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypedarraysMod {
  
  /**
    * Initializes a newly created word array.
    *
    * @param words (Optional) An array of 32-bit words.
    * @param sigBytes (Optional) The number of significant bytes in the words.
    *
    * @example
    *
    *     var wordArray = CryptoJS.lib.WordArray.create();
    *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607]);
    *     var wordArray = CryptoJS.lib.WordArray.create([0x00010203, 0x04050607], 6);
    */
  @JSImport("crypto-js/lib-typedarrays", "create")
  @js.native
  def create(): WordArray = js.native
  @JSImport("crypto-js/lib-typedarrays", "create")
  @js.native
  def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): WordArray = js.native
  @JSImport("crypto-js/lib-typedarrays", "create")
  @js.native
  def create(words: js.Array[Double]): WordArray = js.native
  @JSImport("crypto-js/lib-typedarrays", "create")
  @js.native
  def create(words: js.Array[Double], sigBytes: Double): WordArray = js.native
  
  /**
    * Creates a word array filled with random bytes.
    *
    * @param nBytes The number of random bytes to generate.
    *
    * @return The random word array.
    *
    * @example
    *
    *     var wordArray = CryptoJS.lib.WordArray.random(16);
    */
  @JSImport("crypto-js/lib-typedarrays", "random")
  @js.native
  def random(nBytes: Double): WordArray = js.native
}
