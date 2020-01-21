package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridProjectsResult extends js.Object {
  /**
    * Used for pagination. Pass into ListTestGridProjects to get more results in a paginated request.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of TestGridProjects, based on a ListTestGridProjectsRequest.
    */
  var testGridProjects: js.UndefOr[TestGridProjects] = js.native
}

object ListTestGridProjectsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, testGridProjects: TestGridProjects = null): ListTestGridProjectsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (testGridProjects != null) __obj.updateDynamic("testGridProjects")(testGridProjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridProjectsResult]
  }
}

