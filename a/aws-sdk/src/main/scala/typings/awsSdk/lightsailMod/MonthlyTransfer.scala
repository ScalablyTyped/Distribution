package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthlyTransfer extends js.Object {
  /**
    * The amount allocated per month (in GB).
    */
  var gbPerMonthAllocated: js.UndefOr[integer] = js.native
}

object MonthlyTransfer {
  @scala.inline
  def apply(gbPerMonthAllocated: js.UndefOr[integer] = js.undefined): MonthlyTransfer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gbPerMonthAllocated)) __obj.updateDynamic("gbPerMonthAllocated")(gbPerMonthAllocated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthlyTransfer]
  }
}

