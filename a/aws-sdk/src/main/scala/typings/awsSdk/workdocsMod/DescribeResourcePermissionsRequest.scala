package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourcePermissionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The ID of the principal to filter permissions by.
    */
  var PrincipalId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object DescribeResourcePermissionsRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null,
    PrincipalId: IdType = null
  ): DescribeResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePermissionsRequest]
  }
}

