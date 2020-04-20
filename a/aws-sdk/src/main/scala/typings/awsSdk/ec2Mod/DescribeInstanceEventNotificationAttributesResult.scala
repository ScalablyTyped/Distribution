package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceEventNotificationAttributesResult extends js.Object {
  /**
    * Information about the registered tag keys.
    */
  var InstanceTagAttribute: js.UndefOr[InstanceTagNotificationAttribute] = js.native
}

object DescribeInstanceEventNotificationAttributesResult {
  @scala.inline
  def apply(InstanceTagAttribute: InstanceTagNotificationAttribute = null): DescribeInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceTagAttribute != null) __obj.updateDynamic("InstanceTagAttribute")(InstanceTagAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceEventNotificationAttributesResult]
  }
}

