package typings
package axeDashWebdriverjsLib.axeDashWebdriverjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeAnalysis extends js.Object {
  var inapplicable: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
  var incomplete: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
  var passes: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
  var timestamp: java.lang.String
  var url: java.lang.String
  var violations: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
}

object AxeAnalysis {
  @scala.inline
  def apply(
    inapplicable: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result],
    incomplete: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result],
    passes: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result],
    timestamp: java.lang.String,
    url: java.lang.String,
    violations: js.Array[axeDashCoreLib.axeDashCoreMod.axeNs.Result]
  ): AxeAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inapplicable")(inapplicable)
    __obj.updateDynamic("incomplete")(incomplete)
    __obj.updateDynamic("passes")(passes)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("violations")(violations)
    __obj.asInstanceOf[AxeAnalysis]
  }
}

