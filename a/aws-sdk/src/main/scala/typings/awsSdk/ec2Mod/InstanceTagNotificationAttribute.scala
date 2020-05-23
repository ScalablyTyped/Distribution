package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTagNotificationAttribute extends js.Object {
  /**
    * Indicates wheter all tag keys in the current Region are registered to appear in scheduled event notifications. true indicates that all tag keys in the current Region are registered.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.native
  /**
    * The registered tag keys.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.native
}

object InstanceTagNotificationAttribute {
  @scala.inline
  def apply(
    IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.undefined,
    InstanceTagKeys: InstanceTagKeySet = null
  ): InstanceTagNotificationAttribute = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeAllTagsOfInstance)) __obj.updateDynamic("IncludeAllTagsOfInstance")(IncludeAllTagsOfInstance.get.asInstanceOf[js.Any])
    if (InstanceTagKeys != null) __obj.updateDynamic("InstanceTagKeys")(InstanceTagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTagNotificationAttribute]
  }
}

