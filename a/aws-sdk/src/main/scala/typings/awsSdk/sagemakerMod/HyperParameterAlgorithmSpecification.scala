package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterAlgorithmSpecification extends StObject {
  
  /**
    * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this parameter, do not specify a value for TrainingImage.
    */
  var AlgorithmName: js.UndefOr[ArnOrName] = js.undefined
  
  /**
    * An array of MetricDefinition objects that specify the metrics that the algorithm emits.
    */
  var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
  
  /**
    *  The registry path of the Docker image that contains the training algorithm. For information about Docker registry paths for built-in algorithms, see Algorithms Provided by Amazon SageMaker: Common Parameters. SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
  
  var TrainingInputMode: typings.awsSdk.sagemakerMod.TrainingInputMode
}
object HyperParameterAlgorithmSpecification {
  
  inline def apply(TrainingInputMode: TrainingInputMode): HyperParameterAlgorithmSpecification = {
    val __obj = js.Dynamic.literal(TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterAlgorithmSpecification]
  }
  
  extension [Self <: HyperParameterAlgorithmSpecification](x: Self) {
    
    inline def setAlgorithmName(value: ArnOrName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    inline def setMetricDefinitions(value: MetricDefinitionList): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    inline def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value*))
    
    inline def setTrainingImage(value: AlgorithmImage): Self = StObject.set(x, "TrainingImage", value.asInstanceOf[js.Any])
    
    inline def setTrainingImageUndefined: Self = StObject.set(x, "TrainingImage", js.undefined)
    
    inline def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "TrainingInputMode", value.asInstanceOf[js.Any])
  }
}
