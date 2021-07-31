package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetMonitoring extends StObject {
  
  /**
    * Enables monitoring for the instance. Default: false 
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object SpotFleetMonitoring {
  
  @scala.inline
  def apply(): SpotFleetMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetMonitoring]
  }
  
  @scala.inline
  implicit class SpotFleetMonitoringMutableBuilder[Self <: SpotFleetMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
