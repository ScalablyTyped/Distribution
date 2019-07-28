package typings.chartmogulDashNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary extends js.Object {
  var current: Double
  var `percentage-change`: Double
  var previous: Double
}

object Summary {
  @scala.inline
  def apply(current: Double, `percentage-change`: Double, previous: Double): Summary = {
    val __obj = js.Dynamic.literal(current = current, previous = previous)
    __obj.updateDynamic("percentage-change")(`percentage-change`)
    __obj.asInstanceOf[Summary]
  }
}

