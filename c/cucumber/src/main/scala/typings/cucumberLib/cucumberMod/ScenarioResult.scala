package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioResult extends js.Object {
  var duration: scala.Double
  var status: Status
}

object ScenarioResult {
  @scala.inline
  def apply(duration: scala.Double, status: Status): ScenarioResult = {
    val __obj = js.Dynamic.literal(duration = duration, status = status)
  
    __obj.asInstanceOf[ScenarioResult]
  }
}

