package typings.bitcoinjsLib.ecpairMod

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECPairInterface extends Signer {
  
  var compressed: Boolean = js.native
  
  var lowR: Boolean = js.native
  
  @JSName("network")
  var network_ECPairInterface: Network = js.native
  
  var privateKey: js.UndefOr[Buffer] = js.native
  
  def toWIF(): String = js.native
  
  def verify(hash: Buffer, signature: Buffer): Boolean = js.native
}
