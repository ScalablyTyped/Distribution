package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanRate extends js.Object {
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  /**
    * The specific AWS operation for the line item in the billing report.
    */
  var operation: js.UndefOr[SavingsPlanRateOperation] = js.native
  /**
    * The product type.
    */
  var productType: js.UndefOr[SavingsPlanProductType] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[SavingsPlanRatePropertyList] = js.native
  /**
    * The rate.
    */
  var rate: js.UndefOr[Amount] = js.native
  /**
    * The service.
    */
  var serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.native
  /**
    * The unit.
    */
  var unit: js.UndefOr[SavingsPlanRateUnit] = js.native
  /**
    * The usage details of the line item in the billing report.
    */
  var usageType: js.UndefOr[SavingsPlanRateUsageType] = js.native
}

object SavingsPlanRate {
  @scala.inline
  def apply(
    currency: CurrencyCode = null,
    operation: SavingsPlanRateOperation = null,
    productType: SavingsPlanProductType = null,
    properties: SavingsPlanRatePropertyList = null,
    rate: Amount = null,
    serviceCode: SavingsPlanRateServiceCode = null,
    unit: SavingsPlanRateUnit = null,
    usageType: SavingsPlanRateUsageType = null
  ): SavingsPlanRate = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (productType != null) __obj.updateDynamic("productType")(productType.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (usageType != null) __obj.updateDynamic("usageType")(usageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanRate]
  }
}

