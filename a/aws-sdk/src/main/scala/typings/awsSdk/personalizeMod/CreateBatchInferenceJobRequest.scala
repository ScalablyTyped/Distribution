package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchInferenceJobRequest extends StObject {
  
  /**
    * The configuration details of a batch inference job.
    */
  var batchInferenceJobConfig: js.UndefOr[BatchInferenceJobConfig] = js.undefined
  
  /**
    * The ARN of the filter to apply to the batch inference job. For more information on using filters, see Using Filters with Amazon Personalize.
    */
  var filterArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon S3 path that leads to the input file to base your recommendations on. The input material must be in JSON format.
    */
  var jobInput: BatchInferenceJobInput
  
  /**
    * The name of the batch inference job to create.
    */
  var jobName: Name
  
  /**
    * The path to the Amazon S3 bucket where the job's output will be stored.
    */
  var jobOutput: BatchInferenceJobOutput
  
  /**
    * The number of recommendations to retreive.
    */
  var numResults: js.UndefOr[NumBatchResults] = js.undefined
  
  /**
    * The ARN of the Amazon Identity and Access Management role that has permissions to read and write to your input and out Amazon S3 buckets respectively.
    */
  var roleArn: RoleArn
  
  /**
    * The Amazon Resource Name (ARN) of the solution version that will be used to generate the batch inference recommendations.
    */
  var solutionVersionArn: Arn
}
object CreateBatchInferenceJobRequest {
  
  inline def apply(
    jobInput: BatchInferenceJobInput,
    jobName: Name,
    jobOutput: BatchInferenceJobOutput,
    roleArn: RoleArn,
    solutionVersionArn: Arn
  ): CreateBatchInferenceJobRequest = {
    val __obj = js.Dynamic.literal(jobInput = jobInput.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobOutput = jobOutput.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchInferenceJobRequest]
  }
  
  extension [Self <: CreateBatchInferenceJobRequest](x: Self) {
    
    inline def setBatchInferenceJobConfig(value: BatchInferenceJobConfig): Self = StObject.set(x, "batchInferenceJobConfig", value.asInstanceOf[js.Any])
    
    inline def setBatchInferenceJobConfigUndefined: Self = StObject.set(x, "batchInferenceJobConfig", js.undefined)
    
    inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    inline def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
    
    inline def setJobInput(value: BatchInferenceJobInput): Self = StObject.set(x, "jobInput", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobOutput(value: BatchInferenceJobOutput): Self = StObject.set(x, "jobOutput", value.asInstanceOf[js.Any])
    
    inline def setNumResults(value: NumBatchResults): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    inline def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
