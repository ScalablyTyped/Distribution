package typings.createXpub

import typings.createXpub.createXpubNumbers.`0x043587CF`
import typings.createXpub.createXpubNumbers.`0x0488B21E`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a Base58 encoded extended public key (xpub) for use in a
    * [BIP32 hierarchical deterministic wallet](https://github.com/bitcoin/bips/blob/master/bip-0032.mediawiki).
    *
    * Tip: If you're working with ledgerjs you can pass the output of
    * [`getWalletPublicKey()`](http://ledgerhq.github.io/ledgerjs/docs/#btcgetwalletpublickey) almost directly in.
    *
    * @returns A Base58 encoded extended public key.
    */
  inline def apply(options: Options): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("create-xpub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mainnet (xpub) version bytes.
    */
  @JSImport("create-xpub", "mainnet")
  @js.native
  val mainnet: `0x0488B21E` = js.native
  
  /**
    * Testnet (tpub) version bytes.
    */
  @JSImport("create-xpub", "testnet")
  @js.native
  val testnet: `0x043587CF` = js.native
  
  trait Options extends StObject {
    
    /**
      * The chain code.
      */
    var chainCode: String
    
    /**
      * The child number.
      */
    var childNumber: Double
    
    /**
      * The depth of the derived key.
      */
    var depth: Double
    
    /**
      * Network version bytes.
      * @default 0x0488B21E
      */
    var networkVersion: js.UndefOr[Double] = js.undefined
    
    /**
      * The public key in compressed or uncompressed form.
      */
    var publicKey: String
  }
  object Options {
    
    inline def apply(chainCode: String, childNumber: Double, depth: Double, publicKey: String): Options = {
      val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], childNumber = childNumber.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
      
      inline def setChildNumber(value: Double): Self = StObject.set(x, "childNumber", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setNetworkVersion(value: Double): Self = StObject.set(x, "networkVersion", value.asInstanceOf[js.Any])
      
      inline def setNetworkVersionUndefined: Self = StObject.set(x, "networkVersion", js.undefined)
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
