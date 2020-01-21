package typings.bootstrapDatepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def datepicker(): JQuery = js.native
  def datepicker(methodName: String): js.Any = js.native
  def datepicker(methodName: String, params: js.Any): js.Any = js.native
  def datepicker(options: DatepickerOptions): JQuery = js.native
  def off(events: DatepickerEvents): JQuery = js.native
  def off(events: DatepickerEvents, handler: js.Function1[/* eventObject */ DatepickerEventObject, _]): JQuery = js.native
  def off(events: DatepickerEvents, selector: String): JQuery = js.native
  def off(
    events: DatepickerEvents,
    selector: String,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, _]
  ): JQuery = js.native
  def on(events: DatepickerEvents, handler: js.Function1[/* eventObject */ DatepickerEventObject, _]): JQuery = js.native
  def on(events: DatepickerEvents, selector: String, data: js.Any): JQuery = js.native
  def on(
    events: DatepickerEvents,
    selector: String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, _]
  ): JQuery = js.native
  def on(
    events: DatepickerEvents,
    selector: String,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, _]
  ): JQuery = js.native
}

