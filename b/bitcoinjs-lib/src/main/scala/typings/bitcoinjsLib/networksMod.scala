package typings.bitcoinjsLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networksMod {
  
  @JSImport("bitcoinjs-lib/types/networks", "bitcoin")
  @js.native
  val bitcoin: Network = js.native
  
  @JSImport("bitcoinjs-lib/types/networks", "regtest")
  @js.native
  val regtest: Network = js.native
  
  @JSImport("bitcoinjs-lib/types/networks", "testnet")
  @js.native
  val testnet: Network = js.native
  
  trait Bip32 extends StObject {
    
    var `private`: Double
    
    var public: Double
  }
  object Bip32 {
    
    inline def apply(`private`: Double, public: Double): Bip32 = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bip32]
    }
    
    extension [Self <: Bip32](x: Self) {
      
      inline def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait Network extends StObject {
    
    var bech32: String
    
    var bip32: Bip32
    
    var messagePrefix: String
    
    var pubKeyHash: Double
    
    var scriptHash: Double
    
    var wif: Double
  }
  object Network {
    
    inline def apply(
      bech32: String,
      bip32: Bip32,
      messagePrefix: String,
      pubKeyHash: Double,
      scriptHash: Double,
      wif: Double
    ): Network = {
      val __obj = js.Dynamic.literal(bech32 = bech32.asInstanceOf[js.Any], bip32 = bip32.asInstanceOf[js.Any], messagePrefix = messagePrefix.asInstanceOf[js.Any], pubKeyHash = pubKeyHash.asInstanceOf[js.Any], scriptHash = scriptHash.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    extension [Self <: Network](x: Self) {
      
      inline def setBech32(value: String): Self = StObject.set(x, "bech32", value.asInstanceOf[js.Any])
      
      inline def setBip32(value: Bip32): Self = StObject.set(x, "bip32", value.asInstanceOf[js.Any])
      
      inline def setMessagePrefix(value: String): Self = StObject.set(x, "messagePrefix", value.asInstanceOf[js.Any])
      
      inline def setPubKeyHash(value: Double): Self = StObject.set(x, "pubKeyHash", value.asInstanceOf[js.Any])
      
      inline def setScriptHash(value: Double): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
      
      inline def setWif(value: Double): Self = StObject.set(x, "wif", value.asInstanceOf[js.Any])
    }
  }
}
