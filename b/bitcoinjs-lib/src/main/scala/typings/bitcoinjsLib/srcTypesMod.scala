package typings.bitcoinjsLib

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
}
