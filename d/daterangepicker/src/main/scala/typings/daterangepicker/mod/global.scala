package typings.daterangepicker.mod

import typings.daterangepicker.anon.DefaultOptions
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery extends js.Object {
    
    @JSName("data")
    def data_daterangepicker(key: typings.daterangepicker.daterangepickerStrings.daterangepicker): js.UndefOr[daterangepicker] = js.native
    
    def daterangepicker(): this.type = js.native
    def daterangepicker(options: js.UndefOr[scala.Nothing], callback: DataRangePickerCallback): this.type = js.native
    def daterangepicker(options: Options): this.type = js.native
    def daterangepicker(options: Options, callback: DataRangePickerCallback): this.type = js.native
    @JSName("daterangepicker")
    var daterangepicker_Original: (js.Function2[
        /* options */ js.UndefOr[Options], 
        /* callback */ js.UndefOr[DataRangePickerCallback], 
        this.type
      ]) with DefaultOptions = js.native
    
    def on(
      events: DatepickerEvents,
      handler: js.Function2[/* event */ Event, /* picker */ DateRangePicker_, Unit]
    ): JQuery = js.native
  }
}
