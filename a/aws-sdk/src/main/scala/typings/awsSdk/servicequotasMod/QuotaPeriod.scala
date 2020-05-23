package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaPeriod extends js.Object {
  /**
    * The time unit of a period.
    */
  var PeriodUnit: js.UndefOr[typings.awsSdk.servicequotasMod.PeriodUnit] = js.native
  /**
    * The value of a period.
    */
  var PeriodValue: js.UndefOr[typings.awsSdk.servicequotasMod.PeriodValue] = js.native
}

object QuotaPeriod {
  @scala.inline
  def apply(PeriodUnit: PeriodUnit = null, PeriodValue: js.UndefOr[PeriodValue] = js.undefined): QuotaPeriod = {
    val __obj = js.Dynamic.literal()
    if (PeriodUnit != null) __obj.updateDynamic("PeriodUnit")(PeriodUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(PeriodValue)) __obj.updateDynamic("PeriodValue")(PeriodValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaPeriod]
  }
}

