package typings
package beatsLib.beatsMod.beatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bin extends js.Object {
  var decay: scala.Double
  var hi: scala.Double
  var lo: scala.Double
  var threshold: scala.Double
}

object Bin {
  @scala.inline
  def apply(decay: scala.Double, hi: scala.Double, lo: scala.Double, threshold: scala.Double): Bin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decay")(decay)
    __obj.updateDynamic("hi")(hi)
    __obj.updateDynamic("lo")(lo)
    __obj.updateDynamic("threshold")(threshold)
    __obj.asInstanceOf[Bin]
  }
}

