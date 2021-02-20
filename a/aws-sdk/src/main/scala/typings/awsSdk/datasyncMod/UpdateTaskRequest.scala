package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTaskRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.native
  
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example: "/folder1|/folder2"   
    */
  var Excludes: js.UndefOr[FilterList] = js.native
  
  /**
    * The name of the task to update.
    */
  var Name: js.UndefOr[TagValue] = js.native
  
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.native
  
  /**
    * Specifies a schedule used to periodically transfer files from a source to a destination location. You can configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day or hour you want the task to execute. The time you specify is UTC time. For more information, see task-scheduling.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource name of the task to update.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}
object UpdateTaskRequest {
  
  @scala.inline
  def apply(TaskArn: TaskArn): UpdateTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskRequest]
  }
  
  @scala.inline
  implicit class UpdateTaskRequestMutableBuilder[Self <: UpdateTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    @scala.inline
    def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setSchedule(value: TaskSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
  }
}
