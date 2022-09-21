package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementProcessingConfig extends StObject {
  
  /**
    * The forwarding configuration for the given measurement property. 
    */
  var forwardingConfig: ForwardingConfig
}
object MeasurementProcessingConfig {
  
  inline def apply(forwardingConfig: ForwardingConfig): MeasurementProcessingConfig = {
    val __obj = js.Dynamic.literal(forwardingConfig = forwardingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasurementProcessingConfig]
  }
  
  extension [Self <: MeasurementProcessingConfig](x: Self) {
    
    inline def setForwardingConfig(value: ForwardingConfig): Self = StObject.set(x, "forwardingConfig", value.asInstanceOf[js.Any])
  }
}
