package typings.cucumber.cucumberMod

import typings.cucumber.cucumberMod.pickleNs.Pickle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookScenarioResult extends js.Object {
  var pickle: Pickle
  var result: ScenarioResult
  var sourceLocation: SourceLocation
}

object HookScenarioResult {
  @scala.inline
  def apply(pickle: Pickle, result: ScenarioResult, sourceLocation: SourceLocation): HookScenarioResult = {
    val __obj = js.Dynamic.literal(pickle = pickle, result = result, sourceLocation = sourceLocation)
  
    __obj.asInstanceOf[HookScenarioResult]
  }
}

