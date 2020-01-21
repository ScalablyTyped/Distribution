package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSolutionsResponse extends js.Object {
  /**
    * A token for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of the current solutions.
    */
  var solutions: js.UndefOr[Solutions] = js.native
}

object ListSolutionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, solutions: Solutions = null): ListSolutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (solutions != null) __obj.updateDynamic("solutions")(solutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolutionsResponse]
  }
}

