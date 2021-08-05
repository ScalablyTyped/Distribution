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
  
  inline def apply(): SpotFleetMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetMonitoring]
  }
  
  extension [Self <: SpotFleetMonitoring](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
