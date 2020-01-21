package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfrastructureConfigurationRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the infrastructure configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that you wish to update. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    *  The instance profile to associate with the instance used to customize your EC2 AMI. 
    */
  var instanceProfileName: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The instance types of the infrastructure configuration. You may specify one or more instance types to use for this build, the service will pick one of these instance types based on availability. 
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  /**
    *  The key pair of the infrastructure configuration. This can be used to log onto and debug the instance used to create your image. 
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The logging configuration of the infrastructure configuration. 
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    *  The security group IDs to associate with the instance used to customize your EC2 AMI. 
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  /**
    *  The SNS topic on which to send image build events. 
    */
  var snsTopicArn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The subnet ID to place the instance used to customize your EC2 AMI in. 
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The terminate instance on failure setting of the infrastructure configuration. Set to false if you wish for Image Builder to retain the instance used to configure your AMI in the event that the build or test phase of your workflow failed. 
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}

object UpdateInfrastructureConfigurationRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    description: NonEmptyString = null,
    instanceProfileName: NonEmptyString = null,
    instanceTypes: InstanceTypeList = null,
    keyPair: NonEmptyString = null,
    logging: Logging = null,
    securityGroupIds: SecurityGroupIds = null,
    snsTopicArn: NonEmptyString = null,
    subnetId: NonEmptyString = null,
    terminateInstanceOnFailure: js.UndefOr[Boolean] = js.undefined
  ): UpdateInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (instanceProfileName != null) __obj.updateDynamic("instanceProfileName")(instanceProfileName.asInstanceOf[js.Any])
    if (instanceTypes != null) __obj.updateDynamic("instanceTypes")(instanceTypes.asInstanceOf[js.Any])
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (snsTopicArn != null) __obj.updateDynamic("snsTopicArn")(snsTopicArn.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (!js.isUndefined(terminateInstanceOnFailure)) __obj.updateDynamic("terminateInstanceOnFailure")(terminateInstanceOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfrastructureConfigurationRequest]
  }
}

