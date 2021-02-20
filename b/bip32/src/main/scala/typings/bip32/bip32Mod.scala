package typings.bip32

import typings.bip32.anon.Private
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip32Mod {
  
  @JSImport("bip32/types/bip32", "fromBase58")
  @js.native
  def fromBase58(inString: String): BIP32Interface = js.native
  @JSImport("bip32/types/bip32", "fromBase58")
  @js.native
  def fromBase58(inString: String, network: Network): BIP32Interface = js.native
  
  @JSImport("bip32/types/bip32", "fromPrivateKey")
  @js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  @JSImport("bip32/types/bip32", "fromPrivateKey")
  @js.native
  def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  
  @JSImport("bip32/types/bip32", "fromPublicKey")
  @js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
  @JSImport("bip32/types/bip32", "fromPublicKey")
  @js.native
  def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
  
  @JSImport("bip32/types/bip32", "fromSeed")
  @js.native
  def fromSeed(seed: Buffer): BIP32Interface = js.native
  @JSImport("bip32/types/bip32", "fromSeed")
  @js.native
  def fromSeed(seed: Buffer, network: Network): BIP32Interface = js.native
  
  @js.native
  trait BIP32Interface extends StObject {
    
    var chainCode: Buffer = js.native
    
    var depth: Double = js.native
    
    def derive(index: Double): BIP32Interface = js.native
    
    def deriveHardened(index: Double): BIP32Interface = js.native
    
    def derivePath(path: String): BIP32Interface = js.native
    
    var fingerprint: Buffer = js.native
    
    var identifier: Buffer = js.native
    
    var index: Double = js.native
    
    def isNeutered(): Boolean = js.native
    
    var lowR: Boolean = js.native
    
    var network: Network = js.native
    
    def neutered(): BIP32Interface = js.native
    
    var parentFingerprint: Double = js.native
    
    var privateKey: js.UndefOr[Buffer] = js.native
    
    var publicKey: Buffer = js.native
    
    def sign(hash: Buffer): Buffer = js.native
    def sign(hash: Buffer, lowR: Boolean): Buffer = js.native
    
    def toBase58(): String = js.native
    
    def toWIF(): String = js.native
    
    def verify(hash: Buffer, signature: Buffer): Boolean = js.native
  }
  
  @js.native
  trait Network extends StObject {
    
    var bech32: js.UndefOr[String] = js.native
    
    var bip32: Private = js.native
    
    var messagePrefix: js.UndefOr[String] = js.native
    
    var pubKeyHash: js.UndefOr[Double] = js.native
    
    var scriptHash: js.UndefOr[Double] = js.native
    
    var wif: Double = js.native
  }
  object Network {
    
    @scala.inline
    def apply(bip32: Private, wif: Double): Network = {
      val __obj = js.Dynamic.literal(bip32 = bip32.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    @scala.inline
    implicit class NetworkMutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBech32(value: String): Self = StObject.set(x, "bech32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBech32Undefined: Self = StObject.set(x, "bech32", js.undefined)
      
      @scala.inline
      def setBip32(value: Private): Self = StObject.set(x, "bip32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagePrefix(value: String): Self = StObject.set(x, "messagePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagePrefixUndefined: Self = StObject.set(x, "messagePrefix", js.undefined)
      
      @scala.inline
      def setPubKeyHash(value: Double): Self = StObject.set(x, "pubKeyHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubKeyHashUndefined: Self = StObject.set(x, "pubKeyHash", js.undefined)
      
      @scala.inline
      def setScriptHash(value: Double): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptHashUndefined: Self = StObject.set(x, "scriptHash", js.undefined)
      
      @scala.inline
      def setWif(value: Double): Self = StObject.set(x, "wif", value.asInstanceOf[js.Any])
    }
  }
}
