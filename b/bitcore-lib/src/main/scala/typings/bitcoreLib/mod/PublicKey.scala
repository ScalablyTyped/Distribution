package typings.bitcoreLib.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "PublicKey")
@js.native
class PublicKey protected () extends js.Object {
  def this(source: String) = this()
  def toBuffer(): Buffer = js.native
  def toDER(): Buffer = js.native
}

/* static members */
@JSImport("bitcore-lib", "PublicKey")
@js.native
object PublicKey extends js.Object {
  def fromPrivateKey(privateKey: PrivateKey): PublicKey = js.native
}

