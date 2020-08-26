package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotTypeConfiguration extends js.Object {
  /**
    * A regular expression used to validate the value of a slot.
    */
  var regexConfiguration: js.UndefOr[SlotTypeRegexConfiguration] = js.native
}

object SlotTypeConfiguration {
  @scala.inline
  def apply(): SlotTypeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeConfiguration]
  }
  @scala.inline
  implicit class SlotTypeConfigurationOps[Self <: SlotTypeConfiguration] (val x: Self) extends AnyVal {
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
    def setRegexConfiguration(value: SlotTypeRegexConfiguration): Self = this.set("regexConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexConfiguration: Self = this.set("regexConfiguration", js.undefined)
  }
  
}

