package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBillingGroupResponse extends js.Object {
  /**
    * The latest version of the billing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object UpdateBillingGroupResponse {
  @scala.inline
  def apply(): UpdateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBillingGroupResponse]
  }
  @scala.inline
  implicit class UpdateBillingGroupResponseOps[Self <: UpdateBillingGroupResponse] (val x: Self) extends AnyVal {
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
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

