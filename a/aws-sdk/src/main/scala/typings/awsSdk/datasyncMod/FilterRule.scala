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
  def apply(): FilterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRule]
  }
  @scala.inline
  implicit class FilterRuleOps[Self <: FilterRule] (val x: Self) extends AnyVal {
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
    def setFilterType(value: FilterType): Self = this.set("FilterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterType: Self = this.set("FilterType", js.undefined)
    @scala.inline
    def setValue(value: FilterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

