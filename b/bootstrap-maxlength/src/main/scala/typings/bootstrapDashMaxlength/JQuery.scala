package typings.bootstrapDashMaxlength

import typings.bootstrapDashMaxlength.BootstrapMaxlength.Options
import typings.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDOThidden
import typings.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDOTreposition
import typings.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDOTshown
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /** Apply the maxlength plugin on the selected elemens */
  def maxlength(): JQuery = js.native
  def maxlength(options: Options): JQuery = js.native
  @JSName("on")
  def on_maxlengthhidden(
    events: maxlengthDOThidden,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: maxlengthDOTshown,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDOTreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDOTreposition, extraParameters: js.Array[_]): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDOTreposition, extraParameters: js.Object): JQuery = js.native
}

