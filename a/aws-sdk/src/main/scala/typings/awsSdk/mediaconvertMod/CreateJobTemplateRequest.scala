package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobTemplateRequest extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content. Outputs that use this feature incur pro-tier pricing. For information about feature limitations, see the AWS Elemental MediaConvert User Guide.
    */
  var AccelerationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  /**
    * Optional. A category for the job template you are creating
    */
  var Category: js.UndefOr[string] = js.native
  /**
    * Optional. A description of the job template you are creating.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * Optional. Use queue hopping to avoid overly long waits in the backlog of the queue that you submit your job to. Specify an alternate queue and the maximum time that your job will wait in the initial queue before hopping. For more information about this feature, see the AWS Elemental MediaConvert User Guide.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.native
  /**
    * The name of the job template you are creating.
    */
  var Name: string = js.native
  /**
    * Specify the relative priority for this job. In any given queue, the service begins processing the job with the highest value first. When more than one job has the same priority, the service begins processing the job that you submitted first. If you don't specify a priority, the service uses the default value 0.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.native
  /**
    * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go to the default queue.
    */
  var Queue: js.UndefOr[string] = js.native
  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  var Settings: JobTemplateSettings = js.native
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.native
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object CreateJobTemplateRequest {
  @scala.inline
  def apply(Name: string, Settings: JobTemplateSettings): CreateJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobTemplateRequest]
  }
  @scala.inline
  implicit class CreateJobTemplateRequestOps[Self <: CreateJobTemplateRequest] (val x: Self) extends AnyVal {
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
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: JobTemplateSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccelerationSettings(value: AccelerationSettings): Self = this.set("AccelerationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationSettings: Self = this.set("AccelerationSettings", js.undefined)
    @scala.inline
    def setCategory(value: string): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setHopDestinationsVarargs(value: HopDestination*): Self = this.set("HopDestinations", js.Array(value :_*))
    @scala.inline
    def setHopDestinations(value: listOfHopDestination): Self = this.set("HopDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHopDestinations: Self = this.set("HopDestinations", js.undefined)
    @scala.inline
    def setPriority(value: integerMinNegative50Max50): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    @scala.inline
    def setQueue(value: string): Self = this.set("Queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("Queue", js.undefined)
    @scala.inline
    def setStatusUpdateInterval(value: StatusUpdateInterval): Self = this.set("StatusUpdateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusUpdateInterval: Self = this.set("StatusUpdateInterval", js.undefined)
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

