package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmSpecification extends StObject {
  
  /**
    * The name of the algorithm resource to use for the training job. This must be an algorithm resource that you created or subscribe to on AWS Marketplace. If you specify a value for this parameter, you can't specify a value for TrainingImage.
    */
  var AlgorithmName: js.UndefOr[ArnOrName] = js.undefined
  
  /**
    * To generate and save time-series metrics during training, set to true. The default is false and time-series metrics aren't generated except in the following cases:   You use one of the Amazon SageMaker built-in algorithms   You use one of the following Prebuilt Amazon SageMaker Docker Images:   Tensorflow (version &gt;= 1.15)   MXNet (version &gt;= 1.6)   PyTorch (version &gt;= 1.3)     You specify at least one MetricDefinition   
    */
  var EnableSageMakerMetricsTimeSeries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of metric definition objects. Each object specifies the metric name and regular expressions used to parse algorithm logs. Amazon SageMaker publishes each metric to Amazon CloudWatch.
    */
  var MetricDefinitions: js.UndefOr[MetricDefinitionList] = js.undefined
  
  /**
    * The registry path of the Docker image that contains the training algorithm. For information about docker registry paths for built-in algorithms, see Algorithms Provided by Amazon SageMaker: Common Parameters. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var TrainingImage: js.UndefOr[AlgorithmImage] = js.undefined
  
  /**
    * The input mode that the algorithm supports. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.   In File mode, make sure you provision ML storage volume with sufficient capacity to accommodate the data download from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm container use ML storage volume to also store intermediate information, if any.   For distributed algorithms using File mode, training data is distributed uniformly, and your training duration is predictable if the input data objects size is approximately same. Amazon SageMaker does not split the files any further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is also skewed where one host in a training cluster is overloaded, thus becoming bottleneck in training. 
    */
  var TrainingInputMode: typings.awsSdk.sagemakerMod.TrainingInputMode
}
object AlgorithmSpecification {
  
  inline def apply(TrainingInputMode: TrainingInputMode): AlgorithmSpecification = {
    val __obj = js.Dynamic.literal(TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSpecification]
  }
  
  extension [Self <: AlgorithmSpecification](x: Self) {
    
    inline def setAlgorithmName(value: ArnOrName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNameUndefined: Self = StObject.set(x, "AlgorithmName", js.undefined)
    
    inline def setEnableSageMakerMetricsTimeSeries(value: Boolean): Self = StObject.set(x, "EnableSageMakerMetricsTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setEnableSageMakerMetricsTimeSeriesUndefined: Self = StObject.set(x, "EnableSageMakerMetricsTimeSeries", js.undefined)
    
    inline def setMetricDefinitions(value: MetricDefinitionList): Self = StObject.set(x, "MetricDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionsUndefined: Self = StObject.set(x, "MetricDefinitions", js.undefined)
    
    inline def setMetricDefinitionsVarargs(value: MetricDefinition*): Self = StObject.set(x, "MetricDefinitions", js.Array(value :_*))
    
    inline def setTrainingImage(value: AlgorithmImage): Self = StObject.set(x, "TrainingImage", value.asInstanceOf[js.Any])
    
    inline def setTrainingImageUndefined: Self = StObject.set(x, "TrainingImage", js.undefined)
    
    inline def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "TrainingInputMode", value.asInstanceOf[js.Any])
  }
}
