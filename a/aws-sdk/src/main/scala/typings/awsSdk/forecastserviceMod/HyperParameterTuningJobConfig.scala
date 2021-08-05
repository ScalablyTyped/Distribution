package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobConfig extends StObject {
  
  /**
    * Specifies the ranges of valid values for the hyperparameters.
    */
  var ParameterRanges: js.UndefOr[typings.awsSdk.forecastserviceMod.ParameterRanges] = js.undefined
}
object HyperParameterTuningJobConfig {
  
  inline def apply(): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
  
  extension [Self <: HyperParameterTuningJobConfig](x: Self) {
    
    inline def setParameterRanges(value: ParameterRanges): Self = StObject.set(x, "ParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setParameterRangesUndefined: Self = StObject.set(x, "ParameterRanges", js.undefined)
  }
}
