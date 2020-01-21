package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSystemInstanceRequest extends js.Object {
  var definition: DefinitionDocument = js.native
  /**
    * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This value is required if the value of the target parameter is CLOUD.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The name of the Greengrass group where the system instance will be deployed. This value is required if the value of the target parameter is GREENGRASS.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  /**
    * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's resource file. This value is required if the value of the target parameter is GREENGRASS.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The target type of the deployment. Valid values are GREENGRASS and CLOUD.
    */
  var target: DeploymentTarget = js.native
}

object CreateSystemInstanceRequest {
  @scala.inline
  def apply(
    definition: DefinitionDocument,
    target: DeploymentTarget,
    flowActionsRoleArn: RoleArn = null,
    greengrassGroupName: GroupName = null,
    metricsConfiguration: MetricsConfiguration = null,
    s3BucketName: S3BucketName = null,
    tags: TagList = null
  ): CreateSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (flowActionsRoleArn != null) __obj.updateDynamic("flowActionsRoleArn")(flowActionsRoleArn.asInstanceOf[js.Any])
    if (greengrassGroupName != null) __obj.updateDynamic("greengrassGroupName")(greengrassGroupName.asInstanceOf[js.Any])
    if (metricsConfiguration != null) __obj.updateDynamic("metricsConfiguration")(metricsConfiguration.asInstanceOf[js.Any])
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemInstanceRequest]
  }
}

