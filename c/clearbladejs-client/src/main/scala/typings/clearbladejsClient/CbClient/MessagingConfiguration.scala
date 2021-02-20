package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingConfiguration extends CommonMessagingProperties {
  
  var password: String = js.native
  
  var userName: String = js.native
}
object MessagingConfiguration {
  
  @scala.inline
  def apply(password: String, userName: String): MessagingConfiguration = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingConfiguration]
  }
  
  @scala.inline
  implicit class MessagingConfigurationMutableBuilder[Self <: MessagingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
