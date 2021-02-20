package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  var AccelerationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  
  /**
    * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't compatible with accelerated transcoding, the service either fails your job or runs it without accelerated transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
    */
  var AccelerationStatus: js.UndefOr[typings.awsSdk.mediaconvertMod.AccelerationStatus] = js.native
  
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up.
    */
  var BillingTagsSource: js.UndefOr[typings.awsSdk.mediaconvertMod.BillingTagsSource] = js.native
  
  /**
    * The time, in Unix epoch format in seconds, when the job got created.
    */
  var CreatedAt: js.UndefOr[timestampUnix] = js.native
  
  /**
    * A job's phase can be PROBING, TRANSCODING OR UPLOADING
    */
  var CurrentPhase: js.UndefOr[JobPhase] = js.native
  
  /**
    * Error code for the job
    */
  var ErrorCode: js.UndefOr[integer] = js.native
  
  /**
    * Error message of Job
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  
  /**
    * Optional list of hop destinations.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.native
  
  /**
    * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * An estimate of how far your job has progressed. This estimate is shown as a percentage of the total time from when your job leaves its queue to when your output files appear in your output Amazon S3 bucket. AWS Elemental MediaConvert provides jobPercentComplete in CloudWatch STATUS_UPDATE events and in the response to GetJob and ListJobs requests. The jobPercentComplete estimate is reliable for the following input containers: Quicktime, Transport Stream, MP4, and MXF. For some jobs, the service can't provide information about job progress. In those cases, jobPercentComplete returns a null value.
    */
  var JobPercentComplete: js.UndefOr[integer] = js.native
  
  /**
    * The job template that the job is created from, if it is created from a job template.
    */
  var JobTemplate: js.UndefOr[string] = js.native
  
  /**
    * Provides messages from the service about jobs that you have already successfully submitted.
    */
  var Messages: js.UndefOr[JobMessages] = js.native
  
  /**
    * List of output group details
    */
  var OutputGroupDetails: js.UndefOr[listOfOutputGroupDetail] = js.native
  
  /**
    * Relative priority on the job.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  
  /**
    * When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at https://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Queue: js.UndefOr[string] = js.native
  
  /**
    * The job's queue hopping history.
    */
  var QueueTransitions: js.UndefOr[listOfQueueTransition] = js.native
  
  /**
    * The number of times that the service automatically attempted to process your job after encountering an error.
    */
  var RetryCount: js.UndefOr[integer] = js.native
  
  /**
    * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
    */
  var Role: string = js.native
  
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings = js.native
  
  /**
    * Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  var SimulateReservedQueue: js.UndefOr[typings.awsSdk.mediaconvertMod.SimulateReservedQueue] = js.native
  
  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  var Status: js.UndefOr[JobStatus] = js.native
  
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
  
  /**
    * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
    */
  var Timing: js.UndefOr[typings.awsSdk.mediaconvertMod.Timing] = js.native
  
  /**
    * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
    */
  var UserMetadata: js.UndefOr[mapOfString] = js.native
}
object Job {
  
  @scala.inline
  def apply(Role: string, Settings: JobSettings): Job = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerationSettings(value: AccelerationSettings): Self = StObject.set(x, "AccelerationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationSettingsUndefined: Self = StObject.set(x, "AccelerationSettings", js.undefined)
    
    @scala.inline
    def setAccelerationStatus(value: AccelerationStatus): Self = StObject.set(x, "AccelerationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationStatusUndefined: Self = StObject.set(x, "AccelerationStatus", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setBillingTagsSource(value: BillingTagsSource): Self = StObject.set(x, "BillingTagsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingTagsSourceUndefined: Self = StObject.set(x, "BillingTagsSource", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampUnix): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCurrentPhase(value: JobPhase): Self = StObject.set(x, "CurrentPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPhaseUndefined: Self = StObject.set(x, "CurrentPhase", js.undefined)
    
    @scala.inline
    def setErrorCode(value: integer): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: string): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setHopDestinations(value: listOfHopDestination): Self = StObject.set(x, "HopDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHopDestinationsUndefined: Self = StObject.set(x, "HopDestinations", js.undefined)
    
    @scala.inline
    def setHopDestinationsVarargs(value: HopDestination*): Self = StObject.set(x, "HopDestinations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setJobPercentComplete(value: integer): Self = StObject.set(x, "JobPercentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobPercentCompleteUndefined: Self = StObject.set(x, "JobPercentComplete", js.undefined)
    
    @scala.inline
    def setJobTemplate(value: string): Self = StObject.set(x, "JobTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTemplateUndefined: Self = StObject.set(x, "JobTemplate", js.undefined)
    
    @scala.inline
    def setMessages(value: JobMessages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    @scala.inline
    def setOutputGroupDetails(value: listOfOutputGroupDetail): Self = StObject.set(x, "OutputGroupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputGroupDetailsUndefined: Self = StObject.set(x, "OutputGroupDetails", js.undefined)
    
    @scala.inline
    def setOutputGroupDetailsVarargs(value: OutputGroupDetail*): Self = StObject.set(x, "OutputGroupDetails", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: integerMinNegative50Max50): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setQueue(value: string): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTransitions(value: listOfQueueTransition): Self = StObject.set(x, "QueueTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTransitionsUndefined: Self = StObject.set(x, "QueueTransitions", js.undefined)
    
    @scala.inline
    def setQueueTransitionsVarargs(value: QueueTransition*): Self = StObject.set(x, "QueueTransitions", js.Array(value :_*))
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    @scala.inline
    def setRetryCount(value: integer): Self = StObject.set(x, "RetryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryCountUndefined: Self = StObject.set(x, "RetryCount", js.undefined)
    
    @scala.inline
    def setRole(value: string): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: JobSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateReservedQueue(value: SimulateReservedQueue): Self = StObject.set(x, "SimulateReservedQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulateReservedQueueUndefined: Self = StObject.set(x, "SimulateReservedQueue", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStatusUpdateInterval(value: StatusUpdateInterval): Self = StObject.set(x, "StatusUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateIntervalUndefined: Self = StObject.set(x, "StatusUpdateInterval", js.undefined)
    
    @scala.inline
    def setTiming(value: Timing): Self = StObject.set(x, "Timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "Timing", js.undefined)
    
    @scala.inline
    def setUserMetadata(value: mapOfString): Self = StObject.set(x, "UserMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadataUndefined: Self = StObject.set(x, "UserMetadata", js.undefined)
  }
}
