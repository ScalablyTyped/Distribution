package typings.bitcoinjsLib

import typings.bitcoinjsLib.bitcoinjsLibInts.`0`
import typings.bitcoinjsLib.bitcoinjsLibInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  @JSImport("bitcoinjs-lib/src/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Array")
  @js.native
  val Array: Any = js.native
  
  object BIP32Path {
    
    inline def apply(value: java.lang.String): scala.Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
    
    @JSImport("bitcoinjs-lib/src/types", "BIP32Path")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/src/types", "BIP32Path.toJSON")
    @js.native
    def toJSON: js.Function0[java.lang.String] = js.native
    inline def toJSON_=(x: js.Function0[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bitcoinjs-lib/src/types", "Boolean")
  @js.native
  val Boolean: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Buffer")
  @js.native
  val Buffer: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Buffer256bit")
  @js.native
  val Buffer256bit: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "BufferN")
  @js.native
  val BufferN: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "ECPoint")
  @js.native
  val ECPoint: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Function")
  @js.native
  val Function: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Hash160bit")
  @js.native
  val Hash160bit: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Hash256bit")
  @js.native
  val Hash256bit: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Hex")
  @js.native
  val Hex: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Network")
  @js.native
  val Network: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Null")
  @js.native
  val Null: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "Number")
  @js.native
  val Number: Any = js.native
  
  inline def Satoshi(value: Double): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Satoshi")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def Signer(obj: Any): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Signer")(obj.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @JSImport("bitcoinjs-lib/src/types", "String")
  @js.native
  val String: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "TAPLEAF_VERSION_MASK")
  @js.native
  val TAPLEAF_VERSION_MASK: /* 254 */ Double = js.native
  
  inline def UInt31(value: Double): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UInt31")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @JSImport("bitcoinjs-lib/src/types", "UInt32")
  @js.native
  val UInt32: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "UInt8")
  @js.native
  val UInt8: Any = js.native
  
  inline def isPoint(): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")().asInstanceOf[scala.Boolean]
  inline def isPoint(p: Double): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(p.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  inline def isPoint(p: typings.node.bufferMod.global.Buffer): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(p.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def isTapleaf(o: Any): /* is bitcoinjs-lib.bitcoinjs-lib/src/types.Tapleaf */ scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTapleaf")(o.asInstanceOf[js.Any]).asInstanceOf[/* is bitcoinjs-lib.bitcoinjs-lib/src/types.Tapleaf */ scala.Boolean]
  
  inline def isTaptree(scriptTree: Any): /* is bitcoinjs-lib.bitcoinjs-lib/src/types.Taptree */ scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaptree")(scriptTree.asInstanceOf[js.Any]).asInstanceOf[/* is bitcoinjs-lib.bitcoinjs-lib/src/types.Taptree */ scala.Boolean]
  
  @JSImport("bitcoinjs-lib/src/types", "maybe")
  @js.native
  val maybe: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "oneOf")
  @js.native
  val oneOf: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "tuple")
  @js.native
  val tuple: Any = js.native
  
  @JSImport("bitcoinjs-lib/src/types", "typeforce")
  @js.native
  val typeforce: Any = js.native
  
  trait Tapleaf extends StObject {
    
    var output: typings.node.bufferMod.global.Buffer
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Tapleaf {
    
    inline def apply(output: typings.node.bufferMod.global.Buffer): Tapleaf = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tapleaf]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tapleaf] (val x: Self) extends AnyVal {
      
      inline def setOutput(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Taptree = [bitcoinjs-lib.bitcoinjs-lib/src/types.Taptree | bitcoinjs-lib.bitcoinjs-lib/src/types.Tapleaf, bitcoinjs-lib.bitcoinjs-lib/src/types.Taptree | bitcoinjs-lib.bitcoinjs-lib/src/types.Tapleaf] | bitcoinjs-lib.bitcoinjs-lib/src/types.Tapleaf
  }}}
  to avoid circular code involving: 
  - bitcoinjs-lib.bitcoinjs-lib/src/types.Taptree
  */
  type Taptree = (js.Tuple2[Any | Tapleaf, Any | Tapleaf]) | Tapleaf
  
  trait TinySecp256k1Interface extends StObject {
    
    def isXOnlyPoint(p: js.typedarray.Uint8Array): scala.Boolean
    
    def privateAdd(d: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array | scala.Null
    
    def privateNegate(d: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    def xOnlyPointAddTweak(p: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): XOnlyPointAddTweakResult | scala.Null
  }
  object TinySecp256k1Interface {
    
    inline def apply(
      isXOnlyPoint: js.typedarray.Uint8Array => scala.Boolean,
      privateAdd: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | scala.Null,
      privateNegate: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      xOnlyPointAddTweak: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => XOnlyPointAddTweakResult | scala.Null
    ): TinySecp256k1Interface = {
      val __obj = js.Dynamic.literal(isXOnlyPoint = js.Any.fromFunction1(isXOnlyPoint), privateAdd = js.Any.fromFunction2(privateAdd), privateNegate = js.Any.fromFunction1(privateNegate), xOnlyPointAddTweak = js.Any.fromFunction2(xOnlyPointAddTweak))
      __obj.asInstanceOf[TinySecp256k1Interface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TinySecp256k1Interface] (val x: Self) extends AnyVal {
      
      inline def setIsXOnlyPoint(value: js.typedarray.Uint8Array => scala.Boolean): Self = StObject.set(x, "isXOnlyPoint", js.Any.fromFunction1(value))
      
      inline def setPrivateAdd(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.typedarray.Uint8Array | scala.Null
      ): Self = StObject.set(x, "privateAdd", js.Any.fromFunction2(value))
      
      inline def setPrivateNegate(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "privateNegate", js.Any.fromFunction1(value))
      
      inline def setXOnlyPointAddTweak(
        value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => XOnlyPointAddTweakResult | scala.Null
      ): Self = StObject.set(x, "xOnlyPointAddTweak", js.Any.fromFunction2(value))
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XOnlyPointAddTweakResult] (val x: Self) extends AnyVal {
      
      inline def setParity(value: `1` | `0`): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setXOnlyPubkey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "xOnlyPubkey", value.asInstanceOf[js.Any])
    }
  }
}
