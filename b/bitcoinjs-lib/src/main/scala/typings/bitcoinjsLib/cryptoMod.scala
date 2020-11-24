package typings.bitcoinjsLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  
  def hash160(buffer: Buffer): Buffer = js.native
  
  def hash256(buffer: Buffer): Buffer = js.native
  
  def ripemd160(buffer: Buffer): Buffer = js.native
  
  def sha1(buffer: Buffer): Buffer = js.native
  
  def sha256(buffer: Buffer): Buffer = js.native
}
