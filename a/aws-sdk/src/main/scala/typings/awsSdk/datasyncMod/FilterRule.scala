package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterRule extends js.Object {
  /**
    * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
    */
  var FilterType: js.UndefOr[typings.awsSdk.datasyncMod.FilterType] = js.native
  /**
    * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|" (that is, a pipe), for example: /folder1|/folder2   
    */
  var Value: js.UndefOr[FilterValue] = js.native
}

object FilterRule {
  @scala.inline
  def apply(FilterType: FilterType = null, Value: FilterValue = null): FilterRule = {
    val __obj = js.Dynamic.literal()
    if (FilterType != null) __obj.updateDynamic("FilterType")(FilterType.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterRule]
  }
}

