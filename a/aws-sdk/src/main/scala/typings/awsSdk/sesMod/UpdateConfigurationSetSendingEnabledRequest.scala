package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConfigurationSetSendingEnabledRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to update.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  
  /**
    * Describes whether email sending is enabled or disabled for the configuration set. 
    */
  var Enabled: typings.awsSdk.sesMod.Enabled = js.native
}
object UpdateConfigurationSetSendingEnabledRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, Enabled: Enabled): UpdateConfigurationSetSendingEnabledRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationSetSendingEnabledRequest]
  }
  
  @scala.inline
  implicit class UpdateConfigurationSetSendingEnabledRequestMutableBuilder[Self <: UpdateConfigurationSetSendingEnabledRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
