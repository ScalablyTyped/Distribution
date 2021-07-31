package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTemplate extends StObject {
  
  /**
    * Accelerated transcoding can significantly speed up jobs with long, visually complex content.
    */
  var AccelerationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AccelerationSettings] = js.undefined
  
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * An optional category you create to organize your job templates.
    */
  var Category: js.UndefOr[string] = js.undefined
  
  /**
    * The timestamp in epoch seconds for Job template creation.
    */
  var CreatedAt: js.UndefOr[timestampUnix] = js.undefined
  
  /**
    * An optional description you create for each job template.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * Optional list of hop destinations.
    */
  var HopDestinations: js.UndefOr[listOfHopDestination] = js.undefined
  
  /**
    * The timestamp in epoch seconds when the Job template was last updated.
    */
  var LastUpdated: js.UndefOr[timestampUnix] = js.undefined
  
  /**
    * A name you create for each job template. Each name must be unique within your account.
    */
  var Name: string
  
  /**
    * Relative priority on the job.
    */
  var Priority: js.UndefOr[integerMinNegative50Max50] = js.undefined
  
  /**
    * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go to the default queue.
    */
  var Queue: js.UndefOr[string] = js.undefined
  
  /**
    * JobTemplateSettings contains all the transcode settings saved in the template that will be applied to jobs created from it.
    */
  var Settings: JobTemplateSettings
  
  /**
    * Specify how often MediaConvert sends STATUS_UPDATE events to Amazon CloudWatch Events. Set the interval, in seconds, between status updates. MediaConvert sends an update at this interval from the time the service begins processing your job to the time it completes the transcode or encounters an error.
    */
  var StatusUpdateInterval: js.UndefOr[typings.awsSdk.mediaconvertMod.StatusUpdateInterval] = js.undefined
  
  /**
    * A job template can be of two types: system or custom. System or built-in job templates can't be modified or deleted by the user.
    */
  var Type: js.UndefOr[typings.awsSdk.mediaconvertMod.Type] = js.undefined
}
object JobTemplate {
  
  @scala.inline
  def apply(Name: string, Settings: JobTemplateSettings): JobTemplate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplate]
  }
  
  @scala.inline
  implicit class JobTemplateMutableBuilder[Self <: JobTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerationSettings(value: AccelerationSettings): Self = StObject.set(x, "AccelerationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationSettingsUndefined: Self = StObject.set(x, "AccelerationSettings", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCategory(value: string): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: timestampUnix): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHopDestinations(value: listOfHopDestination): Self = StObject.set(x, "HopDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHopDestinationsUndefined: Self = StObject.set(x, "HopDestinations", js.undefined)
    
    @scala.inline
    def setHopDestinationsVarargs(value: HopDestination*): Self = StObject.set(x, "HopDestinations", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdated(value: timestampUnix): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: integerMinNegative50Max50): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setQueue(value: string): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    @scala.inline
    def setSettings(value: JobTemplateSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateInterval(value: StatusUpdateInterval): Self = StObject.set(x, "StatusUpdateInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateIntervalUndefined: Self = StObject.set(x, "StatusUpdateInterval", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
