package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationMessage extends StObject {
  
  /**
    * The name of the application. Must be unique within your account.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName
  
  /**
    * Your description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.undefined
  
  /**
    * Specifies an application resource lifecycle configuration to prevent your application from accumulating too many versions.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
  
  /**
    * Specifies the tags applied to the application. Elastic Beanstalk applies these tags only to the application. Environments that you create in the application don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.undefined
}
object CreateApplicationMessage {
  
  inline def apply(ApplicationName: ApplicationName): CreateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationMessage]
  }
  
  extension [Self <: CreateApplicationMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = StObject.set(x, "ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceLifecycleConfigUndefined: Self = StObject.set(x, "ResourceLifecycleConfig", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
