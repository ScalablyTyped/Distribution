package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlatformVersionRequest extends StObject {
  
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
  implicit class CreatePlatformVersionRequestMutableBuilder[Self <: CreatePlatformVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    @scala.inline
    def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setPlatformDefinitionBundle(value: S3Location): Self = StObject.set(x, "PlatformDefinitionBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformName(value: PlatformName): Self = StObject.set(x, "PlatformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersion(value: PlatformVersion): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
