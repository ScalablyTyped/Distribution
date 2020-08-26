package typings.datatablesNetRowreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowReorderSettings extends js.Object {
  /**
    * Configure the data point that will be used for the reordering data
    */
  var dataSrc: js.UndefOr[String] = js.native
  /**
    * Attach an Editor instance for database updating
    */
  var editor: js.UndefOr[js.Any] = js.native
  /**
    * Enable / disable RowReorder's user interaction
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Set the options for the Editor form when submitting data
    */
  var formOptions: js.UndefOr[js.Any] = js.native
  /**
    * Define the selector used to pick the elements that will start a drag
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * Horizontal position control of the row being dragged
    */
  var snapX: js.UndefOr[Double | Boolean] = js.native
  /**
    * Control automatic of data when a row is dropped
    */
  var update: js.UndefOr[Boolean] = js.native
}

object RowReorderSettings {
  @scala.inline
  def apply(): RowReorderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowReorderSettings]
  }
  @scala.inline
  implicit class RowReorderSettingsOps[Self <: RowReorderSettings] (val x: Self) extends AnyVal {
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
    def setDataSrc(value: String): Self = this.set("dataSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSrc: Self = this.set("dataSrc", js.undefined)
    @scala.inline
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setFormOptions(value: js.Any): Self = this.set("formOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormOptions: Self = this.set("formOptions", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSnapX(value: Double | Boolean): Self = this.set("snapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapX: Self = this.set("snapX", js.undefined)
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

