package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePackagingGroupRequest extends js.Object {
  var Authorization: js.UndefOr[typings.awsSdk.mediapackagevodMod.Authorization] = js.native
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string = js.native
}

object UpdatePackagingGroupRequest {
  @scala.inline
  def apply(Id: string): UpdatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackagingGroupRequest]
  }
  @scala.inline
  implicit class UpdatePackagingGroupRequestOps[Self <: UpdatePackagingGroupRequest] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorization(value: Authorization): Self = this.set("Authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("Authorization", js.undefined)
  }
  
}

