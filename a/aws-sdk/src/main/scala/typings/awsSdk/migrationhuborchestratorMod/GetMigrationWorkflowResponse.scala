package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationWorkflowResponse extends StObject {
  
  /**
    * The configuration ID of the application configured in Application Discovery Service.
    */
  var adsApplicationConfigurationId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the application configured in Application Discovery Service.
    */
  var adsApplicationName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the migration workflow.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * Get a list of completed steps in the migration workflow.
    */
  var completedSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time at which the migration workflow was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the migration workflow.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the migration workflow ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var id: js.UndefOr[MigrationWorkflowId] = js.undefined
  
  /**
    * The time at which the migration workflow was last modified.
    */
  var lastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the migration workflow was last started.
    */
  var lastStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the migration workflow was last stopped.
    */
  var lastStopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the migration workflow.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the migration workflow.
    */
  var status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined
  
  /**
    * The status message of the migration workflow.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The tags added to the migration workflow.
    */
  var tags: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * List of AWS services utilized in a migration workflow.
    */
  var tools: js.UndefOr[ToolsList] = js.undefined
  
  /**
    * The total number of steps in the migration workflow.
    */
  var totalSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon S3 bucket where the migration logs are stored.
    */
  var workflowBucket: js.UndefOr[String] = js.undefined
  
  /**
    * The inputs required for creating the migration workflow.
    */
  var workflowInputs: js.UndefOr[StepInputParameters] = js.undefined
}
object GetMigrationWorkflowResponse {
  
  inline def apply(): GetMigrationWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMigrationWorkflowResponse]
  }
  
  extension [Self <: GetMigrationWorkflowResponse](x: Self) {
    
    inline def setAdsApplicationConfigurationId(value: String): Self = StObject.set(x, "adsApplicationConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setAdsApplicationConfigurationIdUndefined: Self = StObject.set(x, "adsApplicationConfigurationId", js.undefined)
    
    inline def setAdsApplicationName(value: String): Self = StObject.set(x, "adsApplicationName", value.asInstanceOf[js.Any])
    
    inline def setAdsApplicationNameUndefined: Self = StObject.set(x, "adsApplicationName", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCompletedSteps(value: Integer): Self = StObject.set(x, "completedSteps", value.asInstanceOf[js.Any])
    
    inline def setCompletedStepsUndefined: Self = StObject.set(x, "completedSteps", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLastStartTime(value: js.Date): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setLastStopTime(value: js.Date): Self = StObject.set(x, "lastStopTime", value.asInstanceOf[js.Any])
    
    inline def setLastStopTimeUndefined: Self = StObject.set(x, "lastStopTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: MigrationWorkflowStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: StringMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setTools(value: ToolsList): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: Tool*): Self = StObject.set(x, "tools", js.Array(value*))
    
    inline def setTotalSteps(value: Integer): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
    
    inline def setWorkflowBucket(value: String): Self = StObject.set(x, "workflowBucket", value.asInstanceOf[js.Any])
    
    inline def setWorkflowBucketUndefined: Self = StObject.set(x, "workflowBucket", js.undefined)
    
    inline def setWorkflowInputs(value: StepInputParameters): Self = StObject.set(x, "workflowInputs", value.asInstanceOf[js.Any])
    
    inline def setWorkflowInputsUndefined: Self = StObject.set(x, "workflowInputs", js.undefined)
  }
}
