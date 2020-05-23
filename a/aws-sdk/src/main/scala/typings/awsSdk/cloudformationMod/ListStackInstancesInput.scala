package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackInstancesInput extends js.Object {
  /**
    * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.cloudformationMod.MaxResults] = js.native
  /**
    * If the previous request didn't return all of the remaining results, the response's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * The name of the AWS account that you want to list stack instances for.
    */
  var StackInstanceAccount: js.UndefOr[Account] = js.native
  /**
    * The name of the Region where you want to list stack instances. 
    */
  var StackInstanceRegion: js.UndefOr[Region] = js.native
  /**
    * The name or unique ID of the stack set that you want to list stack instances for.
    */
  var StackSetName: typings.awsSdk.cloudformationMod.StackSetName = js.native
}

object ListStackInstancesInput {
  @scala.inline
  def apply(
    StackSetName: StackSetName,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    StackInstanceAccount: Account = null,
    StackInstanceRegion: Region = null
  ): ListStackInstancesInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackInstanceAccount != null) __obj.updateDynamic("StackInstanceAccount")(StackInstanceAccount.asInstanceOf[js.Any])
    if (StackInstanceRegion != null) __obj.updateDynamic("StackInstanceRegion")(StackInstanceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesInput]
  }
}

