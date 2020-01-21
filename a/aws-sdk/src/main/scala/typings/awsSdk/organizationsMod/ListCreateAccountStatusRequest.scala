package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreateAccountStatusRequest extends js.Object {
  /**
    * (Optional) Use this to limit the number of results you want included per page in the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.organizationsMod.MaxResults] = js.native
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * A list of one or more states that you want included in the response. If this parameter isn't present, all requests are included in the response.
    */
  var States: js.UndefOr[CreateAccountStates] = js.native
}

object ListCreateAccountStatusRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null, States: CreateAccountStates = null): ListCreateAccountStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (States != null) __obj.updateDynamic("States")(States.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreateAccountStatusRequest]
  }
}

