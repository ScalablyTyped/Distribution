package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobRun extends js.Object {
  
  /**
    * The number of times that DataBrew has attempted to run the job.
    */
  var Attempt: js.UndefOr[typings.awsSdk.databrewMod.Attempt] = js.native
  
  /**
    * The date and time when the job completed processing.
    */
  var CompletedOn: js.UndefOr[Date] = js.native
  
  /**
    * The name of the dataset for the job to process.
    */
  var DatasetName: js.UndefOr[typings.awsSdk.databrewMod.DatasetName] = js.native
  
  /**
    * A message indicating an error (if any) that was encountered when the job ran.
    */
  var ErrorMessage: js.UndefOr[JobRunErrorMessage] = js.native
  
  /**
    * The amount of time, in seconds, during which a job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.databrewMod.ExecutionTime] = js.native
  
  /**
    * The name of the job being processed during this run.
    */
  var JobName: js.UndefOr[typings.awsSdk.databrewMod.JobName] = js.native
  
  /**
    * The name of an Amazon CloudWatch log group, where the job writes diagnostic messages when it runs.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.databrewMod.LogGroupName] = js.native
  
  /**
    * The current status of Amazon CloudWatch logging for the job run.
    */
  var LogSubscription: js.UndefOr[typings.awsSdk.databrewMod.LogSubscription] = js.native
  
  /**
    * One or more output artifacts from a job run.
    */
  var Outputs: js.UndefOr[OutputList] = js.native
  
  /**
    * The set of steps processed by the job.
    */
  var RecipeReference: js.UndefOr[typings.awsSdk.databrewMod.RecipeReference] = js.native
  
  /**
    * The unique identifier of the job run.
    */
  var RunId: js.UndefOr[JobRunId] = js.native
  
  /**
    * The identifier (the user name) of the user who initiated the job run. 
    */
  var StartedBy: js.UndefOr[typings.awsSdk.databrewMod.StartedBy] = js.native
  
  /**
    * The date and time when the job run began. 
    */
  var StartedOn: js.UndefOr[Date] = js.native
  
  /**
    * The current state of the job run entity itself.
    */
  var State: js.UndefOr[JobRunState] = js.native
}
object JobRun {
  
  @scala.inline
  def apply(): JobRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobRun]
  }
  
  @scala.inline
  implicit class JobRunOps[Self <: JobRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttempt(value: Attempt): Self = this.set("Attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempt: Self = this.set("Attempt", js.undefined)
    
    @scala.inline
    def setCompletedOn(value: Date): Self = this.set("CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedOn: Self = this.set("CompletedOn", js.undefined)
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetName: Self = this.set("DatasetName", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: JobRunErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setExecutionTime(value: ExecutionTime): Self = this.set("ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTime: Self = this.set("ExecutionTime", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    
    @scala.inline
    def setLogSubscription(value: LogSubscription): Self = this.set("LogSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSubscription: Self = this.set("LogSubscription", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: OutputList): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    
    @scala.inline
    def setRecipeReference(value: RecipeReference): Self = this.set("RecipeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeReference: Self = this.set("RecipeReference", js.undefined)
    
    @scala.inline
    def setRunId(value: JobRunId): Self = this.set("RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunId: Self = this.set("RunId", js.undefined)
    
    @scala.inline
    def setStartedBy(value: StartedBy): Self = this.set("StartedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedBy: Self = this.set("StartedBy", js.undefined)
    
    @scala.inline
    def setStartedOn(value: Date): Self = this.set("StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedOn: Self = this.set("StartedOn", js.undefined)
    
    @scala.inline
    def setState(value: JobRunState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
