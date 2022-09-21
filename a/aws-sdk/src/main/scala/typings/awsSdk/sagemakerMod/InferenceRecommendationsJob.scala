package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceRecommendationsJob extends StObject {
  
  /**
    * A timestamp that shows when the job completed.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.Date
  
  /**
    * If the job fails, provides information why the job failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the recommendation job.
    */
  var JobArn: RecommendationJobArn
  
  /**
    * The job description.
    */
  var JobDescription: RecommendationJobDescription
  
  /**
    * The name of the job.
    */
  var JobName: RecommendationJobName
  
  /**
    * The recommendation job type.
    */
  var JobType: RecommendationJobType
  
  /**
    * A timestamp that shows when the job was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * The status of the job.
    */
  var Status: RecommendationJobStatus
}
object InferenceRecommendationsJob {
  
  inline def apply(
    CreationTime: js.Date,
    JobArn: RecommendationJobArn,
    JobDescription: RecommendationJobDescription,
    JobName: RecommendationJobName,
    JobType: RecommendationJobType,
    LastModifiedTime: js.Date,
    RoleArn: RoleArn,
    Status: RecommendationJobStatus
  ): InferenceRecommendationsJob = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobArn = JobArn.asInstanceOf[js.Any], JobDescription = JobDescription.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceRecommendationsJob]
  }
  
  extension [Self <: InferenceRecommendationsJob](x: Self) {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setJobArn(value: RecommendationJobArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    inline def setJobDescription(value: RecommendationJobDescription): Self = StObject.set(x, "JobDescription", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: RecommendationJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: RecommendationJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RecommendationJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
