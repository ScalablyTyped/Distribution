package typings.bootstrapDashMaxlength

import typings.bootstrapDashMaxlength.BootstrapMaxlength.Options
import typings.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDothidden
import typings.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDotreposition
import typings.bootstrapDashMaxlength.bootstrapDashMaxlengthStrings.maxlengthDotshown
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
    events: maxlengthDothidden,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: maxlengthDotshown,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Array[_]): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: maxlengthDotreposition, extraParameters: js.Object): JQuery = js.native
}

