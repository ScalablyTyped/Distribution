package typings.axeDashWebdriverjs.axeDashWebdriverjsMod

import typings.axeDashCore.axeDashCoreMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeAnalysis extends js.Object {
  var inapplicable: js.Array[Result]
  var incomplete: js.Array[Result]
  var passes: js.Array[Result]
  var timestamp: String
  var url: String
  var violations: js.Array[Result]
}

object AxeAnalysis {
  @scala.inline
  def apply(
    inapplicable: js.Array[Result],
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    timestamp: String,
    url: String,
    violations: js.Array[Result]
  ): AxeAnalysis = {
    val __obj = js.Dynamic.literal(inapplicable = inapplicable, incomplete = incomplete, passes = passes, timestamp = timestamp, url = url, violations = violations)
  
    __obj.asInstanceOf[AxeAnalysis]
  }
}

