package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupVersion extends js.Object {
  /**
    * The ARN of the connector definition version for this group.
    */
  var ConnectorDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the core definition version for this group.
    */
  var CoreDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the device definition version for this group.
    */
  var DeviceDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the function definition version for this group.
    */
  var FunctionDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the logger definition version for this group.
    */
  var LoggerDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the resource definition version for this group.
    */
  var ResourceDefinitionVersionArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the subscription definition version for this group.
    */
  var SubscriptionDefinitionVersionArn: js.UndefOr[string] = js.native
}

object GroupVersion {
  @scala.inline
  def apply(): GroupVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupVersion]
  }
  @scala.inline
  implicit class GroupVersionOps[Self <: GroupVersion] (val x: Self) extends AnyVal {
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
    def setConnectorDefinitionVersionArn(value: string): Self = this.set("ConnectorDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorDefinitionVersionArn: Self = this.set("ConnectorDefinitionVersionArn", js.undefined)
    @scala.inline
    def setCoreDefinitionVersionArn(value: string): Self = this.set("CoreDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoreDefinitionVersionArn: Self = this.set("CoreDefinitionVersionArn", js.undefined)
    @scala.inline
    def setDeviceDefinitionVersionArn(value: string): Self = this.set("DeviceDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDefinitionVersionArn: Self = this.set("DeviceDefinitionVersionArn", js.undefined)
    @scala.inline
    def setFunctionDefinitionVersionArn(value: string): Self = this.set("FunctionDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionDefinitionVersionArn: Self = this.set("FunctionDefinitionVersionArn", js.undefined)
    @scala.inline
    def setLoggerDefinitionVersionArn(value: string): Self = this.set("LoggerDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggerDefinitionVersionArn: Self = this.set("LoggerDefinitionVersionArn", js.undefined)
    @scala.inline
    def setResourceDefinitionVersionArn(value: string): Self = this.set("ResourceDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceDefinitionVersionArn: Self = this.set("ResourceDefinitionVersionArn", js.undefined)
    @scala.inline
    def setSubscriptionDefinitionVersionArn(value: string): Self = this.set("SubscriptionDefinitionVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionDefinitionVersionArn: Self = this.set("SubscriptionDefinitionVersionArn", js.undefined)
  }
  
}

