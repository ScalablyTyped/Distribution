package typings.bitcoreLibCash.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcore-lib-cash", "Message")
@js.native
class Message protected () extends js.Object {
  def this(message: String) = this()
  
  def fromJSON(json: String): Message = js.native
  
  def fromString(str: String): Message = js.native
  
  def inspect(): String = js.native
  
  def magicHash(): Buffer = js.native
  
  def sign(privateKey: PrivateKey): String = js.native
  
  def toJSON(): String = js.native
  
  def toObject(): typings.bitcoreLibCash.anon.Message = js.native
  
  def verify(bitcoinAddress: String, signatureString: String): Boolean = js.native
  def verify(bitcoinAddress: Address, signatureString: String): Boolean = js.native
}
