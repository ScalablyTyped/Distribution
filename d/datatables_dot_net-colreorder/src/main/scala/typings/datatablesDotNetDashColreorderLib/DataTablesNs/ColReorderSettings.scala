package typings
package datatablesDotNetDashColreorderLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColReorderSettings extends js.Object {
  /*
    * Number of columns (counting from the left) to disallow reordering of, '0' in default
    */
  var fixedColumnsLeft: js.UndefOr[scala.Double] = js.undefined
  /*
    * Number of columns (counting from the right) to disallow reordering of, '0' in default
    */
  var fixedColumnsRight: js.UndefOr[scala.Double] = js.undefined
  /*
    * Set a default order for the columns in the table
    */
  var order: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /*
    * Enable / disable live reordering of columns during a drag, 'true' in default
    */
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Callback after reorder
    */
  def reorderCallback(): scala.Unit
}

object ColReorderSettings {
  @scala.inline
  def apply(
    reorderCallback: js.Function0[scala.Unit],
    fixedColumnsLeft: scala.Int | scala.Double = null,
    fixedColumnsRight: scala.Int | scala.Double = null,
    order: js.Array[scala.Double] = null,
    realtime: js.UndefOr[scala.Boolean] = js.undefined
  ): ColReorderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reorderCallback")(reorderCallback)
    if (fixedColumnsLeft != null) __obj.updateDynamic("fixedColumnsLeft")(fixedColumnsLeft.asInstanceOf[js.Any])
    if (fixedColumnsRight != null) __obj.updateDynamic("fixedColumnsRight")(fixedColumnsRight.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    __obj.asInstanceOf[ColReorderSettings]
  }
}

