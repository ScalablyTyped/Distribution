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
  def apply(): ListLaunchPathsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLaunchPathsOutput]
  }
  @scala.inline
  implicit class ListLaunchPathsOutputOps[Self <: ListLaunchPathsOutput] (val x: Self) extends AnyVal {
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
    def setLaunchPathSummariesVarargs(value: LaunchPathSummary*): Self = this.set("LaunchPathSummaries", js.Array(value :_*))
    @scala.inline
    def setLaunchPathSummaries(value: LaunchPathSummaries): Self = this.set("LaunchPathSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchPathSummaries: Self = this.set("LaunchPathSummaries", js.undefined)
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
  
}

