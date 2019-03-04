package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookScenarioResult extends js.Object {
  var pickle: cucumberLib.cucumberMod.pickleNs.Pickle
  var result: ScenarioResult
  var sourceLocation: SourceLocation
}

object HookScenarioResult {
  @scala.inline
  def apply(
    pickle: cucumberLib.cucumberMod.pickleNs.Pickle,
    result: ScenarioResult,
    sourceLocation: SourceLocation
  ): HookScenarioResult = {
    val __obj = js.Dynamic.literal(pickle = pickle, result = result, sourceLocation = sourceLocation)
  
    __obj.asInstanceOf[HookScenarioResult]
  }
}

