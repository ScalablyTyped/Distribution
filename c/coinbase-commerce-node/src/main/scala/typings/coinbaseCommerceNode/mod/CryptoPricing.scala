package typings.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Crypto pricing object.
  */
/* Inlined {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>} */
@js.native
trait CryptoPricing extends StObject {
  
  var bitcoin: js.UndefOr[Price[CryptoCurrency]] = js.native
  
  var bitcoincash: js.UndefOr[Price[CryptoCurrency]] = js.native
  
  var ethereum: js.UndefOr[Price[CryptoCurrency]] = js.native
  
  var litecoin: js.UndefOr[Price[CryptoCurrency]] = js.native
  
  var usdc: js.UndefOr[Price[CryptoCurrency]] = js.native
}
object CryptoPricing {
  
  @scala.inline
  def apply(): CryptoPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoPricing]
  }
  
  @scala.inline
  implicit class CryptoPricingMutableBuilder[Self <: CryptoPricing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitcoin(value: Price[CryptoCurrency]): Self = StObject.set(x, "bitcoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitcoinUndefined: Self = StObject.set(x, "bitcoin", js.undefined)
    
    @scala.inline
    def setBitcoincash(value: Price[CryptoCurrency]): Self = StObject.set(x, "bitcoincash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitcoincashUndefined: Self = StObject.set(x, "bitcoincash", js.undefined)
    
    @scala.inline
    def setEthereum(value: Price[CryptoCurrency]): Self = StObject.set(x, "ethereum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEthereumUndefined: Self = StObject.set(x, "ethereum", js.undefined)
    
    @scala.inline
    def setLitecoin(value: Price[CryptoCurrency]): Self = StObject.set(x, "litecoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLitecoinUndefined: Self = StObject.set(x, "litecoin", js.undefined)
    
    @scala.inline
    def setUsdc(value: Price[CryptoCurrency]): Self = StObject.set(x, "usdc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsdcUndefined: Self = StObject.set(x, "usdc", js.undefined)
  }
}
