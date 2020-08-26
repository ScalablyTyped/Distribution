package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstances extends js.Object {
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The currency of the Reserved Instance. It's specified using ISO 4217 standard currency codes. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The duration of the Reserved Instance, in seconds.
    */
  var Duration: js.UndefOr[Long] = js.native
  /**
    * The time when the Reserved Instance expires.
    */
  var End: js.UndefOr[DateTime] = js.native
  /**
    * The purchase price of the Reserved Instance.
    */
  var FixedPrice: js.UndefOr[Float] = js.native
  /**
    * The number of reservations purchased.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The tenancy of the instance.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  /**
    * The instance type on which the Reserved Instance can be used.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * The offering class of the Reserved Instance.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.native
  /**
    * The Reserved Instance offering type.
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.native
  /**
    * The Reserved Instance product platform description.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  /**
    * The recurring charge tag assigned to the resource.
    */
  var RecurringCharges: js.UndefOr[RecurringChargesList] = js.native
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  /**
    * The scope of the Reserved Instance.
    */
  var Scope: js.UndefOr[scope] = js.native
  /**
    * The date and time the Reserved Instance started.
    */
  var Start: js.UndefOr[DateTime] = js.native
  /**
    * The state of the Reserved Instance purchase.
    */
  var State: js.UndefOr[ReservedInstanceState] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The usage price of the Reserved Instance, per hour.
    */
  var UsagePrice: js.UndefOr[Float] = js.native
}

object ReservedInstances {
  @scala.inline
  def apply(): ReservedInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstances]
  }
  @scala.inline
  implicit class ReservedInstancesOps[Self <: ReservedInstances] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setDuration(value: Long): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    @scala.inline
    def setEnd(value: DateTime): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setFixedPrice(value: Float): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    @scala.inline
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    @scala.inline
    def setInstanceTenancy(value: Tenancy): Self = this.set("InstanceTenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTenancy: Self = this.set("InstanceTenancy", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setOfferingClass(value: OfferingClassType): Self = this.set("OfferingClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingClass: Self = this.set("OfferingClass", js.undefined)
    @scala.inline
    def setOfferingType(value: OfferingTypeValues): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    @scala.inline
    def setProductDescription(value: RIProductDescription): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    @scala.inline
    def setRecurringCharges(value: RecurringChargesList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    @scala.inline
    def setReservedInstancesId(value: String): Self = this.set("ReservedInstancesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedInstancesId: Self = this.set("ReservedInstancesId", js.undefined)
    @scala.inline
    def setScope(value: scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
    @scala.inline
    def setStart(value: DateTime): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
    @scala.inline
    def setState(value: ReservedInstanceState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUsagePrice(value: Float): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
  
}

