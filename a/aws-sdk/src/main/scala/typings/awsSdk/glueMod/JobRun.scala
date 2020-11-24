package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobRun extends js.Object {
  
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.native
  
  /**
    * The job arguments associated with this run. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  
  /**
    * The number of the attempt to run this job.
    */
  var Attempt: js.UndefOr[AttemptCount] = js.native
  
  /**
    * The date and time that this job run completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * An error message associated with this job run.
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.native
  
  /**
    * The amount of time (in seconds) that the job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.glueMod.ExecutionTime] = js.native
  
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  
  /**
    * The ID of this job run.
    */
  var Id: js.UndefOr[IdString] = js.native
  
  /**
    * The name of the job definition being used in this run.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * The current state of the job run. For more information about the statuses of jobs that have terminated abnormally, see AWS Glue Job Run Statuses.
    */
  var JobRunState: js.UndefOr[typings.awsSdk.glueMod.JobRunState] = js.native
  
  /**
    * The last time that this job run was modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * The name of the log group for secure logging that can be server-side encrypted in Amazon CloudWatch using AWS KMS. This name can be /aws-glue/jobs/, in which case the default encryption is NONE. If you add a role name and SecurityConfiguration name (in other words, /aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/), then that security configuration is used to encrypt the log group.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.native
  
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typings.awsSdk.glueMod.NotificationProperty] = js.native
  
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  
  /**
    * A list of predecessors to this job run.
    */
  var PredecessorRuns: js.UndefOr[PredecessorList] = js.native
  
  /**
    * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
    */
  var PreviousRunId: js.UndefOr[IdString] = js.native
  
  /**
    * The name of the SecurityConfiguration structure to be used with this job run.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  
  /**
    * The date and time at which this job run was started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.native
  
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typings.awsSdk.glueMod.Timeout] = js.native
  
  /**
    * The name of the trigger that started this job run.
    */
  var TriggerName: js.UndefOr[NameString] = js.native
  
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.native
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
    def setAllocatedCapacity(value: IntegerValue): Self = this.set("AllocatedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedCapacity: Self = this.set("AllocatedCapacity", js.undefined)
    
    @scala.inline
    def setArguments(value: GenericMap): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("Arguments", js.undefined)
    
    @scala.inline
    def setAttempt(value: AttemptCount): Self = this.set("Attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempt: Self = this.set("Attempt", js.undefined)
    
    @scala.inline
    def setCompletedOn(value: TimestampValue): Self = this.set("CompletedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedOn: Self = this.set("CompletedOn", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setExecutionTime(value: ExecutionTime): Self = this.set("ExecutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTime: Self = this.set("ExecutionTime", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = this.set("GlueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlueVersion: Self = this.set("GlueVersion", js.undefined)
    
    @scala.inline
    def setId(value: IdString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    
    @scala.inline
    def setJobRunState(value: JobRunState): Self = this.set("JobRunState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobRunState: Self = this.set("JobRunState", js.undefined)
    
    @scala.inline
    def setLastModifiedOn(value: TimestampValue): Self = this.set("LastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedOn: Self = this.set("LastModifiedOn", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: GenericString): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    
    @scala.inline
    def setMaxCapacity(value: NullableDouble): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCapacity: Self = this.set("MaxCapacity", js.undefined)
    
    @scala.inline
    def setNotificationProperty(value: NotificationProperty): Self = this.set("NotificationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationProperty: Self = this.set("NotificationProperty", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = this.set("NumberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("NumberOfWorkers", js.undefined)
    
    @scala.inline
    def setPredecessorRunsVarargs(value: Predecessor*): Self = this.set("PredecessorRuns", js.Array(value :_*))
    
    @scala.inline
    def setPredecessorRuns(value: PredecessorList): Self = this.set("PredecessorRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredecessorRuns: Self = this.set("PredecessorRuns", js.undefined)
    
    @scala.inline
    def setPreviousRunId(value: IdString): Self = this.set("PreviousRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousRunId: Self = this.set("PreviousRunId", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = this.set("SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setStartedOn(value: TimestampValue): Self = this.set("StartedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartedOn: Self = this.set("StartedOn", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    
    @scala.inline
    def setTriggerName(value: NameString): Self = this.set("TriggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerName: Self = this.set("TriggerName", js.undefined)
    
    @scala.inline
    def setWorkerType(value: WorkerType): Self = this.set("WorkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerType: Self = this.set("WorkerType", js.undefined)
  }
}
