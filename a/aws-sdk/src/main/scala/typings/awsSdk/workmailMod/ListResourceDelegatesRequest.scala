package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceDelegatesRequest extends js.Object {
  /**
    * The number of maximum results in a page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.workmailMod.MaxResults] = js.native
  /**
    * The token used to paginate through the delegates associated with a resource.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
  /**
    * The identifier for the organization that contains the resource for which delegates are listed.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The identifier for the resource whose delegates are listed.
    */
  var ResourceId: WorkMailIdentifier = js.native
}

object ListResourceDelegatesRequest {
  @scala.inline
  def apply(
    OrganizationId: OrganizationId,
    ResourceId: WorkMailIdentifier,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListResourceDelegatesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceDelegatesRequest]
  }
}

