package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchLookupPolicyResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typings.awsSdk.clouddirectoryMod.PolicyToPathList] = js.native
}

object BatchLookupPolicyResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PolicyToPathList: PolicyToPathList = null): BatchLookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PolicyToPathList != null) __obj.updateDynamic("PolicyToPathList")(PolicyToPathList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchLookupPolicyResponse]
  }
}

