package typings.datatablesDotNetDashAutofill.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillSettings extends js.Object {
  /*
    * Always ask the end user if an action should be taken or not
    */
  var alwaysAsk: js.UndefOr[Boolean] = js.undefined
  /*
    * Select the columns that can be auto filled
    */
  var columns: String | js.Array[Double]
  /*
    *
    * Initial enablement state of AutoFill
    */
  var enable: js.UndefOr[Boolean] = js.undefined
}

object AutoFillSettings {
  @scala.inline
  def apply(
    columns: String | js.Array[Double],
    alwaysAsk: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Boolean] = js.undefined
  ): AutoFillSettings = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysAsk)) __obj.updateDynamic("alwaysAsk")(alwaysAsk)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    __obj.asInstanceOf[AutoFillSettings]
  }
}

