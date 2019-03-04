package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var aborted: scala.Boolean
  var cancelled: scala.Boolean
  var currentTarget: js.Object
  var result: js.Any
  var target: js.Object
  var timeStamp: scala.Double
  var `type`: java.lang.String
}

object Event {
  @scala.inline
  def apply(
    aborted: scala.Boolean,
    cancelled: scala.Boolean,
    currentTarget: js.Object,
    result: js.Any,
    target: js.Object,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): Event = {
    val __obj = js.Dynamic.literal(aborted = aborted, cancelled = cancelled, currentTarget = currentTarget, result = result, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

