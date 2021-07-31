package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplatesMonitoring extends StObject {
  
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object LaunchTemplatesMonitoring {
  
  @scala.inline
  def apply(): LaunchTemplatesMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatesMonitoring]
  }
  
  @scala.inline
  implicit class LaunchTemplatesMonitoringMutableBuilder[Self <: LaunchTemplatesMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
