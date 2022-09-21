package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource name of the Amazon CloudWatch log group.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  
  /**
    * A list of filter rules that determines which files to exclude from a task. The list should contain a single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2".  
    */
  var Excludes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern contains a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe), for example, "/folder1|/folder2".
    */
  var Includes: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The name of the task to update.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  var Options: js.UndefOr[typings.awsSdk.datasyncMod.Options] = js.undefined
  
  /**
    * Specifies a schedule used to periodically transfer files from a source to a destination location. You can configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day or hour you want the task to execute. The time you specify is UTC time. For more information, see Scheduling your task.
    */
  var Schedule: js.UndefOr[TaskSchedule] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource name of the task to update.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn
}
object UpdateTaskRequest {
  
  inline def apply(TaskArn: TaskArn): UpdateTaskRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTaskRequest]
  }
  
  extension [Self <: UpdateTaskRequest](x: Self) {
    
    inline def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setExcludes(value: FilterList): Self = StObject.set(x, "Excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "Excludes", js.undefined)
    
    inline def setExcludesVarargs(value: FilterRule*): Self = StObject.set(x, "Excludes", js.Array(value*))
    
    inline def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    inline def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value*))
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSchedule(value: TaskSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
  }
}
