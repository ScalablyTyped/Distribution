package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfigurationFilter extends js.Object {
  var Key: js.UndefOr[S3KeyFilter] = js.native
}

object NotificationConfigurationFilter {
  @scala.inline
  def apply(): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
  @scala.inline
  implicit class NotificationConfigurationFilterOps[Self <: NotificationConfigurationFilter] (val x: Self) extends AnyVal {
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
    def setKey(value: S3KeyFilter): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
  }
  
}

