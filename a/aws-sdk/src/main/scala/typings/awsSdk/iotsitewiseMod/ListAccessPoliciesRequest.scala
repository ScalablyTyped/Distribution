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
  def apply(): ListAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPoliciesRequest]
  }
  @scala.inline
  implicit class ListAccessPoliciesRequestOps[Self <: ListAccessPoliciesRequest] (val x: Self) extends AnyVal {
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
    def setIdentityId(value: IdentityId): Self = this.set("identityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("identityId", js.undefined)
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("identityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityType: Self = this.set("identityType", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResourceId(value: ID): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

