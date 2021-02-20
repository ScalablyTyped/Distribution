package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplatesMonitoringRequest extends StObject {
  
  /**
    * Specify true to enable detailed monitoring. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object LaunchTemplatesMonitoringRequest {
  
  @scala.inline
  def apply(): LaunchTemplatesMonitoringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatesMonitoringRequest]
  }
  
  @scala.inline
  implicit class LaunchTemplatesMonitoringRequestMutableBuilder[Self <: LaunchTemplatesMonitoringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
