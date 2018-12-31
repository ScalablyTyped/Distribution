package typings
package bootstrapDashMaxlengthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /** Apply the maxlength plugin on the selected elemens */
  def maxlength(): JQuery = js.native
  def maxlength(options: bootstrapDashMaxlengthLib.BootstrapMaxlengthNs.Options): JQuery = js.native
  @JSName("on")
  def on_maxlengthhidden(
    events: bootstrapDashMaxlengthLib.bootstrapDashMaxlengthLibStrings.maxlengthDOThidden,
    handler: js.Function2[/* eventObject */ jqueryLib.JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_maxlengthshown(
    events: bootstrapDashMaxlengthLib.bootstrapDashMaxlengthLibStrings.maxlengthDOTshown,
    handler: js.Function2[/* eventObject */ jqueryLib.JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(eventType: bootstrapDashMaxlengthLib.bootstrapDashMaxlengthLibStrings.maxlengthDOTreposition): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(
    eventType: bootstrapDashMaxlengthLib.bootstrapDashMaxlengthLibStrings.maxlengthDOTreposition,
    extraParameters: js.Array[_]
  ): JQuery = js.native
  @JSName("trigger")
  def trigger_maxlengthreposition(
    eventType: bootstrapDashMaxlengthLib.bootstrapDashMaxlengthLibStrings.maxlengthDOTreposition,
    extraParameters: js.Object
  ): JQuery = js.native
}

