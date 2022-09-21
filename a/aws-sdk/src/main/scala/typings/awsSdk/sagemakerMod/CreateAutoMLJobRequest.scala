package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoMLJobRequest extends StObject {
  
  /**
    * A collection of settings used to configure an AutoML job.
    */
  var AutoMLJobConfig: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobConfig] = js.undefined
  
  /**
    * Identifies an Autopilot job. The name must be unique to your account and is case-insensitive.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName
  
  /**
    * Defines the objective metric used to measure the predictive quality of an AutoML job. You provide an AutoMLJobObjective$MetricName and Autopilot infers whether to minimize or maximize it.
    */
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobObjective] = js.undefined
  
  /**
    * Generates possible candidates without training the models. A candidate is a combination of data preprocessors, algorithms, and algorithm parameter settings.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typings.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.undefined
  
  /**
    * An array of channel objects that describes the input data and its location. Each channel is a named input source. Similar to InputDataConfig supported by . Format(s) supported: CSV, Parquet. A minimum of 500 rows is required for the training dataset. There is not a minimum number of rows required for the validation dataset.
    */
  var InputDataConfig: AutoMLInputDataConfig
  
  /**
    * Specifies how to generate the endpoint name for an automatic one-click Autopilot model deployment.
    */
  var ModelDeployConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ModelDeployConfig] = js.undefined
  
  /**
    * Provides information about encryption and the Amazon S3 output path needed to store artifacts from an AutoML job. Format(s) supported: CSV.
    */
  var OutputDataConfig: AutoMLOutputDataConfig
  
  /**
    * Defines the type of supervised learning available for the candidates. For more information, see  Amazon SageMaker Autopilot problem types and algorithm support.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.sagemakerMod.ProblemType] = js.undefined
  
  /**
    * The ARN of the role that is used to access the data.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAutoMLJobRequest {
  
  inline def apply(
    AutoMLJobName: AutoMLJobName,
    InputDataConfig: AutoMLInputDataConfig,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn
  ): CreateAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobRequest]
  }
  
  extension [Self <: CreateAutoMLJobRequest](x: Self) {
    
    inline def setAutoMLJobConfig(value: AutoMLJobConfig): Self = StObject.set(x, "AutoMLJobConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobConfigUndefined: Self = StObject.set(x, "AutoMLJobConfig", js.undefined)
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjective(value: AutoMLJobObjective): Self = StObject.set(x, "AutoMLJobObjective", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobObjectiveUndefined: Self = StObject.set(x, "AutoMLJobObjective", js.undefined)
    
    inline def setGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", value.asInstanceOf[js.Any])
    
    inline def setGenerateCandidateDefinitionsOnlyUndefined: Self = StObject.set(x, "GenerateCandidateDefinitionsOnly", js.undefined)
    
    inline def setInputDataConfig(value: AutoMLInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigVarargs(value: AutoMLChannel*): Self = StObject.set(x, "InputDataConfig", js.Array(value*))
    
    inline def setModelDeployConfig(value: ModelDeployConfig): Self = StObject.set(x, "ModelDeployConfig", value.asInstanceOf[js.Any])
    
    inline def setModelDeployConfigUndefined: Self = StObject.set(x, "ModelDeployConfig", js.undefined)
    
    inline def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setProblemType(value: ProblemType): Self = StObject.set(x, "ProblemType", value.asInstanceOf[js.Any])
    
    inline def setProblemTypeUndefined: Self = StObject.set(x, "ProblemType", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
