package typings.cryptoJs.mod.global.CryptoJS.x64

import typings.cryptoJs.mod.X64Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 64-bit word.
  */
@js.native
trait Word extends js.Object {
  
  /**
    * Adds this word with the passed word.
    *
    * @param word The x64-Word to add with this word.
    *
    * @return A new x64-Word object after adding.
    *
    * @example
    *
    *     var added = x64Word.add(anotherX64Word);
    */
  def add(word: X64Word): X64Word = js.native
  
  /**
    * Bitwise ANDs this word with the passed word.
    *
    * @param word The x64-Word to AND with this word.
    *
    * @return A new x64-Word object after ANDing.
    *
    * @example
    *
    *     var anded = x64Word.and(anotherX64Word);
    */
  def and(word: X64Word): X64Word = js.native
  
  /**
    * Bitwise NOTs this word.
    *
    * @return A new x64-Word object after negating.
    *
    * @example
    *
    *     var negated = x64Word.not();
    */
  def not(): X64Word = js.native
  
  /**
    * Bitwise ORs this word with the passed word.
    *
    * @param word The x64-Word to OR with this word.
    *
    * @return A new x64-Word object after ORing.
    *
    * @example
    *
    *     var ored = x64Word.or(anotherX64Word);
    */
  def or(word: X64Word): X64Word = js.native
  
  /**
    * Rotates this word n bits to the left.
    *
    * @param n The number of bits to rotate.
    *
    * @return A new x64-Word object after rotating.
    *
    * @example
    *
    *     var rotated = x64Word.rotL(25);
    */
  def rotL(n: Double): X64Word = js.native
  
  /**
    * Rotates this word n bits to the right.
    *
    * @param n The number of bits to rotate.
    *
    * @return A new x64-Word object after rotating.
    *
    * @example
    *
    *     var rotated = x64Word.rotR(7);
    */
  def rotR(n: Double): X64Word = js.native
  
  /**
    * Shifts this word n bits to the left.
    *
    * @param n The number of bits to shift.
    *
    * @return A new x64-Word object after shifting.
    *
    * @example
    *
    *     var shifted = x64Word.shiftL(25);
    */
  def shiftL(n: Double): X64Word = js.native
  
  /**
    * Shifts this word n bits to the right.
    *
    * @param n The number of bits to shift.
    *
    * @return A new x64-Word object after shifting.
    *
    * @example
    *
    *     var shifted = x64Word.shiftR(7);
    */
  def shiftR(n: Double): X64Word = js.native
  
  /**
    * Bitwise XORs this word with the passed word.
    *
    * @param word The x64-Word to XOR with this word.
    *
    * @return A new x64-Word object after XORing.
    *
    * @example
    *
    *     var xored = x64Word.xor(anotherX64Word);
    */
  def xor(word: X64Word): X64Word = js.native
}
@JSGlobal("CryptoJS.x64.Word")
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
