package typings.cucumber.cucumberMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioResult extends js.Object {
  var duration: Double
  var exception: js.UndefOr[Error] = js.undefined
  var status: Status
}

object ScenarioResult {
  @scala.inline
  def apply(duration: Double, status: Status, exception: Error = null): ScenarioResult = {
    val __obj = js.Dynamic.literal(duration = duration, status = status)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    __obj.asInstanceOf[ScenarioResult]
  }
}

