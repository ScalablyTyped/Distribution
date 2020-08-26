package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstance extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
    */
  var DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.native
  /**
    *  Expected cost to operate this instance type on a monthly basis.
    */
  var EstimatedMonthlyCost: js.UndefOr[GenericString] = js.native
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.native
  /**
    *  Expected utilization metrics for target instance type.
    */
  var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization] = js.native
  /**
    *  Details on the target instance type. 
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ResourceDetails] = js.native
}

object TargetInstance {
  @scala.inline
  def apply(): TargetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstance]
  }
  @scala.inline
  implicit class TargetInstanceOps[Self <: TargetInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    @scala.inline
    def setDefaultTargetInstance(value: GenericBoolean): Self = this.set("DefaultTargetInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTargetInstance: Self = this.set("DefaultTargetInstance", js.undefined)
    @scala.inline
    def setEstimatedMonthlyCost(value: GenericString): Self = this.set("EstimatedMonthlyCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlyCost: Self = this.set("EstimatedMonthlyCost", js.undefined)
    @scala.inline
    def setEstimatedMonthlySavings(value: GenericString): Self = this.set("EstimatedMonthlySavings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedMonthlySavings: Self = this.set("EstimatedMonthlySavings", js.undefined)
    @scala.inline
    def setExpectedResourceUtilization(value: ResourceUtilization): Self = this.set("ExpectedResourceUtilization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedResourceUtilization: Self = this.set("ExpectedResourceUtilization", js.undefined)
    @scala.inline
    def setResourceDetails(value: ResourceDetails): Self = this.set("ResourceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceDetails: Self = this.set("ResourceDetails", js.undefined)
  }
  
}

