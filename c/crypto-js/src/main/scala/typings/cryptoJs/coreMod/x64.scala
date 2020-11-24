package typings.cryptoJs.coreMod

import typings.cryptoJs.mod.X64Word
import typings.cryptoJs.mod.X64WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto-js/core", "x64")
@js.native
object x64 extends js.Object {
  
  @js.native
  object Word extends js.Object {
    
    /**
      * Initializes a newly created 64-bit word.
      *
      * @param high The high 32 bits.
      * @param low The low 32 bits.
      *
      * @example
      *
      *     var x64Word = CryptoJS.x64.Word.create(0x00010203, 0x04050607);
      */
    def create(high: Double, low: Double): X64Word = js.native
  }
  
  /**
    * Initializes a newly created word array.
    *
    * @param words (Optional) An array of CryptoJS.x64.Word objects.
    * @param sigBytes (Optional) The number of significant bytes in the words.
    *
    * @example
    *
    *     var wordArray = CryptoJS.x64.WordArray.create();
    *
    *     var wordArray = CryptoJS.x64.WordArray.create([
    *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
    *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
    *     ]);
    *
    *     var wordArray = CryptoJS.x64.WordArray.create([
    *         CryptoJS.x64.Word.create(0x00010203, 0x04050607),
    *         CryptoJS.x64.Word.create(0x18191a1b, 0x1c1d1e1f)
    *     ], 10);
    */
  @js.native
  object WordArray extends js.Object {
    
    def create(): X64WordArray = js.native
    def create(words: js.UndefOr[scala.Nothing], sigBytes: Double): X64WordArray = js.native
    def create(words: js.Array[X64WordArray]): X64WordArray = js.native
    def create(words: js.Array[X64WordArray], sigBytes: Double): X64WordArray = js.native
  }
}
