package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConfiguration extends StObject {
  
  /**
    * The name of the application associated with the configuration.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The name of the configuration template.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
}
object SourceConfiguration {
  
  @scala.inline
  def apply(): SourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfiguration]
  }
  
  @scala.inline
  implicit class SourceConfigurationMutableBuilder[Self <: SourceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
