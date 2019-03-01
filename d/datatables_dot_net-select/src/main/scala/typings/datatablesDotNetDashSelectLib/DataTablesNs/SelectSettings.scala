package typings
package datatablesDotNetDashSelectLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectSettings extends js.Object {
  /*
    * Indicate if the selected items will be removed when clicking outside of the table
    */
  var blurable: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Set the class name that will be applied to selected items
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Enable / disable the display for item selection information in the table summary
    */
  var info: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Set which table items to select (rows, columns or cells)
    */
  var items: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Set the element selector used for mouse event capture to select items
    */
  var selector: js.UndefOr[java.lang.String] = js.undefined
  /*
    * Set the selection style for end user interaction with the table
    */
  var style: js.UndefOr[
    datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.api | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.single | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.multi | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.os | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.`multi+shift`
  ] = js.undefined
}

object SelectSettings {
  @scala.inline
  def apply(
    blurable: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    info: js.UndefOr[scala.Boolean] = js.undefined,
    items: java.lang.String = null,
    selector: java.lang.String = null,
    style: datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.api | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.single | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.multi | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.os | datatablesDotNetDashSelectLib.datatablesDotNetDashSelectLibStrings.`multi+shift` = null
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

