package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Block")
@js.native
class Block protected () extends js.Object {
  def this(data: js.Object) = this()
  def this(data: nodeLib.Buffer) = this()
  var hash: java.lang.String = js.native
  var header: bitcoreDashLibLib.Anon_PrevHash = js.native
  var height: scala.Double = js.native
  var transactions: js.Array[Transaction] = js.native
}

