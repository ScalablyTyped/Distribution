package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConfigurationItem extends js.Object {
  /**
    * The 12-digit AWS account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[ARN] = js.native
  /**
    * The Availability Zone associated with the resource.
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.native
  /**
    * The region where the resource resides.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.native
  /**
    * The description of the resource configuration.
    */
  var configuration: js.UndefOr[Configuration] = js.native
  /**
    * The time when the configuration recording was initiated.
    */
  var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.native
  /**
    * The configuration item status.
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.native
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.native
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.native
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The custom name of the resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The type of AWS resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
    */
  var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.native
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.native
}

object BaseConfigurationItem {
  @scala.inline
  def apply(
    accountId: AccountId = null,
    arn: ARN = null,
    availabilityZone: AvailabilityZone = null,
    awsRegion: AwsRegion = null,
    configuration: Configuration = null,
    configurationItemCaptureTime: ConfigurationItemCaptureTime = null,
    configurationItemStatus: ConfigurationItemStatus = null,
    configurationStateId: ConfigurationStateId = null,
    resourceCreationTime: ResourceCreationTime = null,
    resourceId: ResourceId = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null,
    supplementaryConfiguration: SupplementaryConfiguration = null,
    version: Version = null
  ): BaseConfigurationItem = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (configurationItemCaptureTime != null) __obj.updateDynamic("configurationItemCaptureTime")(configurationItemCaptureTime.asInstanceOf[js.Any])
    if (configurationItemStatus != null) __obj.updateDynamic("configurationItemStatus")(configurationItemStatus.asInstanceOf[js.Any])
    if (configurationStateId != null) __obj.updateDynamic("configurationStateId")(configurationStateId.asInstanceOf[js.Any])
    if (resourceCreationTime != null) __obj.updateDynamic("resourceCreationTime")(resourceCreationTime.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supplementaryConfiguration != null) __obj.updateDynamic("supplementaryConfiguration")(supplementaryConfiguration.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConfigurationItem]
  }
}

