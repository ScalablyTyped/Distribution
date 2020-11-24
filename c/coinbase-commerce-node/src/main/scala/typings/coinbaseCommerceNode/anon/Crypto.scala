package typings.coinbaseCommerceNode.anon

import typings.coinbaseCommerceNode.mod.CryptoCurrency
import typings.coinbaseCommerceNode.mod.FiatCurrency
import typings.coinbaseCommerceNode.mod.Price
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crypto extends js.Object {
  
  var crypto: Price[CryptoCurrency] = js.native
  
  var local: Price[FiatCurrency] = js.native
}
object Crypto {
  
  @scala.inline
  def apply(crypto: Price[CryptoCurrency], local: Price[FiatCurrency]): Crypto = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
  
  @scala.inline
  implicit class CryptoOps[Self <: Crypto] (val x: Self) extends AnyVal {
    
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
    def setCrypto(value: Price[CryptoCurrency]): Self = this.set("crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Price[FiatCurrency]): Self = this.set("local", value.asInstanceOf[js.Any])
  }
}
