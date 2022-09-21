package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDescription extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationArn] = js.undefined
  
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The names of the configuration templates associated with this application.
    */
  var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.undefined
  
  /**
    * The date when the application was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date when the application was last modified.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * User-defined description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.undefined
  
  /**
    * The lifecycle settings for the application.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
  
  /**
    * The names of the versions for this application.
    */
  var Versions: js.UndefOr[VersionLabelsList] = js.undefined
}
object ApplicationDescription {
  
  inline def apply(): ApplicationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescription]
  }
  
  extension [Self <: ApplicationDescription](x: Self) {
    
    inline def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setConfigurationTemplates(value: ConfigurationTemplateNamesList): Self = StObject.set(x, "ConfigurationTemplates", value.asInstanceOf[js.Any])
    
    inline def setConfigurationTemplatesUndefined: Self = StObject.set(x, "ConfigurationTemplates", js.undefined)
    
    inline def setConfigurationTemplatesVarargs(value: ConfigurationTemplateName*): Self = StObject.set(x, "ConfigurationTemplates", js.Array(value*))
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = StObject.set(x, "ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceLifecycleConfigUndefined: Self = StObject.set(x, "ResourceLifecycleConfig", js.undefined)
    
    inline def setVersions(value: VersionLabelsList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: VersionLabel*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
