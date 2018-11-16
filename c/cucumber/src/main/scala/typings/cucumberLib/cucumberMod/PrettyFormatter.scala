package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "PrettyFormatter")
@js.native
class PrettyFormatter () extends SummaryFormatter {
  def formatTags(tags: js.Array[Tag]): js.Any = js.native
  def logIndented(text: java.lang.String, level: scala.Double): scala.Unit = js.native
  def logStepResult(stepResult: js.Any): scala.Unit = js.native
}

