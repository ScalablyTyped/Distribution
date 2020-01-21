package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTemplate extends js.Object {
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  var AccelerationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AccelerationSettings] = js.native
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * An optional category you create to organize your job templates.
    */
  var Category: js.UndefOr[string] = js.native
  /**
    * The timestamp in epoch seconds for Job template creation.
    */
  var CreatedAt: js.UndefOr[timestampUnix] = js.native
  /**
    * An optional description you create for each job template.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The timestamp in epoch seconds when the Job template was last updated.
    */
  var LastUpdated: js.UndefOr[timestampUnix] = js.native
  /**
    * A name you create for each job template. Each name must be unique within your account.
    */
  var Name: string = js.native
  /**
    * Relative priority on the job.
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
    * A job template can be of two types: system or custom. System or built-in job templates can't be modified or deleted by the user.
    */
  var Type: js.UndefOr[typings.awsSdk.mediaconvertMod.Type] = js.native
}

object JobTemplate {
  @scala.inline
  def apply(
    Name: string,
    Settings: JobTemplateSettings,
    AccelerationSettings: AccelerationSettings = null,
    Arn: string = null,
    Category: string = null,
    CreatedAt: timestampUnix = null,
    Description: string = null,
    LastUpdated: timestampUnix = null,
    Priority: Int | Double = null,
    Queue: string = null,
    StatusUpdateInterval: StatusUpdateInterval = null,
    Type: Type = null
  ): JobTemplate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    if (AccelerationSettings != null) __obj.updateDynamic("AccelerationSettings")(AccelerationSettings.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    if (StatusUpdateInterval != null) __obj.updateDynamic("StatusUpdateInterval")(StatusUpdateInterval.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplate]
  }
}

