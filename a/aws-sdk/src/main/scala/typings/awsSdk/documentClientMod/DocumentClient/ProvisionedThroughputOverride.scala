package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedThroughputOverride extends js.Object {
  /**
    * Replica-specific read capacity units. If not specified, uses the source table's read capacity settings.
    */
  var ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ProvisionedThroughputOverride {
  @scala.inline
  def apply(ReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined): ProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReadCapacityUnits)) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputOverride]
  }
}

