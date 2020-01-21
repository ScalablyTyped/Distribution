package typings.awsSdk.dynamodbMod

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
  def apply(ReadCapacityUnits: Int | scala.Double = null): ProvisionedThroughputOverride = {
    val __obj = js.Dynamic.literal()
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputOverride]
  }
}

