package typings.datatablesDotNetDashSelect.DataTablesNs

import typings.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.`multi+shift`
import typings.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.api
import typings.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.multi
import typings.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.os
import typings.datatablesDotNetDashSelect.datatablesDotNetDashSelectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSettings extends js.Object {
  /*
    * Indicate if the selected items will be removed when clicking outside of the table
    */
  var blurable: js.UndefOr[Boolean] = js.undefined
  /*
    * Set the class name that will be applied to selected items
    */
  var className: js.UndefOr[String] = js.undefined
  /*
    * Enable / disable the display for item selection information in the table summary
    */
  var info: js.UndefOr[Boolean] = js.undefined
  /*
    * Set which table items to select (rows, columns or cells)
    */
  var items: js.UndefOr[String] = js.undefined
  /*
    * Set the element selector used for mouse event capture to select items
    */
  var selector: js.UndefOr[String] = js.undefined
  /*
    * Set the selection style for end user interaction with the table
    */
  var style: js.UndefOr[api | single | multi | os | `multi+shift`] = js.undefined
}

object SelectSettings {
  @scala.inline
  def apply(
    blurable: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    info: js.UndefOr[Boolean] = js.undefined,
    items: String = null,
    selector: String = null,
    style: api | single | multi | os | `multi+shift` = null
  ): SelectSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blurable)) __obj.updateDynamic("blurable")(blurable)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info)
    if (items != null) __obj.updateDynamic("items")(items)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectSettings]
  }
}

