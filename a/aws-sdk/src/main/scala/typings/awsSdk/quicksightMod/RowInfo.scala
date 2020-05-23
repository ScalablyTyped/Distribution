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
  def apply(RowsDropped: js.UndefOr[long] = js.undefined, RowsIngested: js.UndefOr[long] = js.undefined): RowInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RowsDropped)) __obj.updateDynamic("RowsDropped")(RowsDropped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RowsIngested)) __obj.updateDynamic("RowsIngested")(RowsIngested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowInfo]
  }
}

