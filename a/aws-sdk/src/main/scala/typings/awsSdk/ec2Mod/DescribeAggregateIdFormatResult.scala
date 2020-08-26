package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregateIdFormatResult extends js.Object {
  /**
    * Information about each resource's ID format.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
  /**
    * Indicates whether all resource types in the Region are configured to use longer IDs. This value is only true if all users are configured to use longer IDs for all resources types in the Region.
    */
  var UseLongIdsAggregated: js.UndefOr[Boolean] = js.native
}

object DescribeAggregateIdFormatResult {
  @scala.inline
  def apply(): DescribeAggregateIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateIdFormatResult]
  }
  @scala.inline
  implicit class DescribeAggregateIdFormatResultOps[Self <: DescribeAggregateIdFormatResult] (val x: Self) extends AnyVal {
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
    def setStatusesVarargs(value: IdFormat*): Self = this.set("Statuses", js.Array(value :_*))
    @scala.inline
    def setStatuses(value: IdFormatList): Self = this.set("Statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("Statuses", js.undefined)
    @scala.inline
    def setUseLongIdsAggregated(value: Boolean): Self = this.set("UseLongIdsAggregated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLongIdsAggregated: Self = this.set("UseLongIdsAggregated", js.undefined)
  }
  
}

