package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encoding strategy.
  */
@js.native
trait Encoder extends js.Object {
  
  /**
    * Converts a hex string to a word array.
    *
    * @param hexStr The hex string.
    *
    * @return The word array.
    *
    * @example
    *
    *     var wordArray = CryptoJS.enc.Hex.parse(hexString);
    */
  def parse(str: String): WordArray = js.native
  
  /**
    * Converts a word array to a hex string.
    *
    * @param wordArray The word array.
    *
    * @return The hex string.
    *
    * @example
    *
    *     var hexString = CryptoJS.enc.Hex.stringify(wordArray);
    */
  def stringify(wordArray: WordArray): String = js.native
}
object Encoder {
  
  @scala.inline
  def apply(parse: String => WordArray, stringify: WordArray => String): Encoder = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Encoder]
  }
  
  @scala.inline
  implicit class EncoderOps[Self <: Encoder] (val x: Self) extends AnyVal {
    
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
    def setParse(value: String => WordArray): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: WordArray => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
}
