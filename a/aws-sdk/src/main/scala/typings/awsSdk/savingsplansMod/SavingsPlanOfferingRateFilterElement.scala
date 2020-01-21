package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingRateFilterElement extends js.Object {
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterAttribute] = js.native
  /**
    * The filter values.
    */
  var values: js.UndefOr[FilterValuesList] = js.native
}

object SavingsPlanOfferingRateFilterElement {
  @scala.inline
  def apply(name: SavingsPlanRateFilterAttribute = null, values: FilterValuesList = null): SavingsPlanOfferingRateFilterElement = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlanOfferingRateFilterElement]
  }
}

