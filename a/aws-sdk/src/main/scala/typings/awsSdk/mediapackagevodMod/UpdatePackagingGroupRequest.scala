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
  def apply(Id: string, Authorization: Authorization = null): UpdatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackagingGroupRequest]
  }
}

