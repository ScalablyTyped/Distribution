package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceContributorCount extends js.Object {
  /**
    * Indicates whether the maximum count is reached.
    */
  var CapExceeded: js.UndefOr[Boolean] = js.native
  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
    */
  var CappedCount: js.UndefOr[Integer] = js.native
}

object ComplianceContributorCount {
  @scala.inline
  def apply(): ComplianceContributorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceContributorCount]
  }
  @scala.inline
  implicit class ComplianceContributorCountOps[Self <: ComplianceContributorCount] (val x: Self) extends AnyVal {
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
    def setCapExceeded(value: Boolean): Self = this.set("CapExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapExceeded: Self = this.set("CapExceeded", js.undefined)
    @scala.inline
    def setCappedCount(value: Integer): Self = this.set("CappedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCappedCount: Self = this.set("CappedCount", js.undefined)
  }
  
}

