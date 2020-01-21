package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsResponse extends js.Object {
  /**
    * A list of ApplicationSummary objects.
    */
  var ApplicationSummaries: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationSummaries = js.native
  /**
    * The pagination token for the next set of results, or null if there are no additional results. Pass this token into a subsequent command to retrieve the next set of items For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[ApplicationName] = js.native
}

object ListApplicationsResponse {
  @scala.inline
  def apply(ApplicationSummaries: ApplicationSummaries, NextToken: ApplicationName = null): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummaries = ApplicationSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

