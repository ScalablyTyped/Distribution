package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProtectionStatusRequest extends js.Object {
  /**
    * The end of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var EndTime: js.UndefOr[TimeStamp] = js.native
  /**
    * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  /**
    * The AWS account that is in scope of the policy that you want to get the details for.
    */
  var MemberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * If you specify a value for MaxResults and you have more objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response, which you can use to retrieve another group of objects. For the second and subsequent GetProtectionStatus requests, specify the value of NextToken from the previous response to get information about another batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the policy for which you want to get the attack information.
    */
  var PolicyId: typings.awsSdk.fmsMod.PolicyId = js.native
  /**
    * The start of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var StartTime: js.UndefOr[TimeStamp] = js.native
}

object GetProtectionStatusRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): GetProtectionStatusRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectionStatusRequest]
  }
  @scala.inline
  implicit class GetProtectionStatusRequestOps[Self <: GetProtectionStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: TimeStamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setMaxResults(value: PaginationMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setMemberAccountId(value: AWSAccountId): Self = this.set("MemberAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberAccountId: Self = this.set("MemberAccountId", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStartTime(value: TimeStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
  
}

