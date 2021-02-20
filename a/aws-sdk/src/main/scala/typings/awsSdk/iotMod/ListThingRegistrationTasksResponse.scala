package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingRegistrationTasksResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of bulk thing provisioning task IDs.
    */
  var taskIds: js.UndefOr[TaskIdList] = js.native
}
object ListThingRegistrationTasksResponse {
  
  @scala.inline
  def apply(): ListThingRegistrationTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingRegistrationTasksResponse]
  }
  
  @scala.inline
  implicit class ListThingRegistrationTasksResponseMutableBuilder[Self <: ListThingRegistrationTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTaskIds(value: TaskIdList): Self = StObject.set(x, "taskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdsUndefined: Self = StObject.set(x, "taskIds", js.undefined)
    
    @scala.inline
    def setTaskIdsVarargs(value: TaskId*): Self = StObject.set(x, "taskIds", js.Array(value :_*))
  }
}
