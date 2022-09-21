package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HPOConfig extends StObject {
  
  /**
    * The hyperparameters and their allowable ranges.
    */
  var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges] = js.undefined
  
  /**
    * The metric to optimize during HPO.  Amazon Personalize doesn't support configuring the hpoObjective at this time. 
    */
  var hpoObjective: js.UndefOr[HPOObjective] = js.undefined
  
  /**
    * Describes the resource configuration for HPO.
    */
  var hpoResourceConfig: js.UndefOr[HPOResourceConfig] = js.undefined
}
object HPOConfig {
  
  inline def apply(): HPOConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOConfig]
  }
  
  extension [Self <: HPOConfig](x: Self) {
    
    inline def setAlgorithmHyperParameterRanges(value: HyperParameterRanges): Self = StObject.set(x, "algorithmHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmHyperParameterRangesUndefined: Self = StObject.set(x, "algorithmHyperParameterRanges", js.undefined)
    
    inline def setHpoObjective(value: HPOObjective): Self = StObject.set(x, "hpoObjective", value.asInstanceOf[js.Any])
    
    inline def setHpoObjectiveUndefined: Self = StObject.set(x, "hpoObjective", js.undefined)
    
    inline def setHpoResourceConfig(value: HPOResourceConfig): Self = StObject.set(x, "hpoResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setHpoResourceConfigUndefined: Self = StObject.set(x, "hpoResourceConfig", js.undefined)
  }
}
