package typings.bitcoinjsLib

import typings.bitcoinjsLib.anon.R
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bip66Mod {
  
  @JSImport("bitcoinjs-lib/src/bip66", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def decode(buffer: Buffer): R = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[R]
  
  inline def encode(r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
