package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * Optional. Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  /**
    * Optional. Choose a tag type that AWS Billing and Cost Management will use to sort your AWS Elemental MediaConvert costs on any billing report that you set up. Any transcoding outputs that don't have an associated tag will appear in your billing report unsorted. If you don't choose a valid value for this field, your job outputs will appear on the billing report unsorted.
    */
  var BillingTagsSource: js.UndefOr[typings.awsSdk.mediaconvertMod.BillingTagsSource] = js.native
  /**
    * Optional. Idempotency token for CreateJob operation.
    */
  var ClientRequestToken: js.UndefOr[string] = js.native
  /**
    * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.native
  /**
    * Optional. When you create a job, you can either specify a job template or specify the transcoding settings individually.
    */
  var JobTemplate: js.UndefOr[string] = js.native
  /**
    * Optional. Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  /**
    * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
    */
  var Queue: js.UndefOr[string] = js.native
  /**
    * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
    */
  var Role: string = js.native
  /**
    * JobSettings contains all the transcode settings for a job.
    */
  var Settings: JobSettings = js.native
  /**
    * Optional. Enable this setting when you run a test job to estimate how many reserved transcoding slots (RTS) you need. When this is enabled, MediaConvert runs your job from an on-demand queue with similar performance to what you will see with one RTS in a reserved queue. This setting is disabled by default.
    */
  var SimulateReservedQueue: js.UndefOr[typings.awsSdk.mediaconvertMod.SimulateReservedQueue] = js.native
  /**
    * Optional. Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
  /**
    * Optional. The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * Optional. User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
    */
  var UserMetadata: js.UndefOr[mapOfString] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(
    Role: string,
    Settings: JobSettings,
    AccelerationSettings: AccelerationSettings = null,
    BillingTagsSource: BillingTagsSource = null,
    ClientRequestToken: string = null,
    HopDestinations: listOfHopDestination = null,
    JobTemplate: string = null,
    Priority: Int | Double = null,
    Queue: string = null,
    SimulateReservedQueue: SimulateReservedQueue = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    Tags: mapOfString = null,
    UserMetadata: mapOfString = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings.asInstanceOf[js.Any])
    if (BillingTagsSource != null) __obj.updateDynamic("BillingTagsSource")(BillingTagsSource.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (HopDestinations != null) __obj.updateDynamic("HopDestinations")(HopDestinations.asInstanceOf[js.Any])
    if (JobTemplate != null) __obj.updateDynamic("JobTemplate")(JobTemplate.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    if (SimulateReservedQueue != null) __obj.updateDynamic("SimulateReservedQueue")(SimulateReservedQueue.asInstanceOf[js.Any])
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

