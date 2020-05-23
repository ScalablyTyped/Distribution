package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationSubscriptionsRequest extends js.Object {
  /**
    * The maximum number of items to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType = js.native
}

object DescribeNotificationSubscriptionsRequest {
  @scala.inline
  def apply(OrganizationId: IdType, Limit: js.UndefOr[LimitType] = js.undefined, Marker: PageMarkerType = null): DescribeNotificationSubscriptionsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationSubscriptionsRequest]
  }
}

