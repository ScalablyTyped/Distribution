package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterInstanceTagAttributeRequest extends js.Object {
  /**
    * Indicates whether to deregister all tag keys in the current Region. Specify false to deregister all tag keys.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.native
  /**
    * Information about the tag keys to deregister.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.native
}

object DeregisterInstanceTagAttributeRequest {
  @scala.inline
  def apply(
    IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.undefined,
    InstanceTagKeys: InstanceTagKeySet = null
  ): DeregisterInstanceTagAttributeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeAllTagsOfInstance)) __obj.updateDynamic("IncludeAllTagsOfInstance")(IncludeAllTagsOfInstance.get.asInstanceOf[js.Any])
    if (InstanceTagKeys != null) __obj.updateDynamic("InstanceTagKeys")(InstanceTagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterInstanceTagAttributeRequest]
  }
}

