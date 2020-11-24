package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Padding strategy.
  */
@js.native
trait Padding extends js.Object {
  
  /**
    * Pads data using the algorithm defined in PKCS #5/7.
    *
    * @param data The data to pad.
    * @param blockSize The multiple that the data should be padded to.
    *
    * @example
    *
    *     CryptoJS.pad.Pkcs7.pad(wordArray, 4);
    */
  def pad(data: WordArray, blockSize: Double): Unit = js.native
  
  /**
    * Unpads data that had been padded using the algorithm defined in PKCS #5/7.
    *
    * @param data The data to unpad.
    *
    * @example
    *
    *     CryptoJS.pad.Pkcs7.unpad(wordArray);
    */
  def unpad(data: WordArray): Unit = js.native
}
object Padding {
  
  @scala.inline
  def apply(pad: (WordArray, Double) => Unit, unpad: WordArray => Unit): Padding = {
    val __obj = js.Dynamic.literal(pad = js.Any.fromFunction2(pad), unpad = js.Any.fromFunction1(unpad))
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingOps[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPad(value: (WordArray, Double) => Unit): Self = this.set("pad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnpad(value: WordArray => Unit): Self = this.set("unpad", js.Any.fromFunction1(value))
  }
}
