package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[typings.awsSdk.rdsMod.OptionGroup] = js.native
}

object CreateOptionGroupResult {
  @scala.inline
  def apply(OptionGroup: OptionGroup = null): CreateOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    if (OptionGroup != null) __obj.updateDynamic("OptionGroup")(OptionGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionGroupResult]
  }
}

