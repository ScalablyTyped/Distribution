package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.Networks.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "PrivateKey")
@js.native
class PrivateKey () extends js.Object {
  def this(key: String) = this()
  def this(key: js.UndefOr[scala.Nothing], network: Network) = this()
  def this(key: String, network: Network) = this()
  
  val network: Network = js.native
  
  val publicKey: PublicKey = js.native
  
  def toAddress(): Address = js.native
  
  def toJSON(): js.Object = js.native
  
  def toObject(): js.Object = js.native
  
  def toPublicKey(): PublicKey = js.native
  
  def toWIF(): String = js.native
}
