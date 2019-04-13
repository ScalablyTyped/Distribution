package typings
package chartmogulDashNodeLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary extends js.Object {
  var current: scala.Double
  var `percentage-change`: scala.Double
  var previous: scala.Double
}

object Summary {
  @scala.inline
  def apply(current: scala.Double, `percentage-change`: scala.Double, previous: scala.Double): Summary = {
    val __obj = js.Dynamic.literal(current = current, previous = previous)
    __obj.updateDynamic("percentage-change")(`percentage-change`)
    __obj.asInstanceOf[Summary]
  }
}

