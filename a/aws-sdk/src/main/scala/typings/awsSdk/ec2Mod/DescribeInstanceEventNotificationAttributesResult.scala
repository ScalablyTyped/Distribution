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
  def apply(): DescribeInstanceEventNotificationAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceEventNotificationAttributesResult]
  }
  @scala.inline
  implicit class DescribeInstanceEventNotificationAttributesResultOps[Self <: DescribeInstanceEventNotificationAttributesResult] (val x: Self) extends AnyVal {
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
    def setInstanceTagAttribute(value: InstanceTagNotificationAttribute): Self = this.set("InstanceTagAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTagAttribute: Self = this.set("InstanceTagAttribute", js.undefined)
  }
  
}

