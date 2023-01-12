package typings.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Crypto pricing object.
  */
/* Inlined {[ key in coinbase-commerce-node.coinbase-commerce-node.CryptoName ]:? coinbase-commerce-node.coinbase-commerce-node.Price<coinbase-commerce-node.coinbase-commerce-node.CryptoCurrency>} */
trait CryptoPricing extends StObject {
  
  var bitcoin: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  
  var bitcoincash: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  
  var ethereum: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  
  var litecoin: js.UndefOr[Price[CryptoCurrency]] = js.undefined
  
  var usdc: js.UndefOr[Price[CryptoCurrency]] = js.undefined
}
object CryptoPricing {
  
  inline def apply(): CryptoPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoPricing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoPricing] (val x: Self) extends AnyVal {
    
    inline def setBitcoin(value: Price[CryptoCurrency]): Self = StObject.set(x, "bitcoin", value.asInstanceOf[js.Any])
    
    inline def setBitcoinUndefined: Self = StObject.set(x, "bitcoin", js.undefined)
    
    inline def setBitcoincash(value: Price[CryptoCurrency]): Self = StObject.set(x, "bitcoincash", value.asInstanceOf[js.Any])
    
    inline def setBitcoincashUndefined: Self = StObject.set(x, "bitcoincash", js.undefined)
    
    inline def setEthereum(value: Price[CryptoCurrency]): Self = StObject.set(x, "ethereum", value.asInstanceOf[js.Any])
    
    inline def setEthereumUndefined: Self = StObject.set(x, "ethereum", js.undefined)
    
    inline def setLitecoin(value: Price[CryptoCurrency]): Self = StObject.set(x, "litecoin", value.asInstanceOf[js.Any])
    
    inline def setLitecoinUndefined: Self = StObject.set(x, "litecoin", js.undefined)
    
    inline def setUsdc(value: Price[CryptoCurrency]): Self = StObject.set(x, "usdc", value.asInstanceOf[js.Any])
    
    inline def setUsdcUndefined: Self = StObject.set(x, "usdc", js.undefined)
  }
}
