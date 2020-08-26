package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDevicePoolRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Device Farm device pool to update.
    */
  var arn: AmazonResourceName = js.native
  /**
    * Sets whether the maxDevices parameter applies to your device pool. If you set this parameter to true, the maxDevices parameter does not apply, and Device Farm does not limit the number of devices that it adds to your device pool. In this case, Device Farm adds all available devices that meet the criteria specified in the rules parameter. If you use this parameter in your request, you cannot use the maxDevices parameter in the same request.
    */
  var clearMaxDevices: js.UndefOr[Boolean] = js.native
  /**
    * A description of the device pool to update.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and that meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests. If you use this parameter in your request, you cannot use the clearMaxDevices parameter in the same request.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
  /**
    * A string that represents the name of the device pool to update.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * Represents the rules to modify for the device pool. Updating rules is optional. If you update rules for your request, the update replaces the existing rules.
    */
  var rules: js.UndefOr[Rules] = js.native
}

object UpdateDevicePoolRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePoolRequest]
  }
  @scala.inline
  implicit class UpdateDevicePoolRequestOps[Self <: UpdateDevicePoolRequest] (val x: Self) extends AnyVal {
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
    def setClearMaxDevices(value: Boolean): Self = this.set("clearMaxDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearMaxDevices: Self = this.set("clearMaxDevices", js.undefined)
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMaxDevices(value: Integer): Self = this.set("maxDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDevices: Self = this.set("maxDevices", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Rules): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

