package typings.awsSdkClientS3Node.typesNotificationConfigurationFilterMod

import typings.awsSdkClientS3Node.typesS3KeyFilterMod.UnmarshalledS3KeyFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledNotificationConfigurationFilter extends NotificationConfigurationFilter {
  /**
    * <p>Container for object key name prefix and suffix filtering rules.</p>
    */
  @JSName("Key")
  var Key_UnmarshalledNotificationConfigurationFilter: js.UndefOr[UnmarshalledS3KeyFilter] = js.native
}

object UnmarshalledNotificationConfigurationFilter {
  @scala.inline
  def apply(): UnmarshalledNotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledNotificationConfigurationFilter]
  }
  @scala.inline
  implicit class UnmarshalledNotificationConfigurationFilterOps[Self <: UnmarshalledNotificationConfigurationFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: UnmarshalledS3KeyFilter): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
  }
  
}

