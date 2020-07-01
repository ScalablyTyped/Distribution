package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePackagingGroupRequest extends js.Object {
  var Authorization: js.UndefOr[typings.awsSdk.mediapackagevodMod.Authorization] = js.native
  /**
    * The ID of the PackagingGroup.
    */
  var Id: string = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}

object CreatePackagingGroupRequest {
  @scala.inline
  def apply(Id: string, Authorization: Authorization = null, Tags: Tags = null): CreatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingGroupRequest]
  }
}

