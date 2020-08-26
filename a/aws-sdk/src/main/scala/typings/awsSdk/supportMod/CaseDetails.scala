package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseDetails extends js.Object {
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
  /**
    * The category of problem for the AWS Support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.native
  /**
    * The email addresses that receive copies of communication about the case.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  /**
    * The ID displayed for the case in the AWS Support Center. This is a numeric string.
    */
  var displayId: js.UndefOr[DisplayId] = js.native
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to the communications. Also includes a nextToken that you can use to retrieve earlier communications.
    */
  var recentCommunications: js.UndefOr[RecentCaseCommunications] = js.native
  /**
    * The code for the AWS service. You can get a list of codes and the corresponding service names by calling DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.native
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.
    */
  var severityCode: js.UndefOr[SeverityCode] = js.native
  /**
    * The status of the case. Valid values:    opened     pending-customer-action     reopened     resolved     unassigned     work-in-progress   
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The subject line for the case in the AWS Support Center.
    */
  var subject: js.UndefOr[Subject] = js.native
  /**
    * The email address of the account that submitted the case.
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.native
  /**
    * The time that the case was created in the AWS Support Center.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.native
}

object CaseDetails {
  @scala.inline
  def apply(): CaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseDetails]
  }
  @scala.inline
  implicit class CaseDetailsOps[Self <: CaseDetails] (val x: Self) extends AnyVal {
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
    def setCaseId(value: CaseId): Self = this.set("caseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseId: Self = this.set("caseId", js.undefined)
    @scala.inline
    def setCategoryCode(value: CategoryCode): Self = this.set("categoryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryCode: Self = this.set("categoryCode", js.undefined)
    @scala.inline
    def setCcEmailAddressesVarargs(value: CcEmailAddress*): Self = this.set("ccEmailAddresses", js.Array(value :_*))
    @scala.inline
    def setCcEmailAddresses(value: CcEmailAddressList): Self = this.set("ccEmailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcEmailAddresses: Self = this.set("ccEmailAddresses", js.undefined)
    @scala.inline
    def setDisplayId(value: DisplayId): Self = this.set("displayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayId: Self = this.set("displayId", js.undefined)
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setRecentCommunications(value: RecentCaseCommunications): Self = this.set("recentCommunications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecentCommunications: Self = this.set("recentCommunications", js.undefined)
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("serviceCode", js.undefined)
    @scala.inline
    def setSeverityCode(value: SeverityCode): Self = this.set("severityCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverityCode: Self = this.set("severityCode", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubject(value: Subject): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setSubmittedBy(value: SubmittedBy): Self = this.set("submittedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedBy: Self = this.set("submittedBy", js.undefined)
    @scala.inline
    def setTimeCreated(value: TimeCreated): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
  }
  
}

