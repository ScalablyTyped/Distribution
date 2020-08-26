package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeveritySummary extends js.Object {
  /**
    * The total number of resources or compliance items that have a severity level of critical. Critical severity is determined by the organization that published the compliance items.
    */
  var CriticalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of high. High severity is determined by the organization that published the compliance items.
    */
  var HighCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of informational. Informational severity is determined by the organization that published the compliance items.
    */
  var InformationalCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of low. Low severity is determined by the organization that published the compliance items.
    */
  var LowCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of medium. Medium severity is determined by the organization that published the compliance items.
    */
  var MediumCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * The total number of resources or compliance items that have a severity level of unspecified. Unspecified severity is determined by the organization that published the compliance items.
    */
  var UnspecifiedCount: js.UndefOr[ComplianceSummaryCount] = js.native
}

object SeveritySummary {
  @scala.inline
  def apply(): SeveritySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeveritySummary]
  }
  @scala.inline
  implicit class SeveritySummaryOps[Self <: SeveritySummary] (val x: Self) extends AnyVal {
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
    def setCriticalCount(value: ComplianceSummaryCount): Self = this.set("CriticalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriticalCount: Self = this.set("CriticalCount", js.undefined)
    @scala.inline
    def setHighCount(value: ComplianceSummaryCount): Self = this.set("HighCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighCount: Self = this.set("HighCount", js.undefined)
    @scala.inline
    def setInformationalCount(value: ComplianceSummaryCount): Self = this.set("InformationalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInformationalCount: Self = this.set("InformationalCount", js.undefined)
    @scala.inline
    def setLowCount(value: ComplianceSummaryCount): Self = this.set("LowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowCount: Self = this.set("LowCount", js.undefined)
    @scala.inline
    def setMediumCount(value: ComplianceSummaryCount): Self = this.set("MediumCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediumCount: Self = this.set("MediumCount", js.undefined)
    @scala.inline
    def setUnspecifiedCount(value: ComplianceSummaryCount): Self = this.set("UnspecifiedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnspecifiedCount: Self = this.set("UnspecifiedCount", js.undefined)
  }
  
}

