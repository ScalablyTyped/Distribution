package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[typings.awsSdk.rdsMod.OptionGroup] = js.native
}

object ModifyOptionGroupResult {
  @scala.inline
  def apply(OptionGroup: OptionGroup = null): ModifyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    if (OptionGroup != null) __obj.updateDynamic("OptionGroup")(OptionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptionGroupResult]
  }
}

