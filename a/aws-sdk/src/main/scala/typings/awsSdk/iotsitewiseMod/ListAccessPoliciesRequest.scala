package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessPoliciesRequest extends js.Object {
  /**
    * The ID of the identity. This parameter is required if you specify identityType.
    */
  var identityId: js.UndefOr[IdentityId] = js.native
  /**
    * The type of identity (user or group). This parameter is required if you specify identityId.
    */
  var identityType: js.UndefOr[IdentityType] = js.native
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The ID of the resource. This parameter is required if you specify resourceType.
    */
  var resourceId: js.UndefOr[ID] = js.native
  /**
    * The type of resource (portal or project). This parameter is required if you specify resourceId.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object ListAccessPoliciesRequest {
  @scala.inline
  def apply(
    identityId: IdentityId = null,
    identityType: IdentityType = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    resourceId: ID = null,
    resourceType: ResourceType = null
  ): ListAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (identityId != null) __obj.updateDynamic("identityId")(identityId.asInstanceOf[js.Any])
    if (identityType != null) __obj.updateDynamic("identityType")(identityType.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPoliciesRequest]
  }
}

