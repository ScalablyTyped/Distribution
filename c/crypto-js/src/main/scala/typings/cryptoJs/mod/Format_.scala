package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Formatting strategy.
  */
@js.native
trait Format_ extends js.Object {
  
  /**
    * Converts an OpenSSL-compatible string to a cipher params object.
    *
    * @param openSSLStr The OpenSSL-compatible string.
    *
    * @return The cipher params object.
    *
    * @example
    *
    *     var cipherParams = CryptoJS.format.OpenSSL.parse(openSSLString);
    */
  def parse(str: String): CipherParams = js.native
  
  /**
    * Converts a cipher params object to an OpenSSL-compatible string.
    *
    * @param cipherParams The cipher params object.
    *
    * @return The OpenSSL-compatible string.
    *
    * @example
    *
    *     var openSSLString = CryptoJS.format.OpenSSL.stringify(cipherParams);
    */
  def stringify(cipherParams: CipherParams): String = js.native
}
object Format_ {
  
  @scala.inline
  def apply(parse: String => CipherParams, stringify: CipherParams => String): Format_ = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Format_]
  }
  
  @scala.inline
  implicit class Format_Ops[Self <: Format_] (val x: Self) extends AnyVal {
    
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
    def setParse(value: String => CipherParams): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: CipherParams => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
}
