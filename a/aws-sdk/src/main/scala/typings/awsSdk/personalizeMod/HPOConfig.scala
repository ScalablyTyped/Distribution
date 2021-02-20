package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HPOConfig extends StObject {
  
  /**
    * The hyperparameters and their allowable ranges.
    */
  var algorithmHyperParameterRanges: js.UndefOr[HyperParameterRanges] = js.native
  
  /**
    * The metric to optimize during HPO.
    */
  var hpoObjective: js.UndefOr[HPOObjective] = js.native
  
  /**
    * Describes the resource configuration for HPO.
    */
  var hpoResourceConfig: js.UndefOr[HPOResourceConfig] = js.native
}
object HPOConfig {
  
  @scala.inline
  def apply(): HPOConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOConfig]
  }
  
  @scala.inline
  implicit class HPOConfigMutableBuilder[Self <: HPOConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmHyperParameterRanges(value: HyperParameterRanges): Self = StObject.set(x, "algorithmHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmHyperParameterRangesUndefined: Self = StObject.set(x, "algorithmHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setHpoObjective(value: HPOObjective): Self = StObject.set(x, "hpoObjective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHpoObjectiveUndefined: Self = StObject.set(x, "hpoObjective", js.undefined)
    
    @scala.inline
    def setHpoResourceConfig(value: HPOResourceConfig): Self = StObject.set(x, "hpoResourceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHpoResourceConfigUndefined: Self = StObject.set(x, "hpoResourceConfig", js.undefined)
  }
}
