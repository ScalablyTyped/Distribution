package typings
package datatablesDotNetDashFixedcolumnsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedColumnsSettings extends js.Object {
  /*
    * Row height matching algorithm to use
    *
    * The algorithm to use. This can be one of (see below for full description):
    * 'none' | 'semiauto' | 'auto'
    */
  var heightMatch: js.UndefOr[java.lang.String] = js.undefined
  /*
    * The number of columns on the left hand side of the table to fix in place.
    */
  var leftColumns: js.UndefOr[scala.Double] = js.undefined
  /*
    * The number of columns on the right hand side of the table to fix in place.
    */
  var rightColumns: js.UndefOr[scala.Double] = js.undefined
}

object FixedColumnsSettings {
  @scala.inline
  def apply(
    heightMatch: java.lang.String = null,
    leftColumns: scala.Int | scala.Double = null,
    rightColumns: scala.Int | scala.Double = null
  ): FixedColumnsSettings = {
    val __obj = js.Dynamic.literal()
    if (heightMatch != null) __obj.updateDynamic("heightMatch")(heightMatch)
    if (leftColumns != null) __obj.updateDynamic("leftColumns")(leftColumns.asInstanceOf[js.Any])
    if (rightColumns != null) __obj.updateDynamic("rightColumns")(rightColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedColumnsSettings]
  }
}

