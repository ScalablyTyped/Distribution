package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTaskExecutionsRequest extends StObject {
  
  /**
    * The maximum number of executed tasks to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.datasyncMod.MaxResults] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin the next list of the executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.datasyncMod.TaskArn] = js.undefined
}
object ListTaskExecutionsRequest {
  
  @scala.inline
  def apply(): ListTaskExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsRequest]
  }
  
  @scala.inline
  implicit class ListTaskExecutionsRequestMutableBuilder[Self <: ListTaskExecutionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
