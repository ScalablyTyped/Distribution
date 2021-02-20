package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTaskExecutionRequest extends StObject {
  
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe). For example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.native
  
  var OverrideOptions: js.UndefOr[Options] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}
object StartTaskExecutionRequest {
  
  @scala.inline
  def apply(TaskArn: TaskArn): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
  
  @scala.inline
  implicit class StartTaskExecutionRequestMutableBuilder[Self <: StartTaskExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludes(value: FilterList): Self = StObject.set(x, "Includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "Includes", js.undefined)
    
    @scala.inline
    def setIncludesVarargs(value: FilterRule*): Self = StObject.set(x, "Includes", js.Array(value :_*))
    
    @scala.inline
    def setOverrideOptions(value: Options): Self = StObject.set(x, "OverrideOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideOptionsUndefined: Self = StObject.set(x, "OverrideOptions", js.undefined)
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
  }
}
