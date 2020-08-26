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
  def apply(PlatformDefinitionBundle: S3Location, PlatformName: PlatformName, PlatformVersion: PlatformVersion): CreatePlatformVersionRequest = {
    val __obj = js.Dynamic.literal(PlatformDefinitionBundle = PlatformDefinitionBundle.asInstanceOf[js.Any], PlatformName = PlatformName.asInstanceOf[js.Any], PlatformVersion = PlatformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformVersionRequest]
  }
  @scala.inline
  implicit class CreatePlatformVersionRequestOps[Self <: CreatePlatformVersionRequest] (val x: Self) extends AnyVal {
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
    def setPlatformDefinitionBundle(value: S3Location): Self = this.set("PlatformDefinitionBundle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformName(value: PlatformName): Self = this.set("PlatformName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformVersion(value: PlatformVersion): Self = this.set("PlatformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = this.set("OptionSettings", js.Array(value :_*))
    @scala.inline
    def setOptionSettings(value: ConfigurationOptionSettingsList): Self = this.set("OptionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionSettings: Self = this.set("OptionSettings", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

