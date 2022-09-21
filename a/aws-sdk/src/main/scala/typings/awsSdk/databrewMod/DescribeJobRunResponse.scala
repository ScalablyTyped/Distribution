package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRunResponse extends StObject {
  
  /**
    * The number of times that DataBrew has attempted to run the job.
    */
  var Attempt: js.UndefOr[typings.awsSdk.databrewMod.Attempt] = js.undefined
  
  /**
    * The date and time when the job completed processing.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * One or more artifacts that represent the Glue Data Catalog output from running the job.
    */
  var DataCatalogOutputs: js.UndefOr[DataCatalogOutputList] = js.undefined
  
  /**
    * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job to write into.
    */
  var DatabaseOutputs: js.UndefOr[DatabaseOutputList] = js.undefined
  
  /**
    * The name of the dataset for the job to process.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.undefined
  
  /**
    * A message indicating an error (if any) that was encountered when the job ran.
    */
  var ErrorMessage: js.UndefOr[JobRunErrorMessage] = js.undefined
  
  /**
    * The amount of time, in seconds, during which the job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.databrewMod.ExecutionTime] = js.undefined
  
  /**
    * The name of the job being processed during this run.
    */
  var JobName: typings.awsSdk.databrewMod.JobName
  
  /**
    * Sample configuration for profile jobs only. Determines the number of rows on which the profile job will be executed. If a JobSample value is not provided, the default value will be used. The default value is CUSTOM_ROWS for the mode parameter and 20000 for the size parameter.
    */
  var JobSample: js.UndefOr[typings.awsSdk.databrewMod.JobSample] = js.undefined
  
  /**
    * The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.databrewMod.LogGroupName] = js.undefined
  
  /**
    * The current status of Amazon CloudWatch logging for the job run.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.databrewMod.LogSubscription] = js.undefined
  
  /**
    * One or more output artifacts from a job run.
    */
  var Outputs: js.UndefOr[OutputList] = js.undefined
  
  /**
    * Configuration for profile jobs. Used to select columns, do evaluations, and override default parameters of evaluations. When configuration is null, the profile job will run with default settings.
    */
  var ProfileConfiguration: js.UndefOr[typings.awsSdk.databrewMod.ProfileConfiguration] = js.undefined
  
  var RecipeReference: js.UndefOr[typings.awsSdk.databrewMod.RecipeReference] = js.undefined
  
  /**
    * The unique identifier of the job run.
    */
  var RunId: js.UndefOr[JobRunId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who started the job run.
    */
  var StartedBy: js.UndefOr[typings.awsSdk.databrewMod.StartedBy] = js.undefined
  
  /**
    * The date and time when the job run began.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the job run entity itself.
    */
  var State: js.UndefOr[JobRunState] = js.undefined
  
  /**
    * List of validation configurations that are applied to the profile job.
    */
  var ValidationConfigurations: js.UndefOr[ValidationConfigurationList] = js.undefined
}
object DescribeJobRunResponse {
  
  inline def apply(JobName: JobName): DescribeJobRunResponse = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRunResponse]
  }
  
  extension [Self <: DescribeJobRunResponse](x: Self) {
    
    inline def setAttempt(value: Attempt): Self = StObject.set(x, "Attempt", value.asInstanceOf[js.Any])
    
    inline def setAttemptUndefined: Self = StObject.set(x, "Attempt", js.undefined)
    
    inline def setCompletedOn(value: js.Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setDataCatalogOutputs(value: DataCatalogOutputList): Self = StObject.set(x, "DataCatalogOutputs", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogOutputsUndefined: Self = StObject.set(x, "DataCatalogOutputs", js.undefined)
    
    inline def setDataCatalogOutputsVarargs(value: DataCatalogOutput*): Self = StObject.set(x, "DataCatalogOutputs", js.Array(value*))
    
    inline def setDatabaseOutputs(value: DatabaseOutputList): Self = StObject.set(x, "DatabaseOutputs", value.asInstanceOf[js.Any])
    
    inline def setDatabaseOutputsUndefined: Self = StObject.set(x, "DatabaseOutputs", js.undefined)
    
    inline def setDatabaseOutputsVarargs(value: DatabaseOutput*): Self = StObject.set(x, "DatabaseOutputs", js.Array(value*))
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setErrorMessage(value: JobRunErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobSample(value: JobSample): Self = StObject.set(x, "JobSample", value.asInstanceOf[js.Any])
    
    inline def setJobSampleUndefined: Self = StObject.set(x, "JobSample", js.undefined)
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setLogSubscription(value: LogSubscription): Self = StObject.set(x, "LogSubscription", value.asInstanceOf[js.Any])
    
    inline def setLogSubscriptionUndefined: Self = StObject.set(x, "LogSubscription", js.undefined)
    
    inline def setOutputs(value: OutputList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setProfileConfiguration(value: ProfileConfiguration): Self = StObject.set(x, "ProfileConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProfileConfigurationUndefined: Self = StObject.set(x, "ProfileConfiguration", js.undefined)
    
    inline def setRecipeReference(value: RecipeReference): Self = StObject.set(x, "RecipeReference", value.asInstanceOf[js.Any])
    
    inline def setRecipeReferenceUndefined: Self = StObject.set(x, "RecipeReference", js.undefined)
    
    inline def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
    
    inline def setStartedBy(value: StartedBy): Self = StObject.set(x, "StartedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "StartedBy", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setState(value: JobRunState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setValidationConfigurations(value: ValidationConfigurationList): Self = StObject.set(x, "ValidationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setValidationConfigurationsUndefined: Self = StObject.set(x, "ValidationConfigurations", js.undefined)
    
    inline def setValidationConfigurationsVarargs(value: ValidationConfiguration*): Self = StObject.set(x, "ValidationConfigurations", js.Array(value*))
  }
}
