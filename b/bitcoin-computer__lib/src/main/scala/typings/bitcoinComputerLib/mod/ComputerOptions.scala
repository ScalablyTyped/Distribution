package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  chain :@bitcoin-computer/lib.@bitcoin-computer/lib.Chain,   mnemonic :string,   network :@bitcoin-computer/lib.@bitcoin-computer/lib.Network,   passphrase :string,   path :string,   seed :string,   url :string}> */
trait ComputerOptions extends StObject {
  
  var chain: js.UndefOr[Chain] = js.undefined
  
  var mnemonic: js.UndefOr[String] = js.undefined
  
  var network: js.UndefOr[Network] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var seed: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ComputerOptions {
  
  inline def apply(): ComputerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputerOptions] (val x: Self) extends AnyVal {
    
    inline def setChain(value: Chain): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setMnemonic(value: String): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
    
    inline def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
