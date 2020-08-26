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
  def apply(): InstanceTagNotificationAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTagNotificationAttribute]
  }
  @scala.inline
  implicit class InstanceTagNotificationAttributeOps[Self <: InstanceTagNotificationAttribute] (val x: Self) extends AnyVal {
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
    def setIncludeAllTagsOfInstance(value: Boolean): Self = this.set("IncludeAllTagsOfInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAllTagsOfInstance: Self = this.set("IncludeAllTagsOfInstance", js.undefined)
    @scala.inline
    def setInstanceTagKeysVarargs(value: String*): Self = this.set("InstanceTagKeys", js.Array(value :_*))
    @scala.inline
    def setInstanceTagKeys(value: InstanceTagKeySet): Self = this.set("InstanceTagKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTagKeys: Self = this.set("InstanceTagKeys", js.undefined)
  }
  
}

