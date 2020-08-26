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
  def apply(OrganizationId: IdType): DescribeNotificationSubscriptionsRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationSubscriptionsRequest]
  }
  @scala.inline
  implicit class DescribeNotificationSubscriptionsRequestOps[Self <: DescribeNotificationSubscriptionsRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: LimitType): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

