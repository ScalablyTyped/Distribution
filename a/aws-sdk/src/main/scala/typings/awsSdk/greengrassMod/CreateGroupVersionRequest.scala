package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
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
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
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

object CreateGroupVersionRequest {
  @scala.inline
  def apply(
    GroupId: string,
    AmznClientToken: string = null,
    ConnectorDefinitionVersionArn: string = null,
    CoreDefinitionVersionArn: string = null,
    DeviceDefinitionVersionArn: string = null,
    FunctionDefinitionVersionArn: string = null,
    LoggerDefinitionVersionArn: string = null,
    ResourceDefinitionVersionArn: string = null,
    SubscriptionDefinitionVersionArn: string = null
  ): CreateGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (ConnectorDefinitionVersionArn != null) __obj.updateDynamic("ConnectorDefinitionVersionArn")(ConnectorDefinitionVersionArn.asInstanceOf[js.Any])
    if (CoreDefinitionVersionArn != null) __obj.updateDynamic("CoreDefinitionVersionArn")(CoreDefinitionVersionArn.asInstanceOf[js.Any])
    if (DeviceDefinitionVersionArn != null) __obj.updateDynamic("DeviceDefinitionVersionArn")(DeviceDefinitionVersionArn.asInstanceOf[js.Any])
    if (FunctionDefinitionVersionArn != null) __obj.updateDynamic("FunctionDefinitionVersionArn")(FunctionDefinitionVersionArn.asInstanceOf[js.Any])
    if (LoggerDefinitionVersionArn != null) __obj.updateDynamic("LoggerDefinitionVersionArn")(LoggerDefinitionVersionArn.asInstanceOf[js.Any])
    if (ResourceDefinitionVersionArn != null) __obj.updateDynamic("ResourceDefinitionVersionArn")(ResourceDefinitionVersionArn.asInstanceOf[js.Any])
    if (SubscriptionDefinitionVersionArn != null) __obj.updateDynamic("SubscriptionDefinitionVersionArn")(SubscriptionDefinitionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupVersionRequest]
  }
}

