package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRun extends StObject {
  
  /**
    * The number of times that DataBrew has attempted to run the job.
    */
  var Attempt: js.UndefOr[typings.awsSdk.databrewMod.Attempt] = js.undefined
  
  /**
    * The date and time when the job completed processing.
    */
  var CompletedOn: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the dataset for the job to process.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.undefined
  
  /**
    * A message indicating an error (if any) that was encountered when the job ran.
    */
  var ErrorMessage: js.UndefOr[JobRunErrorMessage] = js.undefined
  
  /**
    * The amount of time, in seconds, during which a job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.databrewMod.ExecutionTime] = js.undefined
  
  /**
    * The name of the job being processed during this run.
    */
  var JobName: js.UndefOr[typings.awsSdk.databrewMod.JobName] = js.undefined
  
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
    * The set of steps processed by the job.
    */
  var RecipeReference: js.UndefOr[typings.awsSdk.databrewMod.RecipeReference] = js.undefined
  
  /**
    * The unique identifier of the job run.
    */
  var RunId: js.UndefOr[JobRunId] = js.undefined
  
  /**
    * The identifier (the user name) of the user who initiated the job run. 
    */
  var StartedBy: js.UndefOr[typings.awsSdk.databrewMod.StartedBy] = js.undefined
  
  /**
    * The date and time when the job run began. 
    */
  var StartedOn: js.UndefOr[Date] = js.undefined
  
  /**
    * The current state of the job run entity itself.
    */
  var State: js.UndefOr[JobRunState] = js.undefined
}
object JobRun {
  
  @scala.inline
  def apply(): JobRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobRun]
  }
  
  @scala.inline
  implicit class JobRunMutableBuilder[Self <: JobRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempt(value: Attempt): Self = StObject.set(x, "Attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptUndefined: Self = StObject.set(x, "Attempt", js.undefined)
    
    @scala.inline
    def setCompletedOn(value: Date): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: JobRunErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    @scala.inline
    def setLogSubscription(value: LogSubscription): Self = StObject.set(x, "LogSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSubscriptionUndefined: Self = StObject.set(x, "LogSubscription", js.undefined)
    
    @scala.inline
    def setOutputs(value: OutputList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setRecipeReference(value: RecipeReference): Self = StObject.set(x, "RecipeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeReferenceUndefined: Self = StObject.set(x, "RecipeReference", js.undefined)
    
    @scala.inline
    def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
    
    @scala.inline
    def setStartedBy(value: StartedBy): Self = StObject.set(x, "StartedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedByUndefined: Self = StObject.set(x, "StartedBy", js.undefined)
    
    @scala.inline
    def setStartedOn(value: Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    @scala.inline
    def setState(value: JobRunState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
