package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDirectoriesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
    */
  var state: js.UndefOr[DirectoryState] = js.native
}

object ListDirectoriesRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    state: DirectoryState = null
  ): ListDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDirectoriesRequest]
  }
}

