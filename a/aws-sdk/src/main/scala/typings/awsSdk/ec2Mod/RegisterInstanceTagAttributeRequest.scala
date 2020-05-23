package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceTagAttributeRequest extends js.Object {
  /**
    * Indicates whether to register all tag keys in the current Region. Specify true to register all tag keys.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.native
  /**
    * The tag keys to register.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.native
}

object RegisterInstanceTagAttributeRequest {
  @scala.inline
  def apply(
    IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.undefined,
    InstanceTagKeys: InstanceTagKeySet = null
  ): RegisterInstanceTagAttributeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeAllTagsOfInstance)) __obj.updateDynamic("IncludeAllTagsOfInstance")(IncludeAllTagsOfInstance.get.asInstanceOf[js.Any])
    if (InstanceTagKeys != null) __obj.updateDynamic("InstanceTagKeys")(InstanceTagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceTagAttributeRequest]
  }
}

