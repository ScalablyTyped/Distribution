package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterAlgorithmSpecification extends StObject {
  
  /**
    * The name of the resource algorithm to use for the hyperparameter tuning job. If you specify a value for this parameter, do not specify a value for TrainingImage.
    */
  var AlgorithmName: js.UndefOr[ArnOrName] = js.native
  
  /**
    * An array of MetricDefinition objects that specify the metrics that the algorithm emits.
    */
  var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.native
  
  /**
    *  The registry path of the Docker image that contains the training algorithm. For information about Docker registry paths for built-in algorithms, see Algorithms Provided by Amazon SageMaker: Common Parameters. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var TrainingImage: js.UndefOr[AlgorithmImage] = js.native
  
  /**
    * The input mode that the algorithm supports: File or Pipe. In File input mode, Amazon SageMaker downloads the training data from Amazon S3 to the storage volume that is attached to the training instance and mounts the directory to the Docker volume for the training container. In Pipe input mode, Amazon SageMaker streams data directly from Amazon S3 to the container.  If you specify File mode, make sure that you provision the storage volume that is attached to the training instance with enough capacity to accommodate the training data downloaded from Amazon S3, the model artifacts, and intermediate information.  For more information about input modes, see Algorithms. 
    */
  var TrainingInputMode: typings.awsSdk.sagemakerMod.TrainingInputMode = js.native
}
object HyperParameterAlgorithmSpecification {
  
  @scala.inline
  def apply(TrainingInputMode: TrainingInputMode): HyperParameterAlgorithmSpecification = {
    val __obj = js.Dynamic.literal(TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterAlgorithmSpecification]
  }
  
  @scala.inline
  implicit class HyperParameterAlgorithmSpecificationMutableBuilder[Self <: HyperParameterAlgorithmSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: ArnOrName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    @scala.inline
    def setMetricDefinitions(value: MetricDefinitionList): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    @scala.inline
    def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setTrainingImage(value: AlgorithmImage): Self = StObject.set(x, "TrainingImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingImageUndefined: Self = StObject.set(x, "TrainingImage", js.undefined)
    
    @scala.inline
    def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "TrainingInputMode", value.asInstanceOf[js.Any])
  }
}
