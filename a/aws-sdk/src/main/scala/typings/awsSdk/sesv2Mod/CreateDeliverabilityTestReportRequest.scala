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
  def apply(
    Content: EmailContent,
    FromEmailAddress: EmailAddress,
    ReportName: ReportName = null,
    Tags: TagList = null
  ): CreateDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], FromEmailAddress = FromEmailAddress.asInstanceOf[js.Any])
    if (ReportName != null) __obj.updateDynamic("ReportName")(ReportName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliverabilityTestReportRequest]
  }
}

