package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecurityHubConfigurationRequest extends StObject {
  
  /**
    * Whether to automatically enable new controls when they are added to standards that are enabled. By default, this is set to true, and new controls are enabled automatically. To not automatically enable new controls, set this to false. 
    */
  var AutoEnableControls: js.UndefOr[Boolean] = js.native
}
object UpdateSecurityHubConfigurationRequest {
  
  @scala.inline
  def apply(): UpdateSecurityHubConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityHubConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateSecurityHubConfigurationRequestMutableBuilder[Self <: UpdateSecurityHubConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnableControls(value: Boolean): Self = StObject.set(x, "AutoEnableControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEnableControlsUndefined: Self = StObject.set(x, "AutoEnableControls", js.undefined)
  }
}
