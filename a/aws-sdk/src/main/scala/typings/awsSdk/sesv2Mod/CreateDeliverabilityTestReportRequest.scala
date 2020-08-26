package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeliverabilityTestReportRequest extends js.Object {
  /**
    * The HTML body of the message that you sent when you performed the predictive inbox placement test.
    */
  var Content: EmailContent = js.native
  /**
    * The email address that the predictive inbox placement test email was sent from.
    */
  var FromEmailAddress: EmailAddress = js.native
  /**
    * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
    */
  var ReportName: js.UndefOr[typings.awsSdk.sesv2Mod.ReportName] = js.native
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDeliverabilityTestReportRequest {
  @scala.inline
  def apply(Content: EmailContent, FromEmailAddress: EmailAddress): CreateDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], FromEmailAddress = FromEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliverabilityTestReportRequest]
  }
  @scala.inline
  implicit class CreateDeliverabilityTestReportRequestOps[Self <: CreateDeliverabilityTestReportRequest] (val x: Self) extends AnyVal {
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
    def setContent(value: EmailContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportName(value: ReportName): Self = this.set("ReportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportName: Self = this.set("ReportName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

