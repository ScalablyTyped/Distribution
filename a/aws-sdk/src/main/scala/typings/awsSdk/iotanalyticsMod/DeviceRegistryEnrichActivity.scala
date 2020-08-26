package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceRegistryEnrichActivity extends js.Object {
  /**
    * The name of the attribute that is added to the message.
    */
  var attribute: AttributeName = js.native
  /**
    * The name of the 'deviceRegistryEnrich' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
  /**
    * The ARN of the role that allows access to the device's registry information.
    */
  var roleArn: RoleArn = js.native
  /**
    * The name of the IoT device whose registry information is added to the message.
    */
  var thingName: AttributeName = js.native
}

object DeviceRegistryEnrichActivity {
  @scala.inline
  def apply(attribute: AttributeName, name: ActivityName, roleArn: RoleArn, thingName: AttributeName): DeviceRegistryEnrichActivity = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRegistryEnrichActivity]
  }
  @scala.inline
  implicit class DeviceRegistryEnrichActivityOps[Self <: DeviceRegistryEnrichActivity] (val x: Self) extends AnyVal {
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
    def setAttribute(value: AttributeName): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ActivityName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: AttributeName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: ActivityName): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

