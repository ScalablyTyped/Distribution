package typings.bitcoinjsLib

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("bitcoinjs-lib/src/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def hash256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha1(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def taggedHash(prefix: TaggedHashPrefix, data: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("taggedHash")(prefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bitcoinjsLib.bitcoinjsLibStrings.BIP0340Slashchallenge
    - typings.bitcoinjsLib.bitcoinjsLibStrings.BIP0340Slashaux
    - typings.bitcoinjsLib.bitcoinjsLibStrings.BIP0340Slashnonce
    - typings.bitcoinjsLib.bitcoinjsLibStrings.TapLeaf
    - typings.bitcoinjsLib.bitcoinjsLibStrings.TapBranch
    - typings.bitcoinjsLib.bitcoinjsLibStrings.TapSighash
    - typings.bitcoinjsLib.bitcoinjsLibStrings.TapTweak
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`KeyAgg list`
    - typings.bitcoinjsLib.bitcoinjsLibStrings.`KeyAgg coefficient`
  */
  trait TaggedHashPrefix extends StObject
}
