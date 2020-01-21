package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSolutionVersionsRequest extends js.Object {
  /**
    * The maximum number of solution versions to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListSolutionVersions for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
}

object ListSolutionVersionsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null, solutionArn: Arn = null): ListSolutionVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolutionVersionsRequest]
  }
}

