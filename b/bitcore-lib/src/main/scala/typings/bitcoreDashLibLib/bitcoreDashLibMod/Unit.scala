package typings
package bitcoreDashLibLib.bitcoreDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcore-lib", "Unit")
@js.native
class Unit protected () extends js.Object {
  def this(amount: scala.Double, unitPreference: java.lang.String) = this()
  def toBTC(): scala.Double = js.native
  def toBits(): scala.Double = js.native
  def toMilis(): scala.Double = js.native
  def toSatoshis(): scala.Double = js.native
}

/* static members */
@JSImport("bitcore-lib", "Unit")
@js.native
object Unit extends js.Object {
  def fromBTC(amount: scala.Double): bitcoreDashLibLib.bitcoreDashLibMod.Unit = js.native
  def fromBits(amount: scala.Double): bitcoreDashLibLib.bitcoreDashLibMod.Unit = js.native
  def fromMilis(amount: scala.Double): bitcoreDashLibLib.bitcoreDashLibMod.Unit = js.native
  def fromSatoshis(amount: scala.Double): bitcoreDashLibLib.bitcoreDashLibMod.Unit = js.native
}

