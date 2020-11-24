package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartJobRunRequest extends js.Object {
  
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) to allocate to this JobRun. From 2 to 100 DPUs can be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page.
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.native
  
  /**
    * The job arguments specifically for this run. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  
  /**
    * The name of the job definition to use.
    */
  var JobName: NameString = js.native
  
  /**
    * The ID of a previous JobRun to retry.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
  
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job, or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
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
    * The name of the SecurityConfiguration structure to be used with this job run.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typings.awsSdk.glueMod.Timeout] = js.native
  
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker provides 4 vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.   For the G.2X worker type, each worker provides 8 vCPU, 32 GB of memory and a 128GB disk, and 1 executor per worker.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.native
}
object StartJobRunRequest {
  
  @scala.inline
  def apply(JobName: NameString): StartJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunRequest]
  }
  
  @scala.inline
  implicit class StartJobRunRequestOps[Self <: StartJobRunRequest] (val x: Self) extends AnyVal {
    
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
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedCapacity(value: IntegerValue): Self = this.set("AllocatedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedCapacity: Self = this.set("AllocatedCapacity", js.undefined)
    
    @scala.inline
    def setArguments(value: GenericMap): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("Arguments", js.undefined)
    
    @scala.inline
    def setJobRunId(value: IdString): Self = this.set("JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobRunId: Self = this.set("JobRunId", js.undefined)
    
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
    def setSecurityConfiguration(value: NameString): Self = this.set("SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = this.set("Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("Timeout", js.undefined)
    
    @scala.inline
    def setWorkerType(value: WorkerType): Self = this.set("WorkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerType: Self = this.set("WorkerType", js.undefined)
  }
}
