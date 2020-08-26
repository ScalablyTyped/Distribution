package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityTestReportResponse extends js.Object {
  /**
    * An object that contains the results of the predictive inbox placement test.
    */
  var DeliverabilityTestReport: typings.awsSdk.sesv2Mod.DeliverabilityTestReport = js.native
  /**
    * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail, Yahoo, AOL, and others.
    */
  var IspPlacements: typings.awsSdk.sesv2Mod.IspPlacements = js.native
  /**
    * An object that contains the message that you sent when you performed this predictive inbox placement test.
    */
  var Message: js.UndefOr[MessageContent] = js.native
  /**
    * An object that specifies how many test messages that were sent during the predictive inbox placement test were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
    */
  var OverallPlacement: PlacementStatistics = js.native
  /**
    * An array of objects that define the tags (keys and values) that are associated with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GetDeliverabilityTestReportResponse {
  @scala.inline
  def apply(
    DeliverabilityTestReport: DeliverabilityTestReport,
    IspPlacements: IspPlacements,
    OverallPlacement: PlacementStatistics
  ): GetDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReport = DeliverabilityTestReport.asInstanceOf[js.Any], IspPlacements = IspPlacements.asInstanceOf[js.Any], OverallPlacement = OverallPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportResponse]
  }
  @scala.inline
  implicit class GetDeliverabilityTestReportResponseOps[Self <: GetDeliverabilityTestReportResponse] (val x: Self) extends AnyVal {
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
    def setDeliverabilityTestReport(value: DeliverabilityTestReport): Self = this.set("DeliverabilityTestReport", value.asInstanceOf[js.Any])
    @scala.inline
    def setIspPlacementsVarargs(value: IspPlacement*): Self = this.set("IspPlacements", js.Array(value :_*))
    @scala.inline
    def setIspPlacements(value: IspPlacements): Self = this.set("IspPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverallPlacement(value: PlacementStatistics): Self = this.set("OverallPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageContent): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

