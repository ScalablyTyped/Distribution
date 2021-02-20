package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationArn] = js.native
  
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * The names of the configuration templates associated with this application.
    */
  var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.native
  
  /**
    * The date when the application was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  
  /**
    * The date when the application was last modified.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  
  /**
    * User-defined description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  
  /**
    * The lifecycle settings for the application.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
  
  /**
    * The names of the versions for this application.
    */
  var Versions: js.UndefOr[VersionLabelsList] = js.native
}
object ApplicationDescription {
  
  @scala.inline
  def apply(): ApplicationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescription]
  }
  
  @scala.inline
  implicit class ApplicationDescriptionMutableBuilder[Self <: ApplicationDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setConfigurationTemplates(value: ConfigurationTemplateNamesList): Self = StObject.set(x, "ConfigurationTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTemplatesUndefined: Self = StObject.set(x, "ConfigurationTemplates", js.undefined)
    
    @scala.inline
    def setConfigurationTemplatesVarargs(value: ConfigurationTemplateName*): Self = StObject.set(x, "ConfigurationTemplates", js.Array(value :_*))
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = StObject.set(x, "ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLifecycleConfigUndefined: Self = StObject.set(x, "ResourceLifecycleConfig", js.undefined)
    
    @scala.inline
    def setVersions(value: VersionLabelsList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: VersionLabel*): Self = StObject.set(x, "Versions", js.Array(value :_*))
  }
}
