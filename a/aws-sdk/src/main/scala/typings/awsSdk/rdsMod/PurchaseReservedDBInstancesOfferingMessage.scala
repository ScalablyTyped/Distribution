package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
  /**
    * The number of instances to reserve. Default: 1 
    */
  var DBInstanceCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * Customer-specified identifier to track this reservation. Example: myreservationID
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  /**
    * The ID of the Reserved DB instance offering to purchase. Example: 438012d3-4052-4cc7-b2e3-8d3372e0e706
    */
  var ReservedDBInstancesOfferingId: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
}

object PurchaseReservedDBInstancesOfferingMessage {
  @scala.inline
  def apply(
    ReservedDBInstancesOfferingId: String,
    DBInstanceCount: Int | scala.Double = null,
    ReservedDBInstanceId: String = null,
    Tags: TagList = null
  ): PurchaseReservedDBInstancesOfferingMessage = {
    val __obj = js.Dynamic.literal(ReservedDBInstancesOfferingId = ReservedDBInstancesOfferingId.asInstanceOf[js.Any])
    if (DBInstanceCount != null) __obj.updateDynamic("DBInstanceCount")(DBInstanceCount.asInstanceOf[js.Any])
    if (ReservedDBInstanceId != null) __obj.updateDynamic("ReservedDBInstanceId")(ReservedDBInstanceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
  }
}

