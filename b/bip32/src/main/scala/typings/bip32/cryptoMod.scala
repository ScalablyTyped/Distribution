package typings.bip32

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("bip32/types/crypto", "hash160")
  @js.native
  def hash160(buffer: Buffer): Buffer = js.native
  
  @JSImport("bip32/types/crypto", "hmacSHA512")
  @js.native
  def hmacSHA512(key: Buffer, data: Buffer): Buffer = js.native
}
