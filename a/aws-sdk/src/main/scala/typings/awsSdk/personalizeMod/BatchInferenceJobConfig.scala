package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchInferenceJobConfig extends StObject {
  
  /**
    * A string to string map specifying the inference hyperparameters you wish to use for hyperparameter optimization. See customizing-solution-config-hpo.
    */
  var itemExplorationConfig: js.UndefOr[HyperParameters] = js.undefined
}
object BatchInferenceJobConfig {
  
  inline def apply(): BatchInferenceJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchInferenceJobConfig]
  }
  
  extension [Self <: BatchInferenceJobConfig](x: Self) {
    
    inline def setItemExplorationConfig(value: HyperParameters): Self = StObject.set(x, "itemExplorationConfig", value.asInstanceOf[js.Any])
    
    inline def setItemExplorationConfigUndefined: Self = StObject.set(x, "itemExplorationConfig", js.undefined)
  }
}
