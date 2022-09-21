package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPreProcessingConfiguration extends StObject {
  
  /**
    * The sampling rate of the data after post processing by Amazon Lookout for Equipment. For example, if you provide data that has been collected at a 1 second level and you want the system to resample the data at a 1 minute rate before training, the TargetSamplingRate is 1 minute. When providing a value for the TargetSamplingRate, you must attach the prefix "PT" to the rate you want. The value for a 1 second rate is therefore PT1S, the value for a 15 minute rate is PT15M, and the value for a 1 hour rate is PT1H 
    */
  var TargetSamplingRate: js.UndefOr[typings.awsSdk.lookoutequipmentMod.TargetSamplingRate] = js.undefined
}
object DataPreProcessingConfiguration {
  
  inline def apply(): DataPreProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPreProcessingConfiguration]
  }
  
  extension [Self <: DataPreProcessingConfiguration](x: Self) {
    
    inline def setTargetSamplingRate(value: TargetSamplingRate): Self = StObject.set(x, "TargetSamplingRate", value.asInstanceOf[js.Any])
    
    inline def setTargetSamplingRateUndefined: Self = StObject.set(x, "TargetSamplingRate", js.undefined)
  }
}
