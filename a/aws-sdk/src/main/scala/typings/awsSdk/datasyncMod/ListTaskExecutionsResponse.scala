package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTaskExecutionsResponse extends StObject {
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
  
  /**
    * A list of executed tasks.
    */
  var TaskExecutions: js.UndefOr[TaskExecutionList] = js.native
}
object ListTaskExecutionsResponse {
  
  @scala.inline
  def apply(): ListTaskExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsResponse]
  }
  
  @scala.inline
  implicit class ListTaskExecutionsResponseMutableBuilder[Self <: ListTaskExecutionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTaskExecutions(value: TaskExecutionList): Self = StObject.set(x, "TaskExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionsUndefined: Self = StObject.set(x, "TaskExecutions", js.undefined)
    
    @scala.inline
    def setTaskExecutionsVarargs(value: TaskExecutionListEntry*): Self = StObject.set(x, "TaskExecutions", js.Array(value :_*))
  }
}
