package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceJobConfig extends StObject {
  
  /**
    * A configuration for an over-the-air (OTA) upgrade. Required for OTA jobs.
    */
  var OTAJobConfig: js.UndefOr[typings.awsSdk.panoramaMod.OTAJobConfig] = js.undefined
}
object DeviceJobConfig {
  
  inline def apply(): DeviceJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceJobConfig]
  }
  
  extension [Self <: DeviceJobConfig](x: Self) {
    
    inline def setOTAJobConfig(value: OTAJobConfig): Self = StObject.set(x, "OTAJobConfig", value.asInstanceOf[js.Any])
    
    inline def setOTAJobConfigUndefined: Self = StObject.set(x, "OTAJobConfig", js.undefined)
  }
}
