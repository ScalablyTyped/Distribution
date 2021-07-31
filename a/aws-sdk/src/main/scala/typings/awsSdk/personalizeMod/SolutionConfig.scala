package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionConfig extends StObject {
  
  /**
    * Lists the hyperparameter names and ranges.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * The AutoMLConfig object containing a list of recipes to search when AutoML is performed.
    */
  var autoMLConfig: js.UndefOr[AutoMLConfig] = js.undefined
  
  /**
    * Only events with a value greater than or equal to this threshold are used for training a model.
    */
  var eventValueThreshold: js.UndefOr[EventValueThreshold] = js.undefined
  
  /**
    * Lists the feature transformation parameters.
    */
  var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters] = js.undefined
  
  /**
    * Describes the properties for hyperparameter optimization (HPO).
    */
  var hpoConfig: js.UndefOr[HPOConfig] = js.undefined
}
object SolutionConfig {
  
  @scala.inline
  def apply(): SolutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionConfig]
  }
  
  @scala.inline
  implicit class SolutionConfigMutableBuilder[Self <: SolutionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmHyperParameters(value: HyperParameters): Self = StObject.set(x, "algorithmHyperParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmHyperParametersUndefined: Self = StObject.set(x, "algorithmHyperParameters", js.undefined)
    
    @scala.inline
    def setAutoMLConfig(value: AutoMLConfig): Self = StObject.set(x, "autoMLConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMLConfigUndefined: Self = StObject.set(x, "autoMLConfig", js.undefined)
    
    @scala.inline
    def setEventValueThreshold(value: EventValueThreshold): Self = StObject.set(x, "eventValueThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventValueThresholdUndefined: Self = StObject.set(x, "eventValueThreshold", js.undefined)
    
    @scala.inline
    def setFeatureTransformationParameters(value: FeatureTransformationParameters): Self = StObject.set(x, "featureTransformationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTransformationParametersUndefined: Self = StObject.set(x, "featureTransformationParameters", js.undefined)
    
    @scala.inline
    def setHpoConfig(value: HPOConfig): Self = StObject.set(x, "hpoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHpoConfigUndefined: Self = StObject.set(x, "hpoConfig", js.undefined)
  }
}
