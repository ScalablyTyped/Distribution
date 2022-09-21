package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInferenceRecommendationsJobRequest extends StObject {
  
  /**
    * Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and endpoint configurations.
    */
  var InputConfig: RecommendationJobInputConfig
  
  /**
    * Description of the recommendation job.
    */
  var JobDescription: js.UndefOr[RecommendationJobDescription] = js.undefined
  
  /**
    * A name for the recommendation job. The name must be unique within the Amazon Web Services Region and within your Amazon Web Services account.
    */
  var JobName: RecommendationJobName
  
  /**
    * Defines the type of recommendation job. Specify Default to initiate an instance recommendation and Advanced to initiate a load test. If left unspecified, Amazon SageMaker Inference Recommender will run an instance recommendation (DEFAULT) job.
    */
  var JobType: RecommendationJobType
  
  /**
    * Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side encryption.
    */
  var OutputConfig: js.UndefOr[RecommendationJobOutputConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is automatically stopped.
    */
  var StoppingConditions: js.UndefOr[RecommendationJobStoppingConditions] = js.undefined
  
  /**
    * The metadata that you apply to Amazon Web Services resources to help you categorize and organize them. Each tag consists of a key and a value, both of which you define. For more information, see Tagging Amazon Web Services Resources in the Amazon Web Services General Reference.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateInferenceRecommendationsJobRequest {
  
  inline def apply(
    InputConfig: RecommendationJobInputConfig,
    JobName: RecommendationJobName,
    JobType: RecommendationJobType,
    RoleArn: RoleArn
  ): CreateInferenceRecommendationsJobRequest = {
    val __obj = js.Dynamic.literal(InputConfig = InputConfig.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInferenceRecommendationsJobRequest]
  }
  
  extension [Self <: CreateInferenceRecommendationsJobRequest](x: Self) {
    
    inline def setInputConfig(value: RecommendationJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobDescription(value: RecommendationJobDescription): Self = StObject.set(x, "JobDescription", value.asInstanceOf[js.Any])
    
    inline def setJobDescriptionUndefined: Self = StObject.set(x, "JobDescription", js.undefined)
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: RecommendationJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: RecommendationJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditions(value: RecommendationJobStoppingConditions): Self = StObject.set(x, "StoppingConditions", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionsUndefined: Self = StObject.set(x, "StoppingConditions", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
