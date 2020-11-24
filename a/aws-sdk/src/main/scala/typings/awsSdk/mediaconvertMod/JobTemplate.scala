package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Optional list of hop destinations.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.native
  
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
  def apply(Name: string, Settings: JobTemplateSettings): JobTemplate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplate]
  }
  
  @scala.inline
  implicit class JobTemplateOps[Self <: JobTemplate] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCategory(value: string): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampUnix): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
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
    def setLastUpdated(value: timestampUnix): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    
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
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
