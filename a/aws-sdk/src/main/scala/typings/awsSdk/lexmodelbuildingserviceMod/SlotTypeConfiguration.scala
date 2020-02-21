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
  def apply(regexConfiguration: SlotTypeRegexConfiguration = null): SlotTypeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (regexConfiguration != null) __obj.updateDynamic("regexConfiguration")(regexConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeConfiguration]
  }
}

