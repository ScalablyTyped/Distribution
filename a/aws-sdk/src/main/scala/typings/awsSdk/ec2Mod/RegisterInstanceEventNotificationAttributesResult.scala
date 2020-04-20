package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceEventNotificationAttributesResult extends js.Object {
  /**
    * The resulting set of tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.native
}

object RegisterInstanceEventNotificationAttributesResult {
  @scala.inline
  def apply(InstanceTagAttribute: InstanceTagNotificationAttribute = null): RegisterInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceTagAttribute != null) __obj.updateDynamic("InstanceTagAttribute")(InstanceTagAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceEventNotificationAttributesResult]
  }
}

