package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingRegistrationTaskReportsResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The type of task report.
    */
  var reportType: js.UndefOr[ReportType] = js.native
  /**
    * Links to the task resources.
    */
  var resourceLinks: js.UndefOr[S3FileUrlList] = js.native
}

object ListThingRegistrationTaskReportsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, reportType: ReportType = null, resourceLinks: S3FileUrlList = null): ListThingRegistrationTaskReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (reportType != null) __obj.updateDynamic("reportType")(reportType.asInstanceOf[js.Any])
    if (resourceLinks != null) __obj.updateDynamic("resourceLinks")(resourceLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingRegistrationTaskReportsResponse]
  }
}

