package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterInstanceEventNotificationAttributesResult extends js.Object {
  /**
    * The resulting set of tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.native
}

object DeregisterInstanceEventNotificationAttributesResult {
  @scala.inline
  def apply(InstanceTagAttribute: InstanceTagNotificationAttribute = null): DeregisterInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceTagAttribute != null) __obj.updateDynamic("InstanceTagAttribute")(InstanceTagAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterInstanceEventNotificationAttributesResult]
  }
}

