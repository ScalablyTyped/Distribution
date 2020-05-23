package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list that summarizes each project in the portal.
    */
  var projectSummaries: ProjectSummaries = js.native
}

object ListProjectsResponse {
  @scala.inline
  def apply(projectSummaries: ProjectSummaries, nextToken: NextToken = null): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projectSummaries = projectSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
}

