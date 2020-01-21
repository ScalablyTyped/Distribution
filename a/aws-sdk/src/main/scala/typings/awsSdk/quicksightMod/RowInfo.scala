package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowInfo extends js.Object {
  /**
    * The number of rows that were not ingested.
    */
  var RowsDropped: js.UndefOr[long] = js.native
  /**
    * The number of rows that were ingested.
    */
  var RowsIngested: js.UndefOr[long] = js.native
}

object RowInfo {
  @scala.inline
  def apply(RowsDropped: Int | scala.Double = null, RowsIngested: Int | scala.Double = null): RowInfo = {
    val __obj = js.Dynamic.literal()
    if (RowsDropped != null) __obj.updateDynamic("RowsDropped")(RowsDropped.asInstanceOf[js.Any])
    if (RowsIngested != null) __obj.updateDynamic("RowsIngested")(RowsIngested.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowInfo]
  }
}

