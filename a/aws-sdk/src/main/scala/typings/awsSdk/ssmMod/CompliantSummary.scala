package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompliantSummary extends js.Object {
  /**
    * The total number of resources that are compliant.
    */
  var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * A summary of the compliance severity by compliance type.
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.ssmMod.SeveritySummary] = js.native
}

object CompliantSummary {
  @scala.inline
  def apply(): CompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompliantSummary]
  }
  @scala.inline
  implicit class CompliantSummaryOps[Self <: CompliantSummary] (val x: Self) extends AnyVal {
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
    def setCompliantCount(value: ComplianceSummaryCount): Self = this.set("CompliantCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantCount: Self = this.set("CompliantCount", js.undefined)
    @scala.inline
    def setSeveritySummary(value: SeveritySummary): Self = this.set("SeveritySummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeveritySummary: Self = this.set("SeveritySummary", js.undefined)
  }
  
}

