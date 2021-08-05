package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCompilationJobRequest extends StObject {
  
  /**
    * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account. 
    */
  var CompilationJobName: EntityName
  
  /**
    * Provides information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: typings.awsSdk.sagemakerMod.InputConfig
  
  /**
    * Provides information about the output location for the compiled model and the target device the model runs on.
    */
  var OutputConfig: typings.awsSdk.sagemakerMod.OutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.  During model compilation, Amazon SageMaker needs your permission to:   Read input data from an S3 bucket   Write model artifacts to an S3 bucket   Write logs to Amazon CloudWatch Logs   Publish metrics to Amazon CloudWatch   You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. For more information, see Amazon SageMaker Roles. 
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * Specifies a limit to how long a model compilation job can run. When the job reaches the time limit, Amazon SageMaker ends the compilation job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsSdk.sagemakerMod.StoppingCondition
  
  /**
    * An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateCompilationJobRequest {
  
  inline def apply(
    CompilationJobName: EntityName,
    InputConfig: InputConfig,
    OutputConfig: OutputConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): CreateCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCompilationJobRequest]
  }
  
  extension [Self <: CreateCompilationJobRequest](x: Self) {
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
