package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Mnemonic")
@js.native
open class Mnemonic protected () extends StObject {
  def this(args: Any*) = this()
  
  def toHDPrivateKey(passphrase: Any, network: Any): Any = js.native
  
  def toSeed(): Buffer = js.native
  def toSeed(passphrase: String): Buffer = js.native
}
