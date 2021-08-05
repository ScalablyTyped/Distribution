package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("bitcoinjs-lib/types/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def hash256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha1(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
