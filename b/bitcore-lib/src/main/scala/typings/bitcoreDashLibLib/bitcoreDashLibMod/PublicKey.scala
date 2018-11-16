package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "PublicKey")
@js.native
class PublicKey protected () extends js.Object {
  def this(source: java.lang.String) = this()
  def toBuffer(): nodeLib.Buffer = js.native
  def toDER(): nodeLib.Buffer = js.native
}

@JSImport("bitcore-lib", "PublicKey")
@js.native
object PublicKey extends js.Object {
  def fromPrivateKey(privateKey: bitcoreDashLibLib.bitcoreDashLibMod.PrivateKey): bitcoreDashLibLib.bitcoreDashLibMod.PublicKey = js.native
}

