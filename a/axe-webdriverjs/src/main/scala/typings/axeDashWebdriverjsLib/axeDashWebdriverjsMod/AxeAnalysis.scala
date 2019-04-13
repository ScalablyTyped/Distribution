package typings
package axeDashWebdriverjsLib.axeDashWebdriverjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeAnalysis extends js.Object {
  var inapplicable: js.Array[axeDashCoreLib.axeDashCoreMod.Result]
  var incomplete: js.Array[axeDashCoreLib.axeDashCoreMod.Result]
  var passes: js.Array[axeDashCoreLib.axeDashCoreMod.Result]
  var timestamp: java.lang.String
  var url: java.lang.String
  var violations: js.Array[axeDashCoreLib.axeDashCoreMod.Result]
}

object AxeAnalysis {
  @scala.inline
  def apply(
    inapplicable: js.Array[axeDashCoreLib.axeDashCoreMod.Result],
    incomplete: js.Array[axeDashCoreLib.axeDashCoreMod.Result],
    passes: js.Array[axeDashCoreLib.axeDashCoreMod.Result],
    timestamp: java.lang.String,
    url: java.lang.String,
    violations: js.Array[axeDashCoreLib.axeDashCoreMod.Result]
  ): AxeAnalysis = {
    val __obj = js.Dynamic.literal(inapplicable = inapplicable, incomplete = incomplete, passes = passes, timestamp = timestamp, url = url, violations = violations)
  
    __obj.asInstanceOf[AxeAnalysis]
  }
}

