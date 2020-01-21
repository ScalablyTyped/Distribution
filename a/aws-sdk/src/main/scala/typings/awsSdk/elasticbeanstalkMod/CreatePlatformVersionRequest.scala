package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformVersionRequest extends js.Object {
  /**
    * The name of the builder environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The configuration option settings to apply to the builder environment.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * The location of the platform definition archive in Amazon S3.
    */
  var PlatformDefinitionBundle: S3Location = js.native
  /**
    * The name of your custom platform.
    */
  var PlatformName: typings.awsSdk.elasticbeanstalkMod.PlatformName = js.native
  /**
    * The number, such as 1.0.2, for the new platform version.
    */
  var PlatformVersion: typings.awsSdk.elasticbeanstalkMod.PlatformVersion = js.native
  /**
    * Specifies the tags applied to the new platform version. Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the platform version don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.native
}

object CreatePlatformVersionRequest {
  @scala.inline
  def apply(
    PlatformDefinitionBundle: S3Location,
    PlatformName: PlatformName,
    PlatformVersion: PlatformVersion,
    EnvironmentName: EnvironmentName = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    Tags: Tags = null
  ): CreatePlatformVersionRequest = {
    val __obj = js.Dynamic.literal(PlatformDefinitionBundle = PlatformDefinitionBundle.asInstanceOf[js.Any], PlatformName = PlatformName.asInstanceOf[js.Any], PlatformVersion = PlatformVersion.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformVersionRequest]
  }
}

