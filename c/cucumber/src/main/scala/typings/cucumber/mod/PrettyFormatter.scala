package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber", "PrettyFormatter")
@js.native
class PrettyFormatter () extends SummaryFormatter {
  def this(options: js.Any) = this()
  
  def formatTags(tags: js.Array[Tag]): js.Any = js.native
  
  def logIndented(text: String, level: Double): Unit = js.native
  
  def logStepResult(stepResult: js.Any): Unit = js.native
}
