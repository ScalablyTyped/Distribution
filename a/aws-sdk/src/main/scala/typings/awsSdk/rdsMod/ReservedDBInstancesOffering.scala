package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedDBInstancesOffering extends js.Object {
  /**
    * The currency code for the reserved DB instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The duration of the offering in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  /**
    * The fixed price charged for this offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  /**
    * Indicates if the offering applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * The offering type.
    */
  var OfferingType: js.UndefOr[String] = js.native
  /**
    * The database engine used by the offering.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.native
  /**
    * The hourly price charged for this offering.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}

object ReservedDBInstancesOffering {
  @scala.inline
  def apply(
    CurrencyCode: String = null,
    DBInstanceClass: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    FixedPrice: js.UndefOr[Double] = js.undefined,
    MultiAZ: js.UndefOr[Boolean] = js.undefined,
    OfferingType: String = null,
    ProductDescription: String = null,
    RecurringCharges: RecurringChargeList = null,
    ReservedDBInstancesOfferingId: String = null,
    UsagePrice: js.UndefOr[Double] = js.undefined
  ): ReservedDBInstancesOffering = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedPrice)) __obj.updateDynamic("FixedPrice")(FixedPrice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.get.asInstanceOf[js.Any])
    if (OfferingType != null) __obj.updateDynamic("OfferingType")(OfferingType.asInstanceOf[js.Any])
    if (ProductDescription != null) __obj.updateDynamic("ProductDescription")(ProductDescription.asInstanceOf[js.Any])
    if (RecurringCharges != null) __obj.updateDynamic("RecurringCharges")(RecurringCharges.asInstanceOf[js.Any])
    if (ReservedDBInstancesOfferingId != null) __obj.updateDynamic("ReservedDBInstancesOfferingId")(ReservedDBInstancesOfferingId.asInstanceOf[js.Any])
    if (!js.isUndefined(UsagePrice)) __obj.updateDynamic("UsagePrice")(UsagePrice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedDBInstancesOffering]
  }
}

