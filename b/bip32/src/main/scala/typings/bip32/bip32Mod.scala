package typings.bip32

import typings.bip32.anon.Private
import typings.bip32.bip32Ints.`0`
import typings.bip32.bip32Ints.`1`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip32Mod {
  
  @JSImport("bip32/types/bip32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BIP32Factory(ecc: TinySecp256k1Interface): BIP32API = ^.asInstanceOf[js.Dynamic].applyDynamic("BIP32Factory")(ecc.asInstanceOf[js.Any]).asInstanceOf[BIP32API]
  
  @js.native
  trait BIP32API extends StObject {
    
    def fromBase58(inString: String): BIP32Interface = js.native
    def fromBase58(inString: String, network: Network): BIP32Interface = js.native
    
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
    
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: Network): BIP32Interface = js.native
    
    def fromSeed(seed: Buffer): BIP32Interface = js.native
    def fromSeed(seed: Buffer, network: Network): BIP32Interface = js.native
  }
  
  @js.native
  trait BIP32Interface
    extends StObject
       with Signer {
    
    var chainCode: Buffer = js.native
    
    var depth: Double = js.native
    
    def derive(index: Double): BIP32Interface = js.native
    
    def deriveHardened(index: Double): BIP32Interface = js.native
    
    def derivePath(path: String): BIP32Interface = js.native
    
    var fingerprint: Buffer = js.native
    
    var identifier: Buffer = js.native
    
    var index: Double = js.native
    
    def isNeutered(): Boolean = js.native
    
    var network: Network = js.native
    
    def neutered(): BIP32Interface = js.native
    
    var parentFingerprint: Double = js.native
    
    var privateKey: js.UndefOr[Buffer] = js.native
    
    def toBase58(): String = js.native
    
    def toWIF(): String = js.native
    
    def tweak(t: Buffer): Signer = js.native
  }
  
  trait Network extends StObject {
    
    var bech32: js.UndefOr[String] = js.undefined
    
    var bip32: Private
    
    var messagePrefix: js.UndefOr[String] = js.undefined
    
    var pubKeyHash: js.UndefOr[Double] = js.undefined
    
    var scriptHash: js.UndefOr[Double] = js.undefined
    
    var wif: Double
  }
  object Network {
    
    inline def apply(bip32: Private, wif: Double): Network = {
      val __obj = js.Dynamic.literal(bip32 = bip32.asInstanceOf[js.Any], wif = wif.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    extension [Self <: Network](x: Self) {
      
      inline def setBech32(value: String): Self = StObject.set(x, "bech32", value.asInstanceOf[js.Any])
      
      inline def setBech32Undefined: Self = StObject.set(x, "bech32", js.undefined)
      
      inline def setBip32(value: Private): Self = StObject.set(x, "bip32", value.asInstanceOf[js.Any])
      
      inline def setMessagePrefix(value: String): Self = StObject.set(x, "messagePrefix", value.asInstanceOf[js.Any])
      
      inline def setMessagePrefixUndefined: Self = StObject.set(x, "messagePrefix", js.undefined)
      
      inline def setPubKeyHash(value: Double): Self = StObject.set(x, "pubKeyHash", value.asInstanceOf[js.Any])
      
      inline def setPubKeyHashUndefined: Self = StObject.set(x, "pubKeyHash", js.undefined)
      
      inline def setScriptHash(value: Double): Self = StObject.set(x, "scriptHash", value.asInstanceOf[js.Any])
      
      inline def setScriptHashUndefined: Self = StObject.set(x, "scriptHash", js.undefined)
      
      inline def setWif(value: Double): Self = StObject.set(x, "wif", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Signer extends StObject {
    
    var lowR: Boolean = js.native
    
    var publicKey: Buffer = js.native
    
    def sign(hash: Buffer): Buffer = js.native
    def sign(hash: Buffer, lowR: Boolean): Buffer = js.native
    
    def signSchnorr(hash: Buffer): Buffer = js.native
    
    def verify(hash: Buffer, signature: Buffer): Boolean = js.native
    
    def verifySchnorr(hash: Buffer, signature: Buffer): Boolean = js.native
  }
  
  @js.native
  trait TinySecp256k1Interface extends StObject {
    
    def isPoint(p: js.typedarray.Uint8Array): Boolean = js.native
    
    def isPrivate(d: js.typedarray.Uint8Array): Boolean = js.native
    
    def pointAddScalar(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    def pointAddScalar(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array | Null = js.native
    
    def pointFromScalar(d: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    def pointFromScalar(d: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array | Null = js.native
    
    def privateAdd(d: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
    
    def privateNegate(d: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    def sign(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def sign(h: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array, e: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    
    var signSchnorr: js.UndefOr[
        js.Function3[
          /* h */ js.typedarray.Uint8Array, 
          /* d */ js.typedarray.Uint8Array, 
          /* e */ js.UndefOr[js.typedarray.Uint8Array], 
          js.typedarray.Uint8Array
        ]
      ] = js.native
    
    def verify(h: js.typedarray.Uint8Array, Q: js.typedarray.Uint8Array, signature: js.typedarray.Uint8Array): Boolean = js.native
    def verify(
      h: js.typedarray.Uint8Array,
      Q: js.typedarray.Uint8Array,
      signature: js.typedarray.Uint8Array,
      strict: Boolean
    ): Boolean = js.native
    
    var verifySchnorr: js.UndefOr[
        js.Function3[
          /* h */ js.typedarray.Uint8Array, 
          /* Q */ js.typedarray.Uint8Array, 
          /* signature */ js.typedarray.Uint8Array, 
          Boolean
        ]
      ] = js.native
    
    def xOnlyPointAddTweak(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): XOnlyPointAddTweakResult | Null = js.native
  }
  
  trait XOnlyPointAddTweakResult extends StObject {
    
    var parity: `1` | `0`
    
    var xOnlyPubkey: js.typedarray.Uint8Array
  }
  object XOnlyPointAddTweakResult {
    
    inline def apply(parity: `1` | `0`, xOnlyPubkey: js.typedarray.Uint8Array): XOnlyPointAddTweakResult = {
      val __obj = js.Dynamic.literal(parity = parity.asInstanceOf[js.Any], xOnlyPubkey = xOnlyPubkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[XOnlyPointAddTweakResult]
    }
    
    extension [Self <: XOnlyPointAddTweakResult](x: Self) {
      
      inline def setParity(value: `1` | `0`): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setXOnlyPubkey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "xOnlyPubkey", value.asInstanceOf[js.Any])
    }
  }
}
