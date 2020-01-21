package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "PrettyFormatter")
@js.native
class PrettyFormatter () extends SummaryFormatter {
  def formatTags(tags: js.Array[Tag]): js.Any = js.native
  def logIndented(text: String, level: Double): Unit = js.native
  def logStepResult(stepResult: js.Any): Unit = js.native
}

