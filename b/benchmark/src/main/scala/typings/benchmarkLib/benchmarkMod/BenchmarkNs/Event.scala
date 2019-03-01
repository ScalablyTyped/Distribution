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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aborted")(aborted)
    __obj.updateDynamic("cancelled")(cancelled)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[Event]
  }
}

