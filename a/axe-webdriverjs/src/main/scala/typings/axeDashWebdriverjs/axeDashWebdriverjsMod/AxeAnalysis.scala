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
    val __obj = js.Dynamic.literal(inapplicable = inapplicable.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AxeAnalysis]
  }
}

