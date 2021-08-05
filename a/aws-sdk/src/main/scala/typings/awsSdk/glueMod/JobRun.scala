package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRun extends StObject {
  
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) allocated to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * The job arguments associated with this run. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.undefined
  
  /**
    * The number of the attempt to run this job.
    */
  var Attempt: js.UndefOr[AttemptCount] = js.undefined
  
  /**
    * The date and time that this job run completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * An error message associated with this job run.
    */
  var ErrorMessage: js.UndefOr[ErrorString] = js.undefined
  
  /**
    * The amount of time (in seconds) that the job run consumed resources.
    */
  var ExecutionTime: js.UndefOr[typings.awsSdk.glueMod.ExecutionTime] = js.undefined
  
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.undefined
  
  /**
    * The ID of this job run.
    */
  var Id: js.UndefOr[IdString] = js.undefined
  
  /**
    * The name of the job definition being used in this run.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The current state of the job run. For more information about the statuses of jobs that have terminated abnormally, see AWS Glue Job Run Statuses.
    */
  var JobRunState: js.UndefOr[typings.awsSdk.glueMod.JobRunState] = js.undefined
  
  /**
    * The last time that this job run was modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * The name of the log group for secure logging that can be server-side encrypted in Amazon CloudWatch using AWS KMS. This name can be /aws-glue/jobs/, in which case the default encryption is NONE. If you add a role name and SecurityConfiguration name (in other words, /aws-glue/jobs-yourRoleName-yourSecurityConfigurationName/), then that security configuration is used to encrypt the log group.
    */
  var LogGroupName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typings.awsSdk.glueMod.NotificationProperty] = js.undefined
  
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A list of predecessors to this job run.
    */
  var PredecessorRuns: js.UndefOr[PredecessorList] = js.undefined
  
  /**
    * The ID of the previous run of this job. For example, the JobRunId specified in the StartJobRun action.
    */
  var PreviousRunId: js.UndefOr[IdString] = js.undefined
  
  /**
    * The name of the SecurityConfiguration structure to be used with this job run.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  
  /**
    * The date and time at which this job run was started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.undefined
  
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typings.awsSdk.glueMod.Timeout] = js.undefined
  
  /**
    * The name of the trigger that started this job run.
    */
  var TriggerName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.undefined
}
object JobRun {
  
  inline def apply(): JobRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobRun]
  }
  
  extension [Self <: JobRun](x: Self) {
    
    inline def setAllocatedCapacity(value: IntegerValue): Self = StObject.set(x, "AllocatedCapacity", value.asInstanceOf[js.Any])
    
    inline def setAllocatedCapacityUndefined: Self = StObject.set(x, "AllocatedCapacity", js.undefined)
    
    inline def setArguments(value: GenericMap): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "Arguments", js.undefined)
    
    inline def setAttempt(value: AttemptCount): Self = StObject.set(x, "Attempt", value.asInstanceOf[js.Any])
    
    inline def setAttemptUndefined: Self = StObject.set(x, "Attempt", js.undefined)
    
    inline def setCompletedOn(value: TimestampValue): Self = StObject.set(x, "CompletedOn", value.asInstanceOf[js.Any])
    
    inline def setCompletedOnUndefined: Self = StObject.set(x, "CompletedOn", js.undefined)
    
    inline def setErrorMessage(value: ErrorString): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setExecutionTime(value: ExecutionTime): Self = StObject.set(x, "ExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeUndefined: Self = StObject.set(x, "ExecutionTime", js.undefined)
    
    inline def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    inline def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    inline def setId(value: IdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobRunState(value: JobRunState): Self = StObject.set(x, "JobRunState", value.asInstanceOf[js.Any])
    
    inline def setJobRunStateUndefined: Self = StObject.set(x, "JobRunState", js.undefined)
    
    inline def setLastModifiedOn(value: TimestampValue): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setLogGroupName(value: GenericString): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setMaxCapacity(value: NullableDouble): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setNotificationProperty(value: NotificationProperty): Self = StObject.set(x, "NotificationProperty", value.asInstanceOf[js.Any])
    
    inline def setNotificationPropertyUndefined: Self = StObject.set(x, "NotificationProperty", js.undefined)
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setPredecessorRuns(value: PredecessorList): Self = StObject.set(x, "PredecessorRuns", value.asInstanceOf[js.Any])
    
    inline def setPredecessorRunsUndefined: Self = StObject.set(x, "PredecessorRuns", js.undefined)
    
    inline def setPredecessorRunsVarargs(value: Predecessor*): Self = StObject.set(x, "PredecessorRuns", js.Array(value :_*))
    
    inline def setPreviousRunId(value: IdString): Self = StObject.set(x, "PreviousRunId", value.asInstanceOf[js.Any])
    
    inline def setPreviousRunIdUndefined: Self = StObject.set(x, "PreviousRunId", js.undefined)
    
    inline def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    inline def setStartedOn(value: TimestampValue): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setTriggerName(value: NameString): Self = StObject.set(x, "TriggerName", value.asInstanceOf[js.Any])
    
    inline def setTriggerNameUndefined: Self = StObject.set(x, "TriggerName", js.undefined)
    
    inline def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
  }
}
