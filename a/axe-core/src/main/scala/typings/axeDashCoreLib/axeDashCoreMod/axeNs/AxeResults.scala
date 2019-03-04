package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxeResults extends js.Object {
  var inapplicable: js.Array[Result]
  var incomplete: js.Array[Result]
  var passes: js.Array[Result]
  var timestamp: java.lang.String
  var url: java.lang.String
  var violations: js.Array[Result]
}

object AxeResults {
  @scala.inline
  def apply(
    inapplicable: js.Array[Result],
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    timestamp: java.lang.String,
    url: java.lang.String,
    violations: js.Array[Result]
  ): AxeResults = {
    val __obj = js.Dynamic.literal(inapplicable = inapplicable, incomplete = incomplete, passes = passes, timestamp = timestamp, url = url, violations = violations)
  
    __obj.asInstanceOf[AxeResults]
  }
}

