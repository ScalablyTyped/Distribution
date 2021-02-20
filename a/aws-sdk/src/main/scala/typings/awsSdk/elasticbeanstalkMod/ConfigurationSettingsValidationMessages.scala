package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationSettingsValidationMessages extends StObject {
  
  /**
    *  A list of ValidationMessage. 
    */
  var Messages: js.UndefOr[ValidationMessagesList] = js.native
}
object ConfigurationSettingsValidationMessages {
  
  @scala.inline
  def apply(): ConfigurationSettingsValidationMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsValidationMessages]
  }
  
  @scala.inline
  implicit class ConfigurationSettingsValidationMessagesMutableBuilder[Self <: ConfigurationSettingsValidationMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: ValidationMessagesList): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: ValidationMessage*): Self = StObject.set(x, "Messages", js.Array(value :_*))
  }
}
