package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeterUsageResult extends js.Object {
  /**
    * Metering record id.
    */
  var MeteringRecordId: js.UndefOr[String] = js.native
}

object MeterUsageResult {
  @scala.inline
  def apply(MeteringRecordId: String = null): MeterUsageResult = {
    val __obj = js.Dynamic.literal()
    if (MeteringRecordId != null) __obj.updateDynamic("MeteringRecordId")(MeteringRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterUsageResult]
  }
}

