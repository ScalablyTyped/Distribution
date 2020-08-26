package typings.awsSdkClientS3Browser.typesS3KeyFilterMod

import typings.awsSdkClientS3Browser.typesFilterRuleMod.UnmarshalledFilterRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledS3KeyFilter extends S3KeyFilter {
  /**
    * <p>A list of containers for key value pair that defines the criteria for the filter rule.</p>
    */
  @JSName("FilterRules")
  var FilterRules_UnmarshalledS3KeyFilter: js.UndefOr[js.Array[UnmarshalledFilterRule]] = js.native
}

object UnmarshalledS3KeyFilter {
  @scala.inline
  def apply(): UnmarshalledS3KeyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledS3KeyFilter]
  }
  @scala.inline
  implicit class UnmarshalledS3KeyFilterOps[Self <: UnmarshalledS3KeyFilter] (val x: Self) extends AnyVal {
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
    def setFilterRulesVarargs(value: UnmarshalledFilterRule*): Self = this.set("FilterRules", js.Array(value :_*))
    @scala.inline
    def setFilterRules(value: js.Array[UnmarshalledFilterRule]): Self = this.set("FilterRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterRules: Self = this.set("FilterRules", js.undefined)
  }
  
}

