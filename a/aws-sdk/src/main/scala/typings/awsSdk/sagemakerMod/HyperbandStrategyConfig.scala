package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperbandStrategyConfig extends StObject {
  
  /**
    * The maximum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter tuning job. Once a job reaches the MaxResource value, it is stopped. If a value for MaxResource is not provided, and Hyperband is selected as the hyperparameter tuning strategy, HyperbandTrainingJ attempts to infer MaxResource from the following keys (if present) in StaticsHyperParameters:    epochs     numepochs     n-epochs     n_epochs     num_epochs    If HyperbandStrategyConfig is unable to infer a value for MaxResource, it generates a validation error. The maximum value is 20,000 epochs. All metrics that correspond to an objective metric are used to derive early stopping decisions. For distributive training jobs, ensure that duplicate metrics are not printed in the logs across the individual nodes in a training job. If multiple nodes are publishing duplicate or incorrect metrics, training jobs may make an incorrect stopping decision and stop the job prematurely. 
    */
  var MaxResource: js.UndefOr[HyperbandStrategyMaxResource] = js.undefined
  
  /**
    * The minimum number of resources (such as epochs) that can be used by a training job launched by a hyperparameter tuning job. If the value for MinResource has not been reached, the training job will not be stopped by Hyperband.
    */
  var MinResource: js.UndefOr[HyperbandStrategyMinResource] = js.undefined
}
object HyperbandStrategyConfig {
  
  inline def apply(): HyperbandStrategyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperbandStrategyConfig]
  }
  
  extension [Self <: HyperbandStrategyConfig](x: Self) {
    
    inline def setMaxResource(value: HyperbandStrategyMaxResource): Self = StObject.set(x, "MaxResource", value.asInstanceOf[js.Any])
    
    inline def setMaxResourceUndefined: Self = StObject.set(x, "MaxResource", js.undefined)
    
    inline def setMinResource(value: HyperbandStrategyMinResource): Self = StObject.set(x, "MinResource", value.asInstanceOf[js.Any])
    
    inline def setMinResourceUndefined: Self = StObject.set(x, "MinResource", js.undefined)
  }
}
