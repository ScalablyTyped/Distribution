package typings
package daterangepickerLib.daterangepickerMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("daterangepicker")
  var daterangepicker_Original: (js.Function2[
    /* options */ js.UndefOr[daterangepickerLib.daterangepickerMod.Options], 
    /* callback */ js.UndefOr[daterangepickerLib.daterangepickerMod.DataRangePickerCallback], 
    this.type
  ]) with daterangepickerLib.Anon_DefaultOptions = js.native
  @JSName("data")
  def data_daterangepicker(key: daterangepickerLib.daterangepickerLibStrings.daterangepicker): js.UndefOr[daterangepickerLib.daterangepickerMod.daterangepicker] = js.native
  def daterangepicker(): this.type = js.native
  def daterangepicker(options: daterangepickerLib.daterangepickerMod.Options): this.type = js.native
  def daterangepicker(
    options: daterangepickerLib.daterangepickerMod.Options,
    callback: daterangepickerLib.daterangepickerMod.DataRangePickerCallback
  ): this.type = js.native
}

