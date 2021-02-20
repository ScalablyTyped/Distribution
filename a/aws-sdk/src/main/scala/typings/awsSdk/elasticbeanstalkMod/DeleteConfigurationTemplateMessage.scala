package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConfigurationTemplateMessage extends StObject {
  
  /**
    * The name of the application to delete the configuration template from.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  
  /**
    * The name of the configuration template to delete.
    */
  var TemplateName: ConfigurationTemplateName = js.native
}
object DeleteConfigurationTemplateMessage {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): DeleteConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationTemplateMessage]
  }
  
  @scala.inline
  implicit class DeleteConfigurationTemplateMessageMutableBuilder[Self <: DeleteConfigurationTemplateMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
