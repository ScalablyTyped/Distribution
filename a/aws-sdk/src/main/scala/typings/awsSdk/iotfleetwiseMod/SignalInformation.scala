package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalInformation extends StObject {
  
  /**
    * The maximum number of samples to collect.
    */
  var maxSampleCount: js.UndefOr[typings.awsSdk.iotfleetwiseMod.maxSampleCount] = js.undefined
  
  /**
    * The minimum duration of time (in milliseconds) between two triggering events to collect data.  If a signal changes often, you might want to collect data at a slower rate. 
    */
  var minimumSamplingIntervalMs: js.UndefOr[uint32] = js.undefined
  
  /**
    * The name of the signal.
    */
  var name: wildcardSignalName
}
object SignalInformation {
  
  inline def apply(name: wildcardSignalName): SignalInformation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalInformation]
  }
  
  extension [Self <: SignalInformation](x: Self) {
    
    inline def setMaxSampleCount(value: maxSampleCount): Self = StObject.set(x, "maxSampleCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSampleCountUndefined: Self = StObject.set(x, "maxSampleCount", js.undefined)
    
    inline def setMinimumSamplingIntervalMs(value: uint32): Self = StObject.set(x, "minimumSamplingIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setMinimumSamplingIntervalMsUndefined: Self = StObject.set(x, "minimumSamplingIntervalMs", js.undefined)
    
    inline def setName(value: wildcardSignalName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
