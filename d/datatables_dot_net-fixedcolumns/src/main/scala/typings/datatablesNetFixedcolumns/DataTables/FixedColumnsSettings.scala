package typings.datatablesNetFixedcolumns.DataTables

import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.auto
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.none
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.semiauto
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
  var heightMatch: js.UndefOr[none | semiauto | auto] = js.undefined
  /*
    * The number of columns on the left hand side of the table to fix in place.
    */
  var leftColumns: js.UndefOr[Double] = js.undefined
  /*
    * The number of columns on the right hand side of the table to fix in place.
    */
  var rightColumns: js.UndefOr[Double] = js.undefined
}

object FixedColumnsSettings {
  @scala.inline
  def apply(
    heightMatch: none | semiauto | auto = null,
    leftColumns: js.UndefOr[Double] = js.undefined,
    rightColumns: js.UndefOr[Double] = js.undefined
  ): FixedColumnsSettings = {
    val __obj = js.Dynamic.literal()
    if (heightMatch != null) __obj.updateDynamic("heightMatch")(heightMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(leftColumns)) __obj.updateDynamic("leftColumns")(leftColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightColumns)) __obj.updateDynamic("rightColumns")(rightColumns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedColumnsSettings]
  }
}

