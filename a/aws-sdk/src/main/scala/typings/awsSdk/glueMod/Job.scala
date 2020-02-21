package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * This field is deprecated. Use MaxCapacity instead. The number of AWS Glue data processing units (DPUs) allocated to runs of this job. You can allocate from 2 to 100 DPUs; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. 
    */
  var AllocatedCapacity: js.UndefOr[IntegerValue] = js.native
  /**
    * The JobCommand that executes this job.
    */
  var Command: js.UndefOr[JobCommand] = js.native
  /**
    * The connections used for this job.
    */
  var Connections: js.UndefOr[ConnectionsList] = js.native
  /**
    * The time and date that this job definition was created.
    */
  var CreatedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * The default arguments for this job, specified as name-value pairs. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var DefaultArguments: js.UndefOr[GenericMap] = js.native
  /**
    * A description of the job.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
    */
  var ExecutionProperty: js.UndefOr[typings.awsSdk.glueMod.ExecutionProperty] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for jobs of type Spark.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Jobs that are created without specifying a Glue version default to Glue 0.9.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The last point in time when this job definition was modified.
    */
  var LastModifiedOn: js.UndefOr[TimestampValue] = js.native
  /**
    * This field is reserved for future use.
    */
  var LogUri: js.UndefOr[UriString] = js.native
  /**
    * The number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory. For more information, see the AWS Glue pricing page. Do not set Max Capacity if using WorkerType and NumberOfWorkers. The value that can be allocated for MaxCapacity depends on whether you are running a Python shell job or an Apache Spark ETL job:   When you specify a Python shell job (JobCommand.Name="pythonshell"), you can allocate either 0.0625 or 1 DPU. The default is 0.0625 DPU.   When you specify an Apache Spark ETL job (JobCommand.Name="glueetl"), you can allocate from 2 to 100 DPUs. The default is 10 DPUs. This job type cannot have a fractional DPU allocation.  
    */
  var MaxCapacity: js.UndefOr[NullableDouble] = js.native
  /**
    * The maximum number of times to retry this job after a JobRun fails.
    */
  var MaxRetries: js.UndefOr[typings.awsSdk.glueMod.MaxRetries] = js.native
  /**
    * The name you assign to this job definition.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * Non-overridable arguments for this job, specified as name-value pairs.
    */
  var NonOverridableArguments: js.UndefOr[GenericMap] = js.native
  /**
    * Specifies configuration properties of a job notification.
    */
  var NotificationProperty: js.UndefOr[typings.awsSdk.glueMod.NotificationProperty] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when a job runs. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the IAM role associated with this job.
    */
  var Role: js.UndefOr[RoleString] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this job.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * The job timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours).
    */
  var Timeout: js.UndefOr[typings.awsSdk.glueMod.Timeout] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.  
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.native
}

object Job {
  @scala.inline
  def apply(
    AllocatedCapacity: Int | Double = null,
    Command: JobCommand = null,
    Connections: ConnectionsList = null,
    CreatedOn: TimestampValue = null,
    DefaultArguments: GenericMap = null,
    Description: DescriptionString = null,
    ExecutionProperty: ExecutionProperty = null,
    GlueVersion: GlueVersionString = null,
    LastModifiedOn: TimestampValue = null,
    LogUri: UriString = null,
    MaxCapacity: Int | Double = null,
    MaxRetries: Int | Double = null,
    Name: NameString = null,
    NonOverridableArguments: GenericMap = null,
    NotificationProperty: NotificationProperty = null,
    NumberOfWorkers: Int | Double = null,
    Role: RoleString = null,
    SecurityConfiguration: NameString = null,
    Timeout: Int | Double = null,
    WorkerType: WorkerType = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (AllocatedCapacity != null) __obj.updateDynamic("AllocatedCapacity")(AllocatedCapacity.asInstanceOf[js.Any])
    if (Command != null) __obj.updateDynamic("Command")(Command.asInstanceOf[js.Any])
    if (Connections != null) __obj.updateDynamic("Connections")(Connections.asInstanceOf[js.Any])
    if (CreatedOn != null) __obj.updateDynamic("CreatedOn")(CreatedOn.asInstanceOf[js.Any])
    if (DefaultArguments != null) __obj.updateDynamic("DefaultArguments")(DefaultArguments.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExecutionProperty != null) __obj.updateDynamic("ExecutionProperty")(ExecutionProperty.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (LastModifiedOn != null) __obj.updateDynamic("LastModifiedOn")(LastModifiedOn.asInstanceOf[js.Any])
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri.asInstanceOf[js.Any])
    if (MaxCapacity != null) __obj.updateDynamic("MaxCapacity")(MaxCapacity.asInstanceOf[js.Any])
    if (MaxRetries != null) __obj.updateDynamic("MaxRetries")(MaxRetries.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NonOverridableArguments != null) __obj.updateDynamic("NonOverridableArguments")(NonOverridableArguments.asInstanceOf[js.Any])
    if (NotificationProperty != null) __obj.updateDynamic("NotificationProperty")(NotificationProperty.asInstanceOf[js.Any])
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

