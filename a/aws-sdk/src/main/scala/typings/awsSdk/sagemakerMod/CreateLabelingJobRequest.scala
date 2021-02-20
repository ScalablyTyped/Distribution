package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLabelingJobRequest extends StObject {
  
  /**
    * Configures the labeling task and how it is presented to workers; including, but not limited to price, keywords, and batch size (task count).
    */
  var HumanTaskConfig: typings.awsSdk.sagemakerMod.HumanTaskConfig = js.native
  
  /**
    * Input data for the labeling job, such as the Amazon S3 location of the data objects and the location of the manifest file that describes the data objects.
    */
  var InputConfig: LabelingJobInputConfig = js.native
  
  /**
    * The attribute name to use for the label in the output manifest file. This is the key for the key/value pair formed with the label that a worker assigns to the object. The name can't end with "-metadata". If you are running a semantic segmentation labeling job, the attribute name must end with "-ref". If you are running any other kind of labeling job, the attribute name must not end with "-ref".
    */
  var LabelAttributeName: typings.awsSdk.sagemakerMod.LabelAttributeName = js.native
  
  /**
    * The S3 URI of the file that defines the categories used to label the data objects. For 3D point cloud task types, see Create a Labeling Category Configuration File for 3D Point Cloud Labeling Jobs.  For all other built-in task types and custom tasks, your label category configuration file must be a JSON file in the following format. Identify the labels you want to use by replacing label_1, label_2,...,label_n with your label categories.  {    "document-version": "2018-11-28"    "labels": [    {    "label": "label_1"    },    {    "label": "label_2"    },    ...    {    "label": "label_n"    }    ]   } 
    */
  var LabelCategoryConfigS3Uri: js.UndefOr[S3Uri] = js.native
  
  /**
    * Configures the information required to perform automated data labeling.
    */
  var LabelingJobAlgorithmsConfig: js.UndefOr[typings.awsSdk.sagemakerMod.LabelingJobAlgorithmsConfig] = js.native
  
  /**
    * The name of the labeling job. This name is used to identify the job in a list of labeling jobs.
    */
  var LabelingJobName: typings.awsSdk.sagemakerMod.LabelingJobName = js.native
  
  /**
    * The location of the output data and the AWS Key Management Service key ID for the key used to encrypt the output data, if any.
    */
  var OutputConfig: LabelingJobOutputConfig = js.native
  
  /**
    * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data labeling. You must grant this role the necessary permissions so that Amazon SageMaker can successfully complete data labeling.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  
  /**
    * A set of conditions for stopping the labeling job. If any of the conditions are met, the job is automatically stopped. You can use these conditions to control the cost of data labeling.
    */
  var StoppingConditions: js.UndefOr[LabelingJobStoppingConditions] = js.native
  
  /**
    * An array of key/value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateLabelingJobRequest {
  
  @scala.inline
  def apply(
    HumanTaskConfig: HumanTaskConfig,
    InputConfig: LabelingJobInputConfig,
    LabelAttributeName: LabelAttributeName,
    LabelingJobName: LabelingJobName,
    OutputConfig: LabelingJobOutputConfig,
    RoleArn: RoleArn
  ): CreateLabelingJobRequest = {
    val __obj = js.Dynamic.literal(HumanTaskConfig = HumanTaskConfig.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], LabelAttributeName = LabelAttributeName.asInstanceOf[js.Any], LabelingJobName = LabelingJobName.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelingJobRequest]
  }
  
  @scala.inline
  implicit class CreateLabelingJobRequestMutableBuilder[Self <: CreateLabelingJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskConfig(value: HumanTaskConfig): Self = StObject.set(x, "HumanTaskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfig(value: LabelingJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAttributeName(value: LabelAttributeName): Self = StObject.set(x, "LabelAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCategoryConfigS3Uri(value: S3Uri): Self = StObject.set(x, "LabelCategoryConfigS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCategoryConfigS3UriUndefined: Self = StObject.set(x, "LabelCategoryConfigS3Uri", js.undefined)
    
    @scala.inline
    def setLabelingJobAlgorithmsConfig(value: LabelingJobAlgorithmsConfig): Self = StObject.set(x, "LabelingJobAlgorithmsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingJobAlgorithmsConfigUndefined: Self = StObject.set(x, "LabelingJobAlgorithmsConfig", js.undefined)
    
    @scala.inline
    def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfig(value: LabelingJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingConditions(value: LabelingJobStoppingConditions): Self = StObject.set(x, "StoppingConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppingConditionsUndefined: Self = StObject.set(x, "StoppingConditions", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
