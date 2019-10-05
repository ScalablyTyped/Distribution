package typings.daterangepicker.daterangepickerMod

import typings.daterangepicker.Anon_DefaultOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    @JSName("daterangepicker")
    var daterangepicker_Original: (js.Function2[
        /* options */ js.UndefOr[Options], 
        /* callback */ js.UndefOr[DataRangePickerCallback], 
        this.type
      ]) with Anon_DefaultOptions = js.native
    @JSName("data")
    def data_daterangepicker(key: typings.daterangepicker.daterangepickerStrings.daterangepicker): js.UndefOr[typings.daterangepicker.daterangepickerMod.daterangepicker] = js.native
    def daterangepicker(): this.type = js.native
    def daterangepicker(options: Options): this.type = js.native
    def daterangepicker(options: Options, callback: DataRangePickerCallback): this.type = js.native
  }
  
}

