package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceStatusRequest extends js.Object {
  /**
    * Specifies the number of PolicyComplianceStatus objects that you want AWS Firewall Manager to return for this request. If you have more PolicyComplianceStatus objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of PolicyComplianceStatus objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  /**
    * If you specify a value for MaxResults and you have more PolicyComplianceStatus objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of PolicyComplianceStatus objects. For the second and subsequent ListComplianceStatus requests, specify the value of NextToken from the previous response to get information about another batch of PolicyComplianceStatus objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the AWS Firewall Manager policy that you want the details for.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
}

object ListComplianceStatusRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
    NextToken: PaginationToken = null
  ): ListComplianceStatusRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComplianceStatusRequest]
  }
}

