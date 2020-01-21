package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLaunchPathsOutput extends js.Object {
  /**
    * Information about the launch path.
    */
  var LaunchPathSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.LaunchPathSummaries] = js.native
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}

object ListLaunchPathsOutput {
  @scala.inline
  def apply(LaunchPathSummaries: LaunchPathSummaries = null, NextPageToken: PageToken = null): ListLaunchPathsOutput = {
    val __obj = js.Dynamic.literal()
    if (LaunchPathSummaries != null) __obj.updateDynamic("LaunchPathSummaries")(LaunchPathSummaries.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLaunchPathsOutput]
  }
}

