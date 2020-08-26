package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingRateProperty extends js.Object {
  /**
    * The property name.
    */
  var name: js.UndefOr[JsonSafeFilterValueString] = js.native
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.native
}

object SavingsPlanOfferingRateProperty {
  @scala.inline
  def apply(): SavingsPlanOfferingRateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingRateProperty]
  }
  @scala.inline
  implicit class SavingsPlanOfferingRatePropertyOps[Self <: SavingsPlanOfferingRateProperty] (val x: Self) extends AnyVal {
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
    def setName(value: JsonSafeFilterValueString): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: JsonSafeFilterValueString): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

