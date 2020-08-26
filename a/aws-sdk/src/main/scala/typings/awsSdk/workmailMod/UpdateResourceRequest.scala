package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceRequest extends js.Object {
  /**
    * The resource's booking options to be updated.
    */
  var BookingOptions: js.UndefOr[typings.awsSdk.workmailMod.BookingOptions] = js.native
  /**
    * The name of the resource to be updated.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The identifier associated with the organization for which the resource is updated.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The identifier of the resource to be updated.
    */
  var ResourceId: typings.awsSdk.workmailMod.ResourceId = js.native
}

object UpdateResourceRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceRequest]
  }
  @scala.inline
  implicit class UpdateResourceRequestOps[Self <: UpdateResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookingOptions(value: BookingOptions): Self = this.set("BookingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookingOptions: Self = this.set("BookingOptions", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

