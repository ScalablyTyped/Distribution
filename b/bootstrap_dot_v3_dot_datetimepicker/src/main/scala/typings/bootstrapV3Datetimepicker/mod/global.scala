package typings.bootstrapV3Datetimepicker.mod

import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.DateTimePicker
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotchange
import typings.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.dpDotupdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    @JSName("datetimepicker")
    var datetimepicker_Original: Datetimepicker = js.native
    @JSName("data")
    def data_DateTimePicker(key: DateTimePicker): Datetimepicker = js.native
    /**
      * JQuery plugin function.
      */
    def datetimepicker(): JQuery = js.native
    def datetimepicker(options: DatetimepickerOptions): JQuery = js.native
    def off(events: EventName): JQuery = js.native
    def off(events: EventName, handler: js.Function1[/* eventobject */ Event, _]): JQuery = js.native
    def off(events: EventName, selector: String): JQuery = js.native
    def off(events: EventName, selector: String, handler: js.Function1[/* eventobject */ Event, _]): JQuery = js.native
    @JSName("off")
    def off_dpchange(events: dpDotchange): JQuery = js.native
    @JSName("off")
    def off_dpchange(events: dpDotchange, handler: js.Function1[/* eventobject */ ChangeEvent, _]): JQuery = js.native
    @JSName("off")
    def off_dpchange(events: dpDotchange, selector: String): JQuery = js.native
    @JSName("off")
    def off_dpchange(events: dpDotchange, selector: String, handler: js.Function1[/* eventobject */ ChangeEvent, _]): JQuery = js.native
    @JSName("off")
    def off_dpupdate(events: dpDotupdate): JQuery = js.native
    @JSName("off")
    def off_dpupdate(events: dpDotupdate, handler: js.Function1[/* eventobject */ UpdateEvent, _]): JQuery = js.native
    @JSName("off")
    def off_dpupdate(events: dpDotupdate, selector: String): JQuery = js.native
    @JSName("off")
    def off_dpupdate(events: dpDotupdate, selector: String, handler: js.Function1[/* eventobject */ UpdateEvent, _]): JQuery = js.native
    def on(events: EventName, handler: js.Function1[/* eventObject */ Event, _]): JQuery = js.native
    def on(events: EventName, selector: String, data: js.Any): JQuery = js.native
    def on(
      events: EventName,
      selector: String,
      data: js.Any,
      handler: js.Function1[/* eventobject */ Event, _]
    ): JQuery = js.native
    def on(events: EventName, selector: String, handler: js.Function1[/* eventobject */ Event, _]): JQuery = js.native
    @JSName("on")
    def on_dpchange(events: dpDotchange, handler: js.Function1[/* eventObject */ ChangeEvent, _]): JQuery = js.native
    @JSName("on")
    def on_dpchange(events: dpDotchange, selector: String, data: js.Any): JQuery = js.native
    @JSName("on")
    def on_dpchange(
      events: dpDotchange,
      selector: String,
      data: js.Any,
      handler: js.Function1[/* eventobject */ ChangeEvent, _]
    ): JQuery = js.native
    @JSName("on")
    def on_dpchange(events: dpDotchange, selector: String, handler: js.Function1[/* eventobject */ ChangeEvent, _]): JQuery = js.native
    @JSName("on")
    def on_dpupdate(events: dpDotupdate, handler: js.Function1[/* eventObject */ UpdateEvent, _]): JQuery = js.native
    @JSName("on")
    def on_dpupdate(events: dpDotupdate, selector: String, data: js.Any): JQuery = js.native
    @JSName("on")
    def on_dpupdate(
      events: dpDotupdate,
      selector: String,
      data: js.Any,
      handler: js.Function1[/* eventobject */ UpdateEvent, _]
    ): JQuery = js.native
    @JSName("on")
    def on_dpupdate(events: dpDotupdate, selector: String, handler: js.Function1[/* eventobject */ UpdateEvent, _]): JQuery = js.native
  }
  
}

