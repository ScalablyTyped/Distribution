package typings.datatablesNetAutofill.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFillSettings extends js.Object {
  /*
    * Always ask the end user if an action should be taken or not
    */
  var alwaysAsk: js.UndefOr[Boolean] = js.native
  /*
    * Select the columns that can be auto filled
    */
  var columns: String | js.Array[Double] = js.native
  /*
    *
    * Initial enablement state of AutoFill
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object AutoFillSettings {
  @scala.inline
  def apply(columns: String | js.Array[Double]): AutoFillSettings = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillSettings]
  }
  @scala.inline
  implicit class AutoFillSettingsOps[Self <: AutoFillSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnsVarargs(value: Double*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: String | js.Array[Double]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysAsk(value: Boolean): Self = this.set("alwaysAsk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysAsk: Self = this.set("alwaysAsk", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
  }
  
}

