package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevicePoolRequest extends js.Object {
  /**
    * The device pool's description.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
  /**
    * The device pool's name.
    */
  var name: Name = js.native
  /**
    * The ARN of the project for the device pool.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * The device pool's rules.
    */
  var rules: Rules = js.native
}

object CreateDevicePoolRequest {
  @scala.inline
  def apply(name: Name, projectArn: AmazonResourceName, rules: Rules): CreateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevicePoolRequest]
  }
  @scala.inline
  implicit class CreateDevicePoolRequestOps[Self <: CreateDevicePoolRequest] (val x: Self) extends AnyVal {
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectArn(value: AmazonResourceName): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Rules): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMaxDevices(value: Integer): Self = this.set("maxDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDevices: Self = this.set("maxDevices", js.undefined)
  }
  
}

