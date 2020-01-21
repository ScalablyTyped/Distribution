package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProtectionStatusResponse extends js.Object {
  /**
    * The ID of the AWS Firewall administrator account for this policy.
    */
  var AdminAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * Details about the attack, including the following:   Attack type   Account ID   ARN of the resource attacked   Start time of the attack   End time of the attack (ongoing attacks will not have an end time)   The details are in JSON format. 
    */
  var Data: js.UndefOr[ProtectionData] = js.native
  /**
    * If you have more objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more objects, submit another GetProtectionStatus request, and specify the NextToken value from the response in the NextToken value in the next request. AWS SDKs provide auto-pagination that identify NextToken in a response and make subsequent request calls automatically on your behalf. However, this feature is not supported by GetProtectionStatus. You must submit subsequent requests with NextToken using your own processes. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The service type that is protected by the policy. Currently, this is always SHIELD_ADVANCED.
    */
  var ServiceType: js.UndefOr[SecurityServiceType] = js.native
}

object GetProtectionStatusResponse {
  @scala.inline
  def apply(
    AdminAccountId: AWSAccountId = null,
    Data: ProtectionData = null,
    NextToken: PaginationToken = null,
    ServiceType: SecurityServiceType = null
  ): GetProtectionStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (AdminAccountId != null) __obj.updateDynamic("AdminAccountId")(AdminAccountId.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectionStatusResponse]
  }
}

