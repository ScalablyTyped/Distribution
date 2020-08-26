package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceInstanceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: AmazonResourceName = js.native
  /**
    * An array of strings that you want to associate with the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.native
  /**
    * The ARN of the profile that you want to associate with the device instance.
    */
  var profileArn: js.UndefOr[AmazonResourceName] = js.native
}

object UpdateDeviceInstanceRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceInstanceRequest]
  }
  @scala.inline
  implicit class UpdateDeviceInstanceRequestOps[Self <: UpdateDeviceInstanceRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: InstanceLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setProfileArn(value: AmazonResourceName): Self = this.set("profileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileArn: Self = this.set("profileArn", js.undefined)
  }
  
}

