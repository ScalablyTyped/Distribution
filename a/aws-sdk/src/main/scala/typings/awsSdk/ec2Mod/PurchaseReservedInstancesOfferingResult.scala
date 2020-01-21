package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedInstancesOfferingResult extends js.Object {
  /**
    * The IDs of the purchased Reserved Instances.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object PurchaseReservedInstancesOfferingResult {
  @scala.inline
  def apply(ReservedInstancesId: String = null): PurchaseReservedInstancesOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingResult]
  }
}

