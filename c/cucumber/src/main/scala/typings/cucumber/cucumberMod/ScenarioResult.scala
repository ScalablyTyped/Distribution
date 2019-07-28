package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioResult extends js.Object {
  var duration: Double
  var status: Status
}

object ScenarioResult {
  @scala.inline
  def apply(duration: Double, status: Status): ScenarioResult = {
    val __obj = js.Dynamic.literal(duration = duration, status = status)
  
    __obj.asInstanceOf[ScenarioResult]
  }
}

