package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCodeReviewsRequest extends js.Object {
  /**
    *  The maximum number of results that are returned per call. The default is 100. 
    */
  var MaxResults: js.UndefOr[ListCodeReviewsMaxResults] = js.native
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  /**
    *  List of provider types for filtering that needs to be applied before displaying the result. For example, "providerTypes=[GitHub]" will list code reviews from GitHub. 
    */
  var ProviderTypes: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderTypes] = js.native
  /**
    *  List of repository names for filtering that needs to be applied before displaying the result. 
    */
  var RepositoryNames: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryNames] = js.native
  /**
    *  List of states for filtering that needs to be applied before displaying the result. For example, "states=[Pending]" will list code reviews in the Pending state. 
    */
  var States: js.UndefOr[JobStates] = js.native
  /**
    *  The type of code reviews to list in the response. 
    */
  var Type: typings.awsSdk.codegurureviewerMod.Type = js.native
}

object ListCodeReviewsRequest {
  @scala.inline
  def apply(
    Type: Type,
    MaxResults: js.UndefOr[ListCodeReviewsMaxResults] = js.undefined,
    NextToken: NextToken = null,
    ProviderTypes: ProviderTypes = null,
    RepositoryNames: RepositoryNames = null,
    States: JobStates = null
  ): ListCodeReviewsRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProviderTypes != null) __obj.updateDynamic("ProviderTypes")(ProviderTypes.asInstanceOf[js.Any])
    if (RepositoryNames != null) __obj.updateDynamic("RepositoryNames")(RepositoryNames.asInstanceOf[js.Any])
    if (States != null) __obj.updateDynamic("States")(States.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeReviewsRequest]
  }
}

