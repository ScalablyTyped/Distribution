package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array of 64-bit words.
  */
@js.native
trait X64WordArray extends StObject {
  
  /**
    * The number of significant bytes in this word array.
    */
  var sigBytes: Double = js.native
  
  /**
    * Converts this 64-bit word array to a 32-bit word array.
    *
    * @return This word array's data as a 32-bit word array.
    *
    * @example
    *
    *     var x32WordArray = x64WordArray.toX32();
    */
  def toX32(): WordArray = js.native
  
  /**
    * The array of CryptoJS.x64.Word objects.
    */
  var words: js.Array[Double] = js.native
}
object X64WordArray {
  
  @scala.inline
  def apply(sigBytes: Double, toX32: () => WordArray, words: js.Array[Double]): X64WordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes.asInstanceOf[js.Any], toX32 = js.Any.fromFunction0(toX32), words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[X64WordArray]
  }
  
  @scala.inline
  implicit class X64WordArrayMutableBuilder[Self <: X64WordArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSigBytes(value: Double): Self = StObject.set(x, "sigBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToX32(value: () => WordArray): Self = StObject.set(x, "toX32", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
