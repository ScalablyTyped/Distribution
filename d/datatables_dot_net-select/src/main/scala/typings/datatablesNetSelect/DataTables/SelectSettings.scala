package typings.datatablesNetSelect.DataTables

import typings.datatablesNetSelect.datatablesNetSelectStrings.api
import typings.datatablesNetSelect.datatablesNetSelectStrings.multi
import typings.datatablesNetSelect.datatablesNetSelectStrings.multiPlussignshift
import typings.datatablesNetSelect.datatablesNetSelectStrings.os
import typings.datatablesNetSelect.datatablesNetSelectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectSettings extends js.Object {
  /*
    * Indicate if the selected items will be removed when clicking outside of the table
    */
  var blurable: js.UndefOr[Boolean] = js.native
  /*
    * Set the class name that will be applied to selected items
    */
  var className: js.UndefOr[String] = js.native
  /*
    * Enable / disable the display for item selection information in the table summary
    */
  var info: js.UndefOr[Boolean] = js.native
  /*
    * Set which table items to select (rows, columns or cells)
    */
  var items: js.UndefOr[String] = js.native
  /*
    * Set the element selector used for mouse event capture to select items
    */
  var selector: js.UndefOr[String] = js.native
  /*
    * Set the selection style for end user interaction with the table
    */
  var style: js.UndefOr[api | single | multi | os | multiPlussignshift] = js.native
}

object SelectSettings {
  @scala.inline
  def apply(): SelectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectSettings]
  }
  @scala.inline
  implicit class SelectSettingsOps[Self <: SelectSettings] (val x: Self) extends AnyVal {
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
    def setBlurable(value: Boolean): Self = this.set("blurable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurable: Self = this.set("blurable", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setItems(value: String): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStyle(value: api | single | multi | os | multiPlussignshift): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

