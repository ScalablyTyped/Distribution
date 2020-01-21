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
  def apply(
    CurrencyCode: GenericString = null,
    DefaultTargetInstance: js.UndefOr[Boolean] = js.undefined,
    EstimatedMonthlyCost: GenericString = null,
    EstimatedMonthlySavings: GenericString = null,
    ExpectedResourceUtilization: ResourceUtilization = null,
    ResourceDetails: ResourceDetails = null
  ): TargetInstance = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultTargetInstance)) __obj.updateDynamic("DefaultTargetInstance")(DefaultTargetInstance.asInstanceOf[js.Any])
    if (EstimatedMonthlyCost != null) __obj.updateDynamic("EstimatedMonthlyCost")(EstimatedMonthlyCost.asInstanceOf[js.Any])
    if (EstimatedMonthlySavings != null) __obj.updateDynamic("EstimatedMonthlySavings")(EstimatedMonthlySavings.asInstanceOf[js.Any])
    if (ExpectedResourceUtilization != null) __obj.updateDynamic("ExpectedResourceUtilization")(ExpectedResourceUtilization.asInstanceOf[js.Any])
    if (ResourceDetails != null) __obj.updateDynamic("ResourceDetails")(ResourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInstance]
  }
}

