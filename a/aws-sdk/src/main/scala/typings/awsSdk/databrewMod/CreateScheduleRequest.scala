package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScheduleRequest extends StObject {
  
  /**
    * The date or dates and time or times, in cron format, when the jobs are to be run.
    */
  var CronExpression: typings.awsSdk.databrewMod.CronExpression = js.native
  
  /**
    * The name or names of one or more jobs to be run.
    */
  var JobNames: js.UndefOr[JobNameList] = js.native
  
  /**
    * A unique name for the schedule.
    */
  var Name: ScheduleName = js.native
  
  /**
    * Metadata tags to apply to this schedule.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateScheduleRequest {
  
  @scala.inline
  def apply(CronExpression: CronExpression, Name: ScheduleName): CreateScheduleRequest = {
    val __obj = js.Dynamic.literal(CronExpression = CronExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleRequest]
  }
  
  @scala.inline
  implicit class CreateScheduleRequestMutableBuilder[Self <: CreateScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNamesUndefined: Self = StObject.set(x, "JobNames", js.undefined)
    
    @scala.inline
    def setJobNamesVarargs(value: JobName*): Self = StObject.set(x, "JobNames", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
