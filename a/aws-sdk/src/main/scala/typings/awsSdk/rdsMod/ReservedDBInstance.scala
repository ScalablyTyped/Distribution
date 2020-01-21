package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedDBInstance extends js.Object {
  /**
    * The currency code for the reserved DB instance.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The number of reserved DB instances.
    */
  var DBInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed price charged for this reserved DB instance.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * The unique identifier for the lease associated with the reserved DB instance.  AWS Support might request the lease ID for an issue related to a reserved DB instance. 
    */
  var LeaseId: js.UndefOr[String] = js.native
  /**
    * Indicates if the reservation applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * The offering type of this reserved DB instance.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The description of the reserved DB instance.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The Amazon Resource Name (ARN) for the reserved DB instance.
    */
  var ReservedDBInstanceArn: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the reservation.
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.native
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  /**
    * The state of the reserved DB instance.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The hourly price charged for this reserved DB instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedDBInstance {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    DBInstanceClass: String = null,
    DBInstanceCount: Int | scala.Double = null,
    Duration: Int | scala.Double = null,
    FixedPrice: Int | scala.Double = null,
    LeaseId: String = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedDBInstanceArn: String = null,
    ReservedDBInstanceId: String = null,
    ReservedDBInstancesOfferingId: String = null,
    StartTime: TStamp = null,
    State: String = null,
    UsagePrice: Int | scala.Double = null
  ): ReservedDBInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (DBInstanceCount != null) __obj.updateDynamic("DBInstanceCount")(DBInstanceCount.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (FixedPrice != null) __obj.updateDynamic("FixedPrice")(FixedPrice.asInstanceOf[js.Any])
    if (LeaseId != null) __obj.updateDynamic("LeaseId")(LeaseId.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges.asInstanceOf[js.Any])
    if (ReservedDBInstanceArn != null) __obj.updateDynamic("ReservedDBInstanceArn")(ReservedDBInstanceArn.asInstanceOf[js.Any])
    if (ReservedDBInstanceId != null) __obj.updateDynamic("ReservedDBInstanceId")(ReservedDBInstanceId.asInstanceOf[js.Any])
    if (ReservedDBInstancesOfferingId != null) __obj.updateDynamic("ReservedDBInstancesOfferingId")(ReservedDBInstancesOfferingId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (UsagePrice != null) __obj.updateDynamic("UsagePrice")(UsagePrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedDBInstance]
  }
}

